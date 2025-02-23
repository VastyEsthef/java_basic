package edu.pe.example.Polimorfismo;

public class Boss extends Person{

    String chiefPosition;
    String companyName;
    int salary;
    Boolean vacation;

    //CONSTRUCTORS
    public Boss() {

    }

    public Boss(int dni, String name, String lastname, int age, int celphone, String chiefPosition, String companyName, int salary, Boolean vacation) {
        super(dni, name, lastname, age, celphone);
        this.chiefPosition = chiefPosition;
        this.companyName = companyName;
        this.salary = salary;
        this.vacation = vacation;
    }

    // METHODS
    public void work() {
        System.out.println("I work 10 hours a day, looking for clients for my business.");
    }

    // GETTERS AND SETTERS
    public String getChiefPosition() {
        return chiefPosition;
    }

    public void setChiefPosition(String chiefPosition) {
        this.chiefPosition = chiefPosition;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Boolean getVacation() {
        return vacation;
    }

    public void setVacation(Boolean vacation) {
        this.vacation = vacation;
    }
}
