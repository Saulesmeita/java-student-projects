package lv.javaguru.lesson3;

public class Product {

    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double actualPrice() {

        return regularPrice * (100 - discount) / 100;

    }

    void printInformation() {

        System.out.printf("%n Product: name = %s, regular price = %.2f EUR, discount = %.2f%%, actual price = %.2f EUR. %n",
                name, regularPrice, discount, actualPrice());
    }
}
