package lv.javaguru.lesson7.copy;

import java.util.Arrays;

public class CopyDemo {

    public static void main(String[] args) {

        int[] a1 = {40, 75, 23, 36, 87, 95, 54, 11, 62};
        Copy c = new Copy();
        int[] out = c.copyInRange(a1, 30, 75);
        System.out.println(Arrays.toString(out)); //[40, 75, 36, 54, 62]
    }
}
