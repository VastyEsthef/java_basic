package edu.pe.example.Polimorfismo;

public class Person {

    protected int dni;
    protected String name;
    protected String lastname;
    protected int age;
    protected int celphone;

    // CONSTRUCTOR
    public Person() {

    }

    public Person(int dni, String name, String lastname, int age, int celphone) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.celphone = celphone;
    }

    // METHODS
    public void talk() {
        System.out.println("I can talk");
    }

    public void walk() {
        System.out.println("I can walk");
    }

    public void work() { System.out.println("Someday I'll work");}

    // GETTERS Y SETTERS
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCelphone() {
        return celphone;
    }

    public void setCelphone(int celphone) {
        this.celphone = celphone;
    }



}
