package lv.javaguru.lesson4;

public class QuadraticEquationDemo {

    public static void main(String[] args) {

        QuadraticEquation equation = new QuadraticEquation(0,0,0);
        equation.printRoots();
        QuadraticEquation equation1 = new QuadraticEquation(25,0,0);
        equation1.printRoots();
        QuadraticEquation equation2 = new QuadraticEquation(0,8,8);
        equation2.printRoots();
        QuadraticEquation equation3 = new QuadraticEquation(36,5,1);
        equation3.printRoots();
        QuadraticEquation equation4 = new QuadraticEquation(0,0,1);
        equation4.printRoots();
        QuadraticEquation equation5 = new QuadraticEquation(0,5,0);
        equation5.printRoots();
        QuadraticEquation equation6 = new QuadraticEquation(36,0,1);
        equation6.printRoots();
        QuadraticEquation equation7 = new QuadraticEquation(36,5,0);
        equation7.printRoots();
    }
}
