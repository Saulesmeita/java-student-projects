package lv.javaguru.lesson4;

public class Stock {

    private String companyName;
    private double price;
    private double minPrice;
    private double maxPrice;

    public Stock(String companyName, double price) {
        this.companyName = companyName;
        this.price = price;
        minPrice = price;
        maxPrice = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getPrice() {
        return price;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void updatePrice(double newPrice) {

        if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        price = newPrice;
    }

    public void printInformation() {

        System.out.println("Company = " + companyName + ", Current Price = " + price + ", Min Price = " + minPrice +
                ", Max Price = " + maxPrice + ".");

    }

}