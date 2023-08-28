package com.company;
public class HourlyEmployee extends Employee {
    private double workingHours;
    private double hourPrice;
    public HourlyEmployee(String name, double age, String address, String nationality, double salary, String rank, String job, double workingHours, double hourPrice) {
        super(name, age, address, nationality, salary, rank, job);
        this.workingHours = workingHours;
        this.hourPrice = hourPrice;
    }
    public double getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    public double getHourPrice() {
        return hourPrice;
    }
    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }

    @Override
    public double getSalary () {
        return workingHours * hourPrice;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "workingHours=" + workingHours +
                ", hourPrice=" + hourPrice +
                "} " + super.toString();
    }
}
