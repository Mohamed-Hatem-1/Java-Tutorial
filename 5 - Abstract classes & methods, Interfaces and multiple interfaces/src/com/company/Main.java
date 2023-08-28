package com.company;

public class Main {

    public static void main(String[] args) {

//        Employee e1 = new Employee(); // Error because it's an abstract class
        SalariedEmployee se1 = new SalariedEmployee();
        se1.setHourPrice(50);
        se1.setWorkingHours(6);
        System.out.println(se1.getSalary() );

        System.out.println("***************************************");

        Pig pig = new Pig();
        System.out.println("Store Name is : " + pig.getStoreName() );
        pig.animalSound();
        pig.sleep();
        pig.print();

    }
}
