package lv.javaguru.lesson10.repository;

public class BookRepositoryDemo {

    public static void main(String[] args) {


        BookRepository myBookShelf = new BookRepository();

      System.out.println(myBookShelf.findAll());

        myBookShelf.save(new Book("0001", "Букварь", "Ирина Иванова", 99));
        myBookShelf.save(new Book("0002", "Азбука", "Ирина Иванова", 105));
        myBookShelf.save(new Book("0003", "Анна Каренина","Лев Толстой", 356));

        System.out.println(myBookShelf.findAll());

        myBookShelf.deleteAndPrint("0005");
        myBookShelf.deleteAndPrint("0001");

        System.out.println(myBookShelf.findAll());

    }
}
