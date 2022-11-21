package ru.itmo.homeworks.hw15;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Application {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
        ReadingThread readingThread = new ReadingThread(strings);
        WritingThread writingThread = new WritingThread(strings);
        readingThread.start();
        writingThread.start();
        try {
            readingThread.join();
            writingThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Коллекция:");
        System.out.println(strings);
        System.out.println("Строка в файле:");
        File file = new File("hw15.txt");
        try {
            Scanner scanner = new Scanner(file);
            String fileString = scanner.nextLine();
            System.out.println(fileString);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
