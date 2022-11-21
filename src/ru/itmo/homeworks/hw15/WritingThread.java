package ru.itmo.homeworks.hw15;

import java.io.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class WritingThread extends Thread {
    private CopyOnWriteArrayList<String> strings;
    private File file;

    public WritingThread(CopyOnWriteArrayList<String> strings) {
        this.strings = strings;
        file = new File("hw15.txt");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String minString = strings.stream().min((s1, s2) -> s1.length() - s2.length()).get();
        try (FileWriter fW = new FileWriter(file);
             BufferedWriter bW = new BufferedWriter(fW)) {
            bW.write(minString);
            System.out.println("Строка " + minString + " записана в файл");
            strings.remove(minString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
