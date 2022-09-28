package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число в диапазоне [2 до 100]");
        int target = input.nextInt();
        boolean legalInputReceived = false;
        while (!legalInputReceived) {
            if (target >= 2 && target <= 100) {
                legalInputReceived = true;
            } else {
                System.out.println("Введите число в диапазоне [2 до 100]");
                target = input.nextInt();
            }
        }
        legalInputReceived = false;
        int searchStart = 2, searchEnd = 100;
        int attempt = 51;
        int answer = 0;
        while (searchEnd > searchStart) {
            System.out.println("Число равно " + attempt + " ?");
            while (!legalInputReceived) {
                answer = input.nextInt();
                if (answer == 0 || answer == 1) {
                    legalInputReceived = true;
                } else {
                    System.out.println("Введите: 0 - нет; 1 - да");
                }
            }
            legalInputReceived = false;
            if (answer == 1) {
                System.out.println("Число найдено: " + attempt);
                break;
            } else {
                System.out.println("Число больше " + attempt + " ?");
                while (!legalInputReceived) {
                    answer = input.nextInt();
                    if (answer == 0 || answer == 1) {
                        legalInputReceived = true;
                    } else {
                        System.out.println("Введите: 0 - нет; 1 - да");
                    }
                }
                legalInputReceived = false;
                if (answer == 1) {
                    searchStart = attempt;
                    attempt = (searchStart + searchEnd) / 2 + 1;
                } else {
                    searchEnd = attempt;
                    attempt = (searchStart + searchEnd) / 2;
                }
            }
        }
    }
}
