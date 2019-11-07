package lv.javaguru.lesson6.numberservice;

public class NumberService {

    public int rangeSum(int start, int finish) {

        int sum = 0;
        if (start > finish) {
            do {
                sum += start;
                start--;
            } while (start >= finish);
        } else {
            do {
                sum += start;
                start++;
            } while (start <= finish);
        }
        return sum;
    }

    public int rangeEvenCount(int start, int finish) {

        int count = 0;
        if (start > finish) {
            do {
                if (start % 2 == 0 && start != 0) count++;
                start--;
            } while (start >= finish);
        } else {
            do {
                if (start % 2 == 0 && start != 0) count++;
                start++;
            } while (start <= finish);
        }
        return count;
    }
    public int rangeEvenCount1(int start, int finish) {

        int count = 0;

        if (start > finish) {
            if (start % 2 != 0) start--;
            while (start >= finish) {
                if (start != 0) count++;
                start -= 2;
            }
        } else {
            if (start % 2 != 0) start++;
            while (start <= finish) {
                if (start != 0) count++;
                start += 2;
            }
        }
        return count;
    }
}
