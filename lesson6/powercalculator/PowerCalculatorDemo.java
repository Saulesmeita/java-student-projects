package lv.javaguru.lesson6.powercalculator;

public class PowerCalculatorDemo {

    public static void main(String[] args) {

        PowerCalculator calc = new PowerCalculator();

        System.out.println(calc.powerCalc(0,0)); // 1
        System.out.println(calc.powerCalc(0,9)); // 0
        System.out.println(calc.powerCalc(1,1)); // 1
        System.out.println(calc.powerCalc(1,21)); // 1
        System.out.println(calc.powerCalc(1,-3)); // 1
        System.out.println(calc.powerCalc(1,-1)); // 1
        System.out.println(calc.powerCalc(-1,1)); // -1
        System.out.println(calc.powerCalc(-1,2)); // 1
        System.out.println(calc.powerCalc(-1,3)); // -1
        System.out.println(calc.powerCalc(-1,100)); // 1
        System.out.println(calc.powerCalc(7,0)); // 1
        System.out.println(calc.powerCalc(2,10)); // 1024
        System.out.println(calc.powerCalc(-2,10)); // 1024
        System.out.println(calc.powerCalc(-3,3)); // -27
        System.out.println(calc.powerCalc(2,-2)); // 0,25
        System.out.println(calc.powerCalc(-2,-2)); // 0,25
        System.out.println(calc.powerCalc(-2,-3)); // -0,125
        System.out.println(calc.powerCalc(0.5,1)); // 0.5
        System.out.println(calc.powerCalc(0.5,2)); // 0.25
        System.out.println(calc.powerCalc(0.5,-2)); // 4
    }
}

