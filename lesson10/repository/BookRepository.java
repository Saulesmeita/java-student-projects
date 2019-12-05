package lv.javaguru.lesson10.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {

    HashMap<String, Book> bookRepository = new HashMap<String, Book>();

    @Override
    public List<Book> findAll() {
        List<Book> allRecords = new ArrayList<>();
        for (Map.Entry<String, Book> mapEntry : bookRepository.entrySet()) {
            allRecords.add(mapEntry.getValue());
        }
        return allRecords;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        if (!bookRepository.containsKey(id)) {
            throw new ItemNotFoundException("The item " + id + " was not found in the repository!");
        }
        return bookRepository.get(id);
    }

    @Override
    public void save(Book item) {
        bookRepository.put(item.getId(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if (!bookRepository.containsKey(id)) {
            throw new ItemNotFoundException("The item " + id + " was not deleted from the repository. Id does not exist!");
        } else {
            bookRepository.remove(id);
        }
    }

    public void findAndPrint(String id) {
        try {
            System.out.println(findById(id));
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteAndPrint(String id) {
        try {
            delete(id);
            System.out.println("The book " + id + " was successfully deleted from the repository");
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
