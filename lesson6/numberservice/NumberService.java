package lv.javaguru.lesson6.numberservice;

public class NumberService {

    public int rangeSum(int start, int finish) {

        int sum = 0;
        int i = start;
        if (start > finish) {
            do {
                sum += i;
                i--;
            } while (i >= finish);
        } else {
            do {
                sum += i;
                i++;
            } while (i <= finish);
        }
        return sum;
    }

    public int rangeEvenCount(int start, int finish) {

        int count = 0;
        int i = start;
        if (start > finish) {
            do {
                if (i%2 == 0 && i!=0) count++;
                i--;
            } while (i >= finish);
        } else {
            do {
                if (i % 2 == 0 && i != 0) count++;
                i++;
            } while (i <= finish);
        }
        return count;
    }
    public int rangeEvenCount1(int start, int finish) {

        int count = 0;
        int i = start;

        if (start > finish) {
            if (start%2 != 0) i--;
                do {
                    if (i != 0) count++;
                    i -= 2;
                } while (i >= finish);
        } else {
            if (start%2 != 0) i++;
            do {
                if (i != 0) count++;
                i += 2;
            } while (i <= finish);
        }
        return count;
    }
}
