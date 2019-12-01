package lv.javaguru.lesson9.shop;

import java.math.BigDecimal;

public class ShopDemo {

    public static void main(String[] args) {

        Shop myShop = new Shop();
        myShop.printShop();

        myShop.initiallyPopulate();

        myShop.printShop();

        myShop.printRez(myShop.findByName("Milk"));
        myShop.printRez(myShop.findByName("Walnuts"));

        myShop.printRez(myShop.findProduct(new BigDecimal("0.5"), new BigDecimal("1.9")));
        myShop.printRez(myShop.findProduct(new BigDecimal("5"), new BigDecimal("9.9")));
        myShop.printRez(myShop.findProduct(new BigDecimal("10"), new BigDecimal("20")));

        myShop.addProduct("Chocolate Ice-cream", new BigDecimal("1.1"));
        myShop.addProduct("Goat Cheese, 300g", new BigDecimal("2.35"));

        myShop.printShop();
        myShop.printRez(myShop.findProduct(new BigDecimal("0.5"), new BigDecimal("2.35")));

        myShop.deleteProduct("Apples", new BigDecimal("0.65"));
        myShop.deleteProduct("Pears", new BigDecimal("0.88"));

        myShop.printShop();

    }
}
