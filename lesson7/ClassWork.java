package lv.javaguru.lesson7;

import java.util.Arrays;
import java.util.Random;

public class ClassWork {

    public static int arrayMax(int arr[]) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double arrayAverage(int[] arr) {
        double mid = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mid += arr[i];
        }
        mid = mid/arr.length;
        return mid;
    }

    public static void main(String[] args) {

        int myIntArray[] = {45, 88, 32, 18, -3, 0};

        int max = myIntArray[0];

        for (int i = 1; i < myIntArray.length; i++) {
            if (myIntArray[i] > max) {
                max = myIntArray[i];
            }
        }
        System.out.println(max);

        Random randomNumber = new Random();
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = randomNumber.nextInt(10);
        }

        System.out.println(Arrays.toString(myIntArray));

        //среднее арифметическое массива

        double mid = myIntArray[0];
        for (int i = 1; i < myIntArray.length; i++) {
            mid += myIntArray[i];
        }
        mid = mid/myIntArray.length;

        System.out.printf("Среднее арифметическое массива = %.2f", mid);
        System.out.println();

        //Сумма чётных положительных значений массива

        int myIntArray2[] = {21, 76, -44, 32, -6, 0, 89, 100};
        System.out.println("Новый массив:");
        System.out.println(Arrays.toString(myIntArray2));

        int sumOfEvenPositive = 0;
        for (int i = 0; i < myIntArray2.length; i++) {
            if (myIntArray2[i] % 2 == 0 && myIntArray2[i] > 0) {
                sumOfEvenPositive += myIntArray2[i];
            }
        }
            System.out.println("Сумма всех чётных положительных элементов массива = " + sumOfEvenPositive);
            System.out.println();

        //Найти два максимальных элемента массива

        int max2 = 0;
        max = arrayMax(myIntArray2);
        for (int i = 0; i < myIntArray2.length; i++) {
            if (myIntArray2[i] != max) {
                max2 = myIntArray2[i];
                break;
            }
        }

        for (int i = 0; i < myIntArray2.length; i++) {
            if (myIntArray2[i] != max && myIntArray2[i] > max2) {
                max2 = myIntArray2[i];
            }
        }
        System.out.println(max + "  " + max2);
        System.out.println();

        //Поменять местами минимальный и максимальный элементы массива

        int indexOfMax = 0;
        int indexOfMin = 0;
        int min;

        System.out.println(Arrays.toString(myIntArray));
        max = arrayMax(myIntArray);
        min = arrayMin(myIntArray);
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] == min) {
                indexOfMin = i;
            }
            if (myIntArray[i] == max) {
                indexOfMax = i;
            }
        }
        myIntArray[indexOfMax] = min;
        myIntArray[indexOfMin] = max;
        System.out.println("Результат замены:");
        System.out.println(Arrays.toString(myIntArray));

        // Вывести все значения, которые больше среднего

        mid = arrayAverage(myIntArray);

        System.out.println();
        System.out.printf("Среднее арифметическое массива = %.2f", mid);
        System.out.println();
        System.out.println("Все элементы массива, которые больше среднего арифметического: ");
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] > mid) {
                System.out.print(myIntArray[i] + " ");
            }
        }
        System.out.println();

        // Какое число встречается чаще всего

        int[] repeatsArr = new int[myIntArray.length];
        for (int i = 0; i < myIntArray.length; i++){
            for (int j = i; j < myIntArray.length; j++) {
                if (myIntArray[j] == myIntArray[i]) {
                    repeatsArr[i]++;
                }
            }
        }
        int maxRepeats = arrayMax(repeatsArr);
        for (int i = 0; i < repeatsArr.length; i++) {
            if (repeatsArr[i] == maxRepeats) {
                System.out.println("Чаще всего повторяется число " + myIntArray[i]);
            }
        }
        // Перевернуть массив

        System.out.println();
        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(myIntArray));
        int half = myIntArray.length / 2;
        int a;
        for (int i = 0; i < half; i++) {
            a = myIntArray[i];
            myIntArray[i] = myIntArray[myIntArray.length - i - 1];
            myIntArray[myIntArray.length - i -1] = a;
        }
        System.out.println("Массив после переворачивания:");
        System.out.println(Arrays.toString(myIntArray));

        // Найти все дубликаты в массиве





    }
}
