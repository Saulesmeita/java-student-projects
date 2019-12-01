package lv.javaguru.lesson9.liblary;

import lv.javaguru.lesson9.shop.Shop;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Library {

    HashMap<Book, String> library = new HashMap<Book, String>();

    public void addBook(Book book) {
        library.put(book, book.getAuthor());
    }

    public void addBook(String author, String name) {
        Book book = new Book(name, author);
        addBook(book);
    }

    public boolean isInLibrary(Book book) {
        if (library.containsKey(book)) {
            return true;
        }  else {
            System.out.println("The " + book + " not found in the library.");
            return false;
        }
    }

    public void deleteBook(Book book) {
        System.out.println();
        if (isInLibrary(book)) {
            library.remove(book);
            System.out.println("The " + book + " has been successfully deleted from the library.");
        }
    }

    public void deleteBook(String author, String name) {
            deleteBook(new Book(name, author));
    }

    public ArrayList<Book> findByName(String name) {
        ArrayList<Book> rez = new ArrayList<>();
        for (Map.Entry<Book, String> entry : library.entrySet()) {
            if (entry.getKey().getName().equals(name)) {
                rez.add(new Book(entry.getKey().getName(), entry.getValue()));
            }
        }
        return rez;
    }

    public ArrayList<Book> findByAuthor(String author) {
        ArrayList<Book> rez = new ArrayList<>();
        if (library.containsValue(author)) {
            for (Map.Entry<Book, String> entry : library.entrySet()) {
                if (entry.getValue().equals(author)) {
                    rez.add(new Book(entry.getKey().getName(), entry.getValue()));
                }
            }
        }
        return rez;
    }

    public void printRez(ArrayList<Book> books) {
        System.out.println();
        if (books.isEmpty()) {
            System.out.println("Nothing found");
        } else {
            System.out.println(books.size() + (books.size() == 1?" book":" books") + " found:");
            System.out.println(books.toString());
        }
    }

    public void printLibrary() {
        System.out.println();
        if (library.isEmpty()) {
            System.out.println("No books in the library yet. A good time to add some!");
        } else {
            System.out.println("The library contains " + library.size() + (library.size()==1?" book:":" books:"));
            for (Map.Entry<Book, String> entry : library.entrySet()) {
                System.out.println(entry.getKey());
            }
        }
    }
}