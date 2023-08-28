package com.company;
public class Employee {
    private int id;
    private String name;
    private String depart;
    private double salary;
    private double bonus;
    private boolean resident;
    private static int noOfEmp;
    public Employee() {
        noOfEmp++;
    }
    public Employee(int id, String name) {
        this(); // To call the default constructor
        this.id = id;
        this.name = name;
    }
    public Employee(int id, String name, double salary) {
        this(id, name); // Call the second constructor
        this.salary = salary;
    }
    public Employee(int id, String name, String depart, double salary, double bonus, boolean resident) {
        this(id, name, salary);
        this.depart = depart;
        this.bonus = bonus;
        this.resident = resident;
    }

    // Setters and getters
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSalary (double salary ) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setDepart(String depart) {
        this.depart = depart;
    }
    public String getDepart() {
        return depart;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setResident(boolean resident) {
        this.resident = resident;
    }
    public boolean isResident() {
        return resident;
    }
    public void print_all_data() {
        System.out.println("Id = " + getId() );
        System.out.println( "Name = " + getName() );
        System.out.println( "Department = " + getDepart() );
        System.out.println( "Salary = " + getSalary() );
        System.out.println( "Bonus = " + getBonus() );
        System.out.println( "Resident ? " + isResident() );
    }
    public static int getNoOfEmp () {
        return noOfEmp ;
    }
}