package lv.javaguru.lesson6;

public class PrimeNumbers {

    public static void primeNumbers() {

        int count = 0;
        int sum = 0;
        boolean isPrime;
        int radix;

        for (int i = 2; i <= 500; i++) {
            if (i == 17 || i == 71) continue;
            isPrime = true;
            radix = (int) Math.sqrt(i);
            for (int j = 2; j <= radix && isPrime; j++) {
                if (i%j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
                sum += i;
                System.out.print(i + " ");
            }
            if (count == 50) break;
        }
        System.out.println();
        System.out.println("Количество простых чисел = " + count + ", сумма = " + sum + ".");
    }

    public static void main(String[] args) {

        primeNumbers();
    }
}
