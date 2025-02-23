package edu.pe.example.herencia;

public class Employee extends Person {

    int id_employee;
    String companyName;
    int salary;

    // CONSTRUCTOR
    public Employee() {}

    public Employee(int dni, String name, String lastname, int age, int celphone,
                    int id_employee, String companyName, int salary) {
        super(dni, name, lastname, age, celphone);
        this.id_employee = id_employee;
        this.companyName = companyName;
        this.salary = salary;
    }

    // METHODS
    public void correr() {
        System.out.println("Puedo correr");
    }


    // GETTERS Y SETTERS
    public int getId_employee() {
        return id_employee;
    }
    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }







}
