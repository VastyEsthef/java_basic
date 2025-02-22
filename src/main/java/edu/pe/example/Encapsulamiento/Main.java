package edu.pe.example.Encapsulamiento;

import edu.pe.example.herencia.Hijo;
import edu.pe.example.herencia.Padre;

public class Main {
    public static void main(String[] args) {

    Product p1 = new Product();
    Product p2 = new Product("Leche", 5.5);

    System.out.println("Product:" + p2.getName() + " S/." + p2.getPrice());
    }
}
