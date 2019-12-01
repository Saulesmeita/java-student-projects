package lv.javaguru.lesson9.liblary;

import java.util.Objects;

public class Book {

    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getName().equals(book.getName()) &&
                getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor());
    }

    @Override
    public String toString() {
        return "Book{" +
                " name = '" + name + '\'' +
                ", author = '" + author + '\'' +
                '}';
    }
}
