package lv.javaguru.lesson3;

public class ProductDemo {

    public static void main(String[] args) {

        Product item1 = new Product("Milk");
        item1.setRegularPrice(0.8);
        item1.setDiscount(20);

        item1.printInformation();

    }

}
