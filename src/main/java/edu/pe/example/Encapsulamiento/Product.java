package edu.pe.example.Encapsulamiento;

public class Product {

    String name;
    double price;
    private int id;

    // CONSTRUCTORS
    public Product() {

    }

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
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
