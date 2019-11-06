package lv.javaguru.lesson6;

import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Программа выводит на экран все положительные чётные числа от 2 до выбранного вами числа.");
        System.out.println("Введите число, до которого выводим ряд:");

        int rightBorder = userInput.nextInt();

        for (int i=2; i <= rightBorder; i += 2) {
            System.out.println(i);
        }

        System.out.println("Теперь распечатаем все положительные числа, кратные трём, до выбранного вами числа.");
        System.out.println("Введите число, до которого выводим ряд:");

        rightBorder = userInput.nextInt();
        int i = 3;

        do {
            System.out.println(i);
            i+=3;
        } while (i <= rightBorder);

        System.out.println("Распечатаем первые 15 чисел Фибоначчи:");

        int fibo = 1;
        int fiboNext = 1;
        int fiboHelper;

        for (i = 1; i <= 15; i++) {
            System.out.print(fibo + "  ");
            fiboHelper = fibo + fiboNext;
            fibo = fiboNext;
            fiboNext = fiboHelper;
        }
        System.out.println();
        System.out.println("Распечатаем последовательность '2 -2 4 -4 ....");
        System.out.println("Введите границу ряда");

        rightBorder = userInput.nextInt();

        rightBorder = Math.abs(rightBorder);

        i = 2;
        int minusI;

        while (i <= rightBorder) {
            minusI = -i;
            System.out.print(i + " " + minusI + " ");
            i += 2;
        }

        System.out.println();
        System.out.println("Печатаем числовой ряд с шагом 2 и 3");

        int j = 1;
        for (i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
            if (j%2 == 0) {
                i++;
            }
            j++;
        }
        System.out.println();
        System.out.println("Находим сумму первых 100 чётных чисел:");

        i = 2;
        int sum = 2;
        int number = 2;
        while (i <= 100) {
            number += 2;
            sum += number;
            i++;
        }
        System.out.println(sum);

        System.out.println("Сумма первых 10 чисел Фибоначчи");

        fibo = 1;
        fiboNext = 1;
        sum = fibo;

        for (i = 1; i < 10; i++) {
            sum = sum + fiboNext;
            fiboHelper = fibo + fiboNext;
            fibo = fiboNext;
            fiboNext = fiboHelper;
        }
        System.out.println(sum);

        System.out.println("Посчитаем сумму цифр числа");
        System.out.println("Введите число: ");
        int userNumber = userInput.nextInt();
        sum = 0;
        do {
            sum += userNumber % 10;
            userNumber = userNumber / 10;
        } while (userNumber !=0);
        System.out.println(sum);

        System.out.println("Простое ли число?");
        System.out.println("Введите число: ");
        userNumber = userInput.nextInt();
        int radix = (int) Math.sqrt(userNumber);
        boolean isPrime = true;

        for (i = 2; i <= radix && isPrime; i++) {
            if (userNumber%i == 0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime);
    }
}
