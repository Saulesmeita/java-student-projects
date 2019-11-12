package lv.javaguru.lesson7.palindrome;

public class PalindromeDemo {

    public static void main(String[] args) {

        System.out.println(Palindrome.isPalindrome(" "));
        System.out.println(Palindrome.isPalindrome(",,,"));
        System.out.println(Palindrome.isPalindrome("Ы"));
        System.out.println(Palindrome.isPalindrome("ЫЫ"));
        System.out.println(Palindrome.isPalindrome("OK"));
        System.out.println(Palindrome.isPalindrome("ушу"));
        System.out.println(Palindrome.isPalindrome("deed"));

        Palindrome.printAnswer("Лидер бодро гордо бредил");
        Palindrome.printAnswer("Ешь немытого ты меньше...");
        Palindrome.printAnswer("Was it a car or a cat I saw?");
        Palindrome.printAnswer("Уж не палиндром ли это?");
    }
}
