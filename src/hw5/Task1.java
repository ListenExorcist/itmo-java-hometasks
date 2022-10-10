package hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 0x100000000L - 0x80000000L);
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
            average += array[i];
        }
        average /= array.length;
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Max value: " + maxValue);
        System.out.println("Min value: " + minValue);
        System.out.println("Average value: " + average);
    }
}
