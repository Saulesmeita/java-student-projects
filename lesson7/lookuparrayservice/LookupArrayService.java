package lv.javaguru.lesson7.lookuparrayservice;

import java.util.Arrays;
import java.util.Random;

public class LookupArrayService {

    public static int findMax(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            int max = array[0];
            for (int member : array) {
                if (member > max) {
                    max = member;
                }
            }
            return max;
        }
    }
    public static int findMin(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            int min = array[0];
            for (int member : array) {
                if (member < min) {
                    min = member;
                }
            }
            return min;
        }
    }
    public static int indexOfMax(int[] array) {
        if (array.length == 0) {
            return -1;
        } else {
            int max = array[0];
            int index = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    index = i;
                }
            }
            return index;
        }
    }
    public static int indexOfMin(int[] array) {
        if (array.length == 0) {
            return -1;
        } else {
            int min = array[0];
            int index = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index = i;
                }
            }
            return index;
        }
    }
    public static int indexOf(int[] array, int value) {
        int index = -2;
        if (array.length == 0) {
            index = -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
    public static void printArr(int[] array) {
        if (array.length == 0) {
            System.out.println("Массив пустой");
        } else {
            System.out.println(Arrays.toString(array));
        }
    }
    public static void printMin(int[] array) {
        int min = findMin(array);
        int index = indexOfMin(array);
        if (index == -1) {
            System.out.println("Массив пустой");
        } else {
            System.out.printf("Минимальное число массива - %d, индекс минимума - %d%n", min, index);
        }
    }
    public static void printMax(int[] array) {
        int max = findMax(array);
        int index = indexOfMax(array);
        if (index == -1) {
            System.out.println("Массив пустой");
        } else {
            System.out.printf("Максимальное число массива - %d, индекс максимума - %d%n", max, index);
        }
    }
    public static void printIndexOf(int[] array, int value) {
        int index = indexOf(array, value);
        if (index == -2) {
            System.out.printf("Число %d в массиве не найдено %n", value);
        } else if (index == -1) {
            System.out.println("Массив пустой");
        } else {
            System.out.printf("Число %d находится в массиве на позиции %d%n", value, index);
        }
    }
    public static int[] createArray(int length, int valueUpperLim) {
        int[] arr = new int[length];
        valueUpperLim++;
        Random randomNumber = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = randomNumber.nextInt(valueUpperLim);
        }
        return arr;
    }
}
