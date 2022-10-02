package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        while (true) {
            size = Integer.parseInt(scanner.nextLine());
            if (size <= 0) {
                System.out.println("Неверно введен размер массива");
                System.out.println("Введите размер массива");
            } else {
                break;
            }
        }
        String[] array = new String[size];
        System.out.println("Введите строки для заполнения массива. Введите \"exit\" для выхода");
        String entry;
        for (int i = 0; i < size; i++) {
            entry = scanner.nextLine();
            if (entry.equals("exit")) {
                break;
            }
            for (int j = 0; j < i; j++) {
                if (array[j].equals(entry)) {
                    System.out.println("В массиве уже есть такой элемент. Введите новый");
                    entry = scanner.nextLine();
                    j = -1;
                }
            }
            array[i] = entry;
        }
        System.out.println("Array: " + Arrays.toString(array));
    }
}
