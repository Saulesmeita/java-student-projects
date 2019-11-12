package lv.javaguru.lesson7.arrayservice;

import java.util.Random;

public class ArrayService {

    public static int[] create(int size) {
        return new int[size];
    }

    public static void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public static void printArray(int[] array) {
        System.out.println();
        System.out.print("[ ");
        for (int member : array) {
            System.out.print(member + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static int sum(int[] array) {
        int sum = 0;
        if (array.length == 0) {
            System.out.println("Empty array!");
        } else {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static double avg(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            return (double) sum(array) / array.length;
        }
    }
    public static int indexOfMin(int[] array, int index) {
        int min = array[index];
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void sort(int[] array) {
        int indexMin;
        for (int i = 0; i < array.length - 1; i++) {
            indexMin = indexOfMin(array, i);
            if (indexMin != i) {
                exchangeElements(array, i, indexMin);
            }
        }
    }
    public static void exchangeElements(int[] array, int index1, int index2) {
        int element1 = array[index1];
        int element2 = array[index2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element1) {
                index1 = i;
            }
            if (array[i] == element2) {
                index2 = i;
            }
        }
        array[index2] = element1;
        array[index1] = element2;
    }
    public static void swap(int[] array) {
        int half = array.length / 2;
        int a;
        for (int i = 0; i < half; i++) {
            a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i -1] = a;
        }
    }

    public static void printArrayWithProperties(int[] array) {
        if (array.length == 0) {
            System.out.println("Empty array!");
        } else {
            printArray(array);
            System.out.println("Sum of the array = " + sum(array));
            System.out.println("Average of the array = " + avg(array));
        }
    }
}
