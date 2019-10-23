package lv.javaguru.lesson4;

public class QuadraticEquationTest {

    public void test1(double a, double b, double c, boolean expectedHasRoots, int expectedRootsCount, double expectedX1, double expectedX2 ) {

        boolean actualHasRoots;
        int actualRootsCount;
        double actualX1;
        double actualX2;
        boolean passed = false;

        QuadraticEquation victim = new QuadraticEquation(a,b,c);
        victim.findRoots();

        actualHasRoots = victim.isHasRoots();
        actualRootsCount = victim.getRootsCount();
        actualX1 = victim.getX1();
        actualX2 = victim.getX2();

        if (actualHasRoots == expectedHasRoots && actualRootsCount == expectedRootsCount) {

            switch (actualRootsCount) {
                case 1:
                    passed = actualX1 == expectedX1;
                    break;
                case 2:
                    passed = actualX1 == expectedX1 && actualX2 == expectedX2;
                    break;
                default:
                    passed = true;
            }
        }

        if (passed) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test failed");
        }
    }

    public static void main(String[] args) {

        QuadraticEquationTest testOne = new QuadraticEquationTest();

        testOne.test1(5,0,0,true,1,0,0);
        testOne.test1(2,0,8,false,0,0,0);
        testOne.test1(-2,0,-8,false,0,0,0);
        testOne.test1(2,0,-8,true,2,2,-2);
        testOne.test1(-2,0,8,true,2,2,-2);
        testOne.test1(1,2,1,true,1,-1,0);
        testOne.test1(1,1,1,false,0,0,0);
        testOne.test1(1,5,4,true,2,-4,-1);
        testOne.test1(4,16,0,true,2,0,-4);
        testOne.test1(0,12,0,true,1,0,0);
        testOne.test1(0,8,16,true,1,-2,0);
        testOne.test1(0,0,75,false,0,0,0);
        testOne.test1(0,0,0,true,100500,0,0);
    }
}
