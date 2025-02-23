package edu.pe.example.Polimorfismo;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Person p = new Person();
        p.setName("Fernando");
        p.setLastname("Santivañez");
        p.setAge(26);

        Employee e = new Employee();
        e.setCompanyName("Huawey");
        e.setId_employee(159);
        e.setSalary(3000);

        System.out.println("The person is " + p.getName() + " " + p.getLastname() + " and he's " + p.getAge() + " years old. " +
                "Also, he  work at "+ e.getCompanyName() + " and his salary is " + e.getSalary() + ".");
        */
        // POLIMORFISM

        Person lista [] = new Person [2];
        lista [0] = new Employee();
        lista [1] = new Boss();

        Employee e1 = new Employee();
        e1.work();

        Boss b1 = new Boss();
        b1.work();

    }

}
