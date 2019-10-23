package lv.javaguru.lesson3;

import java.util.Scanner;

public class EncoderDemo {

    public static void main(String[] args) {

        int code;
        char character;

        Encoder myEncoder = new Encoder();

        Scanner userInput = new Scanner(System.in);

        int work;

        System.out.println("Программа Энкодер преобразует символы Юникода в натуральные числа от 0 до 65535 и наоборот.");

        do {
            System.out.println();
            System.out.println("Введите целое число от 0 до 65535 или символ:");

            if (userInput.hasNextInt()) {
                code = userInput.nextInt();
                myEncoder.printSymbol(code);
            } else if (userInput.hasNextLine()) {
                character = userInput.next().charAt(0);
                myEncoder.printSymbol(character);
            }
            System.out.println("Нажмите 1, чтобы продолжить, и 0, чтобы выйти из программы:");
            work = userInput.nextInt();
        } while (work != 0);

    }
}
