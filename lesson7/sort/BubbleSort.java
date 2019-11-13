package lv.javaguru.lesson7.sort;

import java.util.Random;

public class BubbleSort {
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
        System.out.println("]");
    }
    public static void swapElements(int[] array, int index1, int index2) {
        int element1 = array[index1];
        int element2 = array[index2];
        array[index2] = element1;
        array[index1] = element2;
    }
    public static void bubbleSort(int[] arr) {
        boolean noChangesMade;
        for(int i = 0; i < arr.length-1; i++) {
            noChangesMade = true;
            for(int j = 1; j < arr.length - i; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (arr[j] < arr[j - 1]) {
                    swapElements(arr, j, j - 1);
                    noChangesMade = false;
                }
                printArray(arr);
            }
            if (noChangesMade) break;
        }
    }
}
