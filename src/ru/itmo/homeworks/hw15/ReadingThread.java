package ru.itmo.homeworks.hw15;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class ReadingThread extends Thread {
    private CopyOnWriteArrayList<String> strings;

    public ReadingThread(CopyOnWriteArrayList<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные. Введите \"exit\" для выхода");
        while (true) {
            String string = scanner.nextLine();
            if (string.equalsIgnoreCase("exit")) {
                break;
            }
            strings.add(string);
            System.out.println("Строка " + string + " добавлена в коллекцию");
        }
    }
}
