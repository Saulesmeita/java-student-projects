package lv.javaguru.lesson4;

public class StockDemo {

    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10);
        google.printInformation();

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        google.printInformation();
    }
}
