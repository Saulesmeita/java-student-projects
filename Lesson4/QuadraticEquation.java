package lv.javaguru.lesson4;

public class QuadraticEquation {

    private double a, b, c;
    private double x1, x2;
    private boolean hasRoots;
    private int rootsCount;

    private final int INFINITY = 100500;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public boolean isHasRoots() {
        return hasRoots;
    }

    public int getRootsCount() {
        return rootsCount;
    }

    double discriminant() {
        return b * b - 4 * a * c;
    }

    public void findRoots() {

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    hasRoots = true;
                    rootsCount = INFINITY;
                } else {
                    hasRoots = false;
                    rootsCount = 0;
                }
            } else {
                if (c == 0) {
                    hasRoots = true;
                    rootsCount = 1;
                    x1 = 0;
                } else {
                    hasRoots = true;
                    rootsCount = 1;
                    x1 = -(c / b);
                }
            }
        } else {
            if (b == 0) {
                if (c == 0) {
                    hasRoots = true;
                    rootsCount = 1;
                    x1 = 0;
                } else {
                    if (c/a > 0) {
                        hasRoots = false;
                        rootsCount = 0;
                    } else {
                        hasRoots = true;
                        rootsCount = 2;
                        x1 = Math.sqrt(-c / a);
                        x2 = -Math.sqrt(-c / a);
                    }
                }
            } else {
                if (c == 0) {
                    hasRoots = true;
                    rootsCount = 2;
                    x1 = 0;
                    x2 = -b / a;
                } else {
                    double D = discriminant();
                    if (D == 0) {
                        hasRoots = true;
                        rootsCount = 1;
                        x1 = -(b / (2 * a));
                    } else if (D > 0) {
                        hasRoots = true;
                        rootsCount = 2;
                        x1 = -(b + Math.sqrt(D)) / (2 * a);
                        x2 = -(b - Math.sqrt(D)) / (2 * a);
                    } else {
                        hasRoots = false;
                        rootsCount = 0;
                    }
                }
            }
        }
    }

    public void printRoots() {

        findRoots();

        if (hasRoots) {

            switch (rootsCount) {
            case 1:
                System.out.println("x" + " = " + x1);
                break;
            case 2:
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
                break;
            case INFINITY:
                System.out.println("Not a quadratic equation. Any x can do...");
            }
        } else {
            System.out.println("Roots do not exist");
        }
    }
}
