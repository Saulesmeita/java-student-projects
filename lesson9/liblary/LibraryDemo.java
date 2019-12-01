package lv.javaguru.lesson9.liblary;

public class LibraryDemo {
    public static void main(String[] args) {

        Library library = new Library();

        library.printLibrary();

        library.addBook(new Book("Букварь", "Ирина Иванова"));
        library.addBook(new Book("Азбука", "Ирина Иванова"));
        library.addBook("Лев Толстой", "Анна Каренина");
        Book book1 = new Book("Букварь", "Василий Петров");
        Book book2 = new Book("Азбука", "Василий Петров");
        Book book3 = new Book("Алгебра и начала анализа", "О.Поскрёбышев");
        Book book4 = new Book("Аналитическая геометрия", "О.Поскрёбышев");
        Book book5 = new Book("Библия", "");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.printLibrary();

        library.printRez(library.findByAuthor("Лев Толстой"));
        library.printRez(library.findByAuthor("О.Поскрёбышев"));

        library.printRez(library.findByName("Азбука"));

        library.deleteBook(book1);
        library.deleteBook("Ирина Иванова", "Букварь");

        library.printLibrary();
    }
}
