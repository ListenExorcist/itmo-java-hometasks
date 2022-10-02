package hw5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {0, -1, 2, -3, 4, -5, 6, -7, 8, -9, 10};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В исходном массиве нет отрицательных элементов");
        } else {
            int[] newArray = new int[count];
            count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    newArray[count] = array[i];
                    count++;
                }
            }
            System.out.println("Новый массив: " + Arrays.toString(newArray));
        }
    }
}
