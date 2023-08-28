package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);

            try {
                int x, y;
                System.out.println( "Enter first number");
                x = obj.nextInt();
                System.out.println("Enter second number");
                y = obj.nextInt();
                System.out.println(x / y);
            } catch (ArithmeticException e) {
                System.out.println("you can't divide by 0");
            } catch (InputMismatchException e) {
                System.out.println("enter only numbers");
            }

//        It all can be replaced by

        try {
            int x, y;
            System.out.println("Enter first number");
            x = obj.nextInt();
            System.out.println("Enter second number");
            y = obj.nextInt();
            System.out.println(x / y);
        } catch (Exception e) {
            System.out.println("the following error occurred : " + e.getMessage() );
        }

        System.out.println("Continue the program");

    }
}
