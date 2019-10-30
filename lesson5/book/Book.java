package lv.javaguru.lesson5.book;

import lv.javaguru.lesson5.human.Human;

import java.util.Objects;

public class Book {

    private String author;
    private String title;
    private int pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public boolean equals(Object otherBook) {
        if (this == otherBook) return true;
        if (otherBook == null || getClass() != otherBook.getClass()) return false;
        Book other = (Book) otherBook;
        if (Objects.equals(this.getAuthor(), other.getAuthor())
                && Objects.equals(this.getTitle(), other.getTitle())
                && Objects.equals(this.getPages(), other.getPages())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Book {Author = '%s', Title = '%s', page count = %d}",
              this.getAuthor(), this.getTitle(), this.getPages());
    }
}
