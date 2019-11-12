package lv.javaguru.lesson7.palindrome;

import java.util.Arrays;

public class Palindrome {

    public static boolean isPalindrome(String text) {
        int length = text.length();
        char[] symbols = new char[length];
        int index = 0;
        char currentChar;

        for (int i = 0; i < text.length(); i++) {
            currentChar = Character.toLowerCase(text.charAt(i));
            if (Character.isLetter(currentChar)) {
                symbols[index] = currentChar;
                index++;
            } else {
                length--;
            }
        }
        boolean isPalindrome;
        if (length < 2) {
            isPalindrome = false;
        } else {
            isPalindrome = true;
            int half = length / 2;
            length--;
            for (int i = 0; i < half; i++, length--) {
                if (symbols[i] != symbols[length]) {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }
    public static void printAnswer(String text) {
        final String YES = " является палиндромом";
        final String NO = " не является палиндромом";
        System.out.print("Фраза '" + text + "'");
        if (isPalindrome(text)) {
            System.out.println(YES);
        } else {
            System.out.println(NO);
        }
    }
}
