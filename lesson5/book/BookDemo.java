package lv.javaguru.lesson5.book;

public class BookDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", 315);
        Book book2 = new Book("Mary Shelley", "Frankenstein", 222);
        Book book3 = new Book("Ray Bradbury", "Fahrenheit 451", 178);
        Book book4 = book1;
        Book book5 = new Book("Mary Shelley", "Frankenstein", 222);
        Book book6 = new Book("Mary Shelley", "Frankenstein", 300);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("Book 1. Author = " + book1.getAuthor());
        System.out.println("Book 1. Title = " + book1.getTitle());
        System.out.println("Book1. Page count = " + book1.getPages());

        System.out.println(book1.equals(book4));
        System.out.println(book2.equals(book5));
        System.out.println(book2.equals(book6));

        book1.setTitle("Through the Looking Glass");
        book1.setPages(345);

        System.out.println(book1.equals(book4));
        System.out.println(book4);

        book4.setTitle("Jabberwocky");
        book4.setPages(55);

        System.out.println(book1);

    }
}
