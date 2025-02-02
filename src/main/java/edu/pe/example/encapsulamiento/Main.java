package edu.pe.example.encapsulamiento;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setName("Vasty");
        p.setAge(10);

        System.out.println("Hola, me llamo "+ p.getName() + " y tengo " + p.getAge()+ " años.");
    }
}
