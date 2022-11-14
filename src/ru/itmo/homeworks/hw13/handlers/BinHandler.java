package ru.itmo.homeworks.hw13.handlers;

import java.io.*;

public class BinHandler<T> {
    private File file;

    public BinHandler() {
        file = new File("hw13.bin");
    }

    public void writeToFile(T object) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public T readFromFile() {
        Object result = null;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            result = objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return (T) result;
    }
}
