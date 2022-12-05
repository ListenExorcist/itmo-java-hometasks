package ru.itmo.homeworks.hw17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class AnnotationHW {
    public static void main(String[] args) {
        Cat snowball = (Cat) getInstance(Cat.class);
        if (snowball != null) {
            System.out.println(snowball.getName());
            System.out.println(snowball.getAge());
        }
    }

    public static Object getInstance(Class<?> cls) {
        if (cls.isAnnotationPresent(Config.class)) {
            Config config = cls.getDeclaredAnnotation(Config.class);
            try (InputStream iS = new FileInputStream(config.configFile())) {
                Constructor<?> constructor = cls.getDeclaredConstructor();
                Object result = constructor.newInstance();
                Field[] fields = cls.getDeclaredFields();
                Properties properties = new Properties();
                properties.load(iS);
                for (Field field : fields) {
                    if (field.isAnnotationPresent(Required.class)) {
                        field.setAccessible(true);
                        if (field.getType().equals(String.class) || field.getType().equals(char.class) || field.getType().equals(Character.class)) {
                            field.set(result, properties.getProperty(field.getName()));
                        } else if (field.getType().equals(boolean.class) || field.getType().equals(Boolean.class)) {
                            field.set(result, Boolean.parseBoolean(properties.getProperty(field.getName())));
                        } else if (field.getType().equals(byte.class) || field.getType().equals(Byte.class)) {
                            field.set(result, Byte.parseByte(properties.getProperty(field.getName())));
                        } else if (field.getType().equals(short.class) || field.getType().equals(Short.class)) {
                            field.set(result, Short.parseShort(properties.getProperty(field.getName())));
                        } else if (field.getType().equals(int.class) || field.getType().equals(Integer.class)) {
                            field.set(result, Integer.parseInt(properties.getProperty(field.getName())));
                        } else if (field.getType().equals(long.class) || field.getType().equals(Long.class)) {
                            field.set(result, Long.parseLong(properties.getProperty(field.getName())));
                        } else if (field.getType().equals(float.class) || field.getType().equals(Float.class)) {
                            field.set(result, Float.parseFloat(properties.getProperty(field.getName())));
                        } else if (field.getType().equals(double.class) || field.getType().equals(Double.class)) {
                            field.set(result, Double.parseDouble(properties.getProperty(field.getName())));
                        }
                        field.setAccessible(false);
                    }
                }
                return result;
            } catch (IOException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
