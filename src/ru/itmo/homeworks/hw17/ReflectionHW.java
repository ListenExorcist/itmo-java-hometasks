package ru.itmo.homeworks.hw17;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class ReflectionHW {
    public static void main(String[] args) {
        Book book = new Book("Title", 100, new Author("FirstName", "LastName"), new String[]{"Liberty", "Pulitzer"});
        reflectionToString(book);
    }

    public static void reflectionToString(Object object) {
        if (object == null) {
            System.out.println("null");
            return;
        }
        Class<?> objectClass = object.getClass();
        if (objectClass.equals(String.class) ||
                objectClass.equals(Character.class) ||
                objectClass.equals(Boolean.class) ||
                objectClass.equals(Float.class) ||
                objectClass.equals(Double.class) ||
                objectClass.equals(Byte.class) ||
                objectClass.equals(Short.class) ||
                objectClass.equals(Integer.class) ||
                objectClass.equals(Long.class)) {
            System.out.println(object);
            return;
        }
            System.out.println(objectClass.getSimpleName() + '{');
        Field[] fields = objectClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getType().equals(boolean.class) ||
                    field.getType().equals(char.class) ||
                    field.getType().equals(float.class) ||
                    field.getType().equals(double.class) ||
                    field.getType().equals(byte.class) ||
                    field.getType().equals(short.class) ||
                    field.getType().equals(int.class) ||
                    field.getType().equals(long.class) ||
                    field.getType().equals(String.class) ||
                    field.getType().equals(Boolean.class) ||
                    field.getType().equals(Character.class) ||
                    field.getType().equals(Float.class) ||
                    field.getType().equals(Double.class) ||
                    field.getType().equals(Byte.class) ||
                    field.getType().equals(Short.class) ||
                    field.getType().equals(Integer.class) ||
                    field.getType().equals(Long.class)) {
                try {
                    System.out.println(field.getName() + " - " + field.get(object));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else if (field.getType().isArray()) {
                System.out.println(field.getName() + " - [");
                try {
                    for (int i = 0; i < Array.getLength(field.get(object)); i++) {
                        reflectionToString(Array.get(field.get(object), i));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                System.out.println("]");
            } else {
                try {
                    System.out.print(field.getName() + " - ");
                    reflectionToString(field.get(object));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            field.setAccessible(false);
        }
        System.out.println('}');
    }
}

