package com.company;
public class SalariedEmployee extends Employee {
    private int hourPrice;
    private double workingHours;
    public SalariedEmployee () {}
    public SalariedEmployee(String name, int age, double salary, int hourPrice, double workingHours) {
        super(name, age, salary);
        this.hourPrice = hourPrice;
        this.workingHours = workingHours;
    }
    public int getHourPrice() {
        return hourPrice;
    }
    public void setHourPrice(int hourPrice) {
        this.hourPrice = hourPrice;
    }
    public double getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public double getSalary() {
        return hourPrice * workingHours;
    }
}
