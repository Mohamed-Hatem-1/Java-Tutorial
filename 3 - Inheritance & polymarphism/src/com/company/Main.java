package com.company;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Person p1 = new Person("Ahmed", 20, "El-Gazera", "Egyptian");
        System.out.println(p1.toString() );

        System.out.println("******************************************");

        Student s1 = new Student("Mohamed", 20, "Nader", "Egyptian", 2, "CS", 3.2);
        System.out.println(s1.toString() );

        Student d2 = new Student();

        System.out.println("******************************************");

        SalariedEmployee se1 = new SalariedEmployee("Mohamed", 20, "Nader", "Egyptian", 3000, "Leader", "Engineer", 500, 50);
        System.out.println(se1.toString());
        System.out.println("Salary after edit = " + se1.getSalary() );

        System.out.println ( "******************************************" );

        HourlyEmployee he1 = new HourlyEmployee("Abdo", 20, "Shama", "Egyptian", 5000, "Co-leader", "Engineer", 6.50, 50);
        System.out.println(he1.toString());
        System.out.println("Salary per day = " + he1.getSalary() );

    }

}
