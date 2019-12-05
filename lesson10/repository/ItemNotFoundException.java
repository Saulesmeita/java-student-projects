package lv.javaguru.lesson10.repository;

public class ItemNotFoundException extends Exception {

    public ItemNotFoundException(String message) {
        super(message);
    }
}
