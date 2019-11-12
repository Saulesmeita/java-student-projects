package lv.javaguru.lesson7;

public class ForLoopTest {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 9, j = 1; i > 0; i -= j++) {
            sum += i;
            System.out.printf("i=%d j=%d%n", i, j);
        }
    }
}

