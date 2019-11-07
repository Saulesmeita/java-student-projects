package lv.javaguru.lesson6.numberservice;

public class NumberServiceDemo {

    public static void main(String[] args) {

        NumberService ns = new NumberService();

        System.out.println(ns.rangeSum(5, 8)); //26
        System.out.println(ns.rangeSum(-5, -8)); //-26
        System.out.println(ns.rangeSum(5, 3)); //12
        System.out.println(ns.rangeSum(3, 5)); //12
        System.out.println(ns.rangeSum(0, 10)); //55
        System.out.println(ns.rangeSum(10, 0)); //55
        System.out.println(ns.rangeSum(-5, 5)); //0
        System.out.println(ns.rangeSum(3, 3)); //3
        System.out.println(ns.rangeSum(0, 0)); //0
        System.out.println();

        System.out.println(ns.rangeEvenCount(4, 8)); //3
        System.out.println(ns.rangeEvenCount(10, 4)); //4
        System.out.println(ns.rangeEvenCount(4, 9)); //3
        System.out.println(ns.rangeEvenCount(11, 4)); //4
        System.out.println(ns.rangeEvenCount(3, 8)); //3
        System.out.println(ns.rangeEvenCount(3, 9)); //3
        System.out.println(ns.rangeEvenCount(0, 8)); //4
        System.out.println(ns.rangeEvenCount(-4, -8)); //3
        System.out.println(ns.rangeEvenCount(-4, -9)); //3
        System.out.println(ns.rangeEvenCount(4, 0)); //2
        System.out.println(ns.rangeEvenCount(4, -4)); //4
        System.out.println(ns.rangeEvenCount(0, 0)); //0
        System.out.println(ns.rangeEvenCount(2, 2)); //1
        System.out.println(ns.rangeEvenCount(4, 3)); //1
        System.out.println(ns.rangeEvenCount(-3, -3)); //0
        System.out.println(ns.rangeEvenCount(2, 2)); //1
        System.out.println();

        System.out.println(ns.rangeEvenCount1(4, 8)); //3
        System.out.println(ns.rangeEvenCount1(10, 4)); //4
        System.out.println(ns.rangeEvenCount1(4, 9)); //3
        System.out.println(ns.rangeEvenCount1(11, 4)); //4
        System.out.println(ns.rangeEvenCount1(3, 8)); //3
        System.out.println(ns.rangeEvenCount1(3, 9)); //3
        System.out.println(ns.rangeEvenCount1(0, 8)); //4
        System.out.println(ns.rangeEvenCount1(-4, -8)); //3
        System.out.println(ns.rangeEvenCount1(-4, -9)); //3
        System.out.println(ns.rangeEvenCount1(4, 0)); //2
        System.out.println(ns.rangeEvenCount1(4, -4)); //4
        System.out.println(ns.rangeEvenCount1(0, 0)); //0
        System.out.println(ns.rangeEvenCount1(2, 2)); //1
        System.out.println(ns.rangeEvenCount1(4, 3)); //1
        System.out.println(ns.rangeEvenCount1(-3, -3)); //0
        System.out.println(ns.rangeEvenCount1(2, 2)); //1
    }
}
