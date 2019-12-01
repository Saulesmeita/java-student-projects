package lv.javaguru.lesson9.shop;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return (getName().equals(product.getName()) &&
                getPrice().compareTo(product.getPrice()) == 0);
    }

    @Override
    public int hashCode() {
        return this.getPrice().intValue();
    }

    @Override
    public String toString() {
        return "Product {" +
                "name = '" + name + '\'' +
                ", price = " + price +
                '}';
    }
}
