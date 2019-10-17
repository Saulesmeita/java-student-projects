package lv.javaguru.lesson3;

public class Encoder {

    public void printSymbol(char character) {

        int code = (int) character;
        System.out.println(character + " => " + code);
    }

    public void printSymbol(int code) {

        char character = (char) code;
        System.out.println(code + " => " + character);
    }

}
