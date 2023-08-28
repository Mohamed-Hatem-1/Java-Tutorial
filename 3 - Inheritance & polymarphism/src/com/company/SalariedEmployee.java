package com.company;
public class SalariedEmployee extends Employee {
    private double bonus;
    private double deductions; // خصومات
    public SalariedEmployee () {} // It doesn't matter if it's wrote or not
    public SalariedEmployee(String name, double age, String address, String nationality, double salary, String rank, String job, double bonus, double deductions) {
        super(name, age, address, nationality, salary, rank, job);
        this.bonus = bonus;
        this.deductions = deductions;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getDeductions() {
        return deductions;
    }
    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus - deductions;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tSalariedEmployee{" +
                "bonus=" + bonus +
                ", deductions=" + deductions +
                '}';
    }
}
