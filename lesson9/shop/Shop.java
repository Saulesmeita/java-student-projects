package lv.javaguru.lesson9.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shop {

    HashMap<Product, BigDecimal> shop = new HashMap<Product, BigDecimal>();

    public void addProduct(Product product) {
        shop.put(product, product.getPrice());
    }

    public void addProduct(String name, BigDecimal price) {
        addProduct(new Product(name, price));
    }

    public void initiallyPopulate() {
        addProduct("Apples", new BigDecimal("0.65"));
        addProduct("Pears", new BigDecimal("0.88"));
        addProduct("Watermelon", new BigDecimal("1.8"));
        addProduct("Apricots", new BigDecimal("1.2"));
        addProduct("Hazelnuts", new BigDecimal("6.3"));
        addProduct("Walnuts", new BigDecimal("7.5"));
        addProduct("Grapes", new BigDecimal("2.05"));
        addProduct("Milk 1l", new BigDecimal("0.6"));
        addProduct("Ground Coffee 500g", new BigDecimal("4.9"));
        addProduct("Piparkukas", new BigDecimal("3.5"));
    }

    public boolean isInTheShop(Product product) {
        if (shop.containsKey(product)) {
            return true;
        } else {
            System.out.println("The " + product+ " not found in the shop.");
            return false;
        }
    }

    public void deleteProduct(Product product) {
        System.out.println();
        if (isInTheShop(product)) {
            shop.remove(product);
            System.out.println("The " + product + " has been successfully deleted from the shop.");
        }
    }

    public void deleteProduct(String name, BigDecimal price) {
        deleteProduct(new Product(name, price));
    }

    public ArrayList<Product> findByName(String name) {
        ArrayList<Product> rez = new ArrayList<>();
        for (Map.Entry<Product, BigDecimal> entry : shop.entrySet()) {
            if (entry.getKey().getName().equals(name)) {
                rez.add(new Product(entry.getKey().getName(), entry.getValue()));
            }
        }
        return rez;
    }

    public ArrayList<Product> findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        ArrayList<Product> rez = new ArrayList<>();
        for (Map.Entry<Product, BigDecimal> entry : shop.entrySet()) {
            if (entry.getValue().compareTo(minPriceRange) >= 0 && entry.getValue().compareTo(maxPriceRange) <= 0) {
                rez.add(new Product(entry.getKey().getName(), entry.getValue()));
            }
        }
        return rez;
    }

    public void printRez(ArrayList<Product> products) {
        System.out.println();
        if (products.isEmpty()) {
            System.out.println("Nothing found");
        } else {
            System.out.println(products.size() + (products.size()==1?" item":" items") +" found:");
            System.out.println();
            System.out.println(products.toString());
        }
    }

    public void printShop() {
        System.out.println();
        if (shop.isEmpty()) {
            System.out.println("No products in the shop yet. A good time to add some!");
        } else {
            System.out.println(shop.size() + (shop.size()==1?" product":" products") + " at the shop recently:");
            System.out.println();
            for (Map.Entry<Product, BigDecimal> entry : shop.entrySet()) {
                System.out.println(entry.getKey());
            }
        }
    }
}
