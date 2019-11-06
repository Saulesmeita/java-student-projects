package lv.javaguru.lesson6;

public class OddChecker {

    public static void forOddChecker(int lowerLimit, int upperLimit) {

        for (int i = lowerLimit; i <= upperLimit; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void whileOddChecker(int lowerLimit, int upperLimit) {

        int i = lowerLimit;
        while (i <= upperLimit) {
            System.out.print(i + ", ");
            i += 2;
        }
        System.out.println();
    }

    public static void doWhileOddChecker(int lowerLimit, int upperLimit) {

        int i = lowerLimit;
        do {
            System.out.print(i + ", ");
            i += 2;
        } while (i <= upperLimit);
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Печатаем все нечётные числа в диапазоне [1;50], ипользуя три разных оператора цикла.");
        System.out.println("При помощи цикла for:");
        forOddChecker(1,50);
        System.out.println("При помощи цикла while:");
        whileOddChecker(1,50);
        System.out.println("При помощи цикла do while:");
        doWhileOddChecker(1,50);
    }
}
