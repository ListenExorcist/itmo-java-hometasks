package hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = (int) (Math.random() * 9 + 1);
        int attempt;
        System.out.println("Введите число в диапазоне [1;9] или 0 для выхода");
        while (true) {
            attempt = input.nextInt();
            if (attempt < 0 || attempt > 9) {
                System.out.println("Введите число в диапазоне [1;9] или 0 для выхода");
            } else if (attempt == 0) {
                System.out.println("Выход из программы");
                break;
            } else if (attempt > target) {
                System.out.println("Загаданное число меньше");
            } else if (attempt < target) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Вы угадали");
                break;
            }
        }
    }
}
