package com.company;
import java.util.Locale;
import java.util.Scanner ;
import java.util.Arrays ;
import static java.lang.Math.* ;
public class Main {
    public static int add(int a, int b) {
        return a + b;
    }
    // overloading
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void print(int []list) {
        for(int j : list) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        // object from class Scanner to take input from user
        Scanner inp = new Scanner (System.in);

        /*
        default values for data types are :
        int ---> 0
        long long ---> 0
        float ---> 0.0
        double ---> 0.0
        boolean ---> false
        String ---> Null
        arr[5] ---> {0, 0, 0, 0, 0};
        */

        System.out.println("hi");
        System.out.print("hi");
        System.out.println();

        int sum = 15;
        System.out.println("Sum = " + sum + " :)");
        System.out.println("Enter num1: ");
        int num1;
        num1 = inp.nextInt();

        System.out.print("Enter num2: ");
        int num2 = inp.nextInt();

        sum = num1 + num2 ;
        System.out.println("New sum = " + sum);

        System.out.print("Enter Long number: ");
        long l = inp.nextLong();

        System.out.println("Long = " + l);

        float x = 2.8f ; // Must type f beside it, but double is allowed to be regular
        System.out.print("Enter float num: ");
        float fl = inp.nextFloat();

        System.out.println("Float = " + fl);

        System.out.print("Enter double num: ");
        double d = inp.nextDouble();

        System.out.println("Double = " + d);

        System.out.print("Enter word: ");
        String str = inp.next(); // It must be the first in uppercase 'S' not 's'

        System.out.println("The word is " + str + "\t" + str);

        // مش شغالة
        System.out.println("Enter full sentence with spaces:");
        String full = inp.nextLine();

        System.out.println("Full sentence is : " + full);

        System.out.print("Enter a character: ");
        char ch = inp.next().charAt(0);

        System.out.println("Char is : " + ch);

        // If statement
        if (5 > 2) System.out.println("5 > 2");
        else if (5 < 2) System.out.println("5 < 2");
        else System.out.println("5 = 2");

        // Loop
        int t = 5;
        while (t-- > 0) {
            System.out.println(t);
        }

        // Functions
        int n1 = 10 , n2 = 20;
        System.out.println("sum = " + add(n1, n2) );

        // Overloading
        int n3 = 50;
        int sum1 = add(n1, n2, n3);
        System.out.println("sum = " + sum1);

        // Arrays
        System.out.print("Enter size of the array: ");
        int size = inp.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the elements");
        for(int i = 0; i < size; i++) {
            arr[i] = inp.nextInt();
        }

        System.out.println("The array size = " + arr.length);
        System.out.println("Array elements are");
        print(arr); // Void function

        Arrays.sort(arr); // Built-in function
        System.out.println(Arrays.binarySearch(arr, 5) + 1);
        print(arr);

        // Built-in functions
        System.out.println("Absolute value of -5 is " + abs(-5) );
        System.out.println("2 power 3 = " + (int)pow(2, 3) );
        double rand = random(); // Random number between 0 and 1
        System.out.println(rand);
        int rand1 = (int) (random() * 100 + 1); // random number between 1 and 100
        System.out.println(rand1);
        int rand2 = (int) ( random() * (50 - 20 + 1) ) + 20; // random number between 20 and 50
        System.out.println(rand2);

        // String to int
        String string1 = "2022";
        int number1 = Integer.valueOf(string1);
        // There is another way --> Integer.parseInt(string1);
        System.out.println(number1);

        // Int to string
        int number2 = 10;
        String string2 = String.valueOf(number2);
        // there is another way --> String string2 = number2 + "";
        System.out.println(string2);

        String s1 = "AbCd", s2 = "abcd";
        System.out.println(s1.equalsIgnoreCase(s2) );

        String s = "Welcome to c++, c++ is very interesting programming language";
        String ans = s.replace("c++", "Java");
        System.out.println(ans);
        System.out.println(s.replace(',', '@') );
        System.out.println(s.contains("to") );
        System.out.println(s.endsWith("ge") );
        System.out.println(s.startsWith("w") );

        System.out.println(s);
        String sub1 = s.substring(8); // From 8 to the end
        System.out.println("sub1: " + sub1);

        String sub2 = s.substring(0, 14); // From 0 to 14
        System.out.println("sub2: " + sub2);

        String sub3 = s.substring(3, 14); // From 3 to 14
        System.out.println("sub3: " + sub3);

        String transfer = "AbCd";
        System.out.println(transfer.toLowerCase() );
        System.out.println(transfer);

    }
}
