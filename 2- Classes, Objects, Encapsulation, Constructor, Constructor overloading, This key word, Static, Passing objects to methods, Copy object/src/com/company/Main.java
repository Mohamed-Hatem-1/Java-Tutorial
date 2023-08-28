package com.company;
import java.util.Scanner ;

public class Main {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        Rectangle r1;
        r1 = new Rectangle();
        System.out.println("Length = " + r1.getLength() );
        System.out.println("Width = " + r1.getWidth() );

        r1.setLength(5);
        r1.setWidth(10);
        System.out.println("Length = " + r1.getLength() );
        System.out.println("Width = " + r1.getWidth() );
        System.out.println("Area = " + r1.getArea() );
        System.out.println(r1.toString());

        System.out.println("*****************************************");

        Rectangle r2 = new Rectangle(20, 50);
        System.out.println("Length = " + r2.getLength() );
        System.out.println("Width = " + r2.getWidth() );
        System.out.println("Area = " + r2.getArea() );

        System.out.println ("*****************************************");


        Employee e1 = new Employee();
        e1.print_all_data();

        System.out.println("*****************************************");

        Employee e2 = new Employee(1, "Mohamed", 7000);
        e2.print_all_data();

        System.out.println("*****************************************");

        Employee e3 = new Employee(2, "Ahmed", "depart3", 5000, 555, true);
        e3.print_all_data();

        e3.setBonus(99); // Edit the salary
        System.out.println("****** After editing the bonus ******");
        System.out.println(e3.getBonus());

        System.out.println("*****************************************");

        System.out.println("Number of objects created = " + Employee.getNoOfEmp() ); // Static method

        System.out.println("*****************************************");

        Rectangle r3 = new Rectangle(10, 10);
        Rectangle r4 = new Rectangle(20, 30);
        Rectangle result = new Rectangle();
        Rectangle r5 = result.add(r3, r4);
        System.out.println(r5.getLength() );
        System.out.println(r5.getWidth() );

        System.out.println("*****************************************");

        Rectangle r6 = new Rectangle(10, 20);
        Rectangle r7= new Rectangle(20, 20);
        System.out.println(r7.isEqual(r6) );

        System.out.println ( "*****************************************" ) ;

        // Copy object
        Rectangle original = new Rectangle(50, 50);
        Rectangle copy = new Rectangle(original);
        System.out.println(copy.getArea());

    }
}
