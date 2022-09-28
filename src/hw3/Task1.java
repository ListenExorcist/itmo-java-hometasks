package hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество тарелок");
        int plates = input.nextInt();
        System.out.println("Введите количество моющего средства");
        double soap = input.nextDouble();
        if (plates < 0 || soap < 0) {
            System.out.println("Ошибка");
        } else if (plates == 0) {
            System.out.println("Тарелок осталось: " + plates);
            System.out.println("Моющего средства осталось: " + soap);
        } else {
            while (plates > 0) {
                if (soap - 0.5 < 0) {
                    break;
                }
                soap -= 0.5;
                System.out.println("Моющего средства осталось: " + soap);
                plates--;
            }
            System.out.println();
            System.out.println();
            System.out.println("Тарелок осталось: " + plates);
            System.out.println("Моющего средства осталось: " + soap);
        }

    }
}
