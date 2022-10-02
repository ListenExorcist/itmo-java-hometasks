package hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (i + 1) * 2;
        }
        System.out.println("Array: " + Arrays.toString(array));
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
