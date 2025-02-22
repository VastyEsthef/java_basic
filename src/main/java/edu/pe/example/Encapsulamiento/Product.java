package edu.pe.example.Encapsulamiento;

public class Product {

    String name;
    double price;

    // CONSTRUCTORS
    public Product() {

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // PRICE
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
