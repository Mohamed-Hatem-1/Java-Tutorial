package com.company;
public class Animal {
    final double pi = 3.14;
//    pi = 555; // Error
    // Final fields can not be modified
    public void makeNoise() {
        System.out.println("I'm just an animal");
    }

    // Final methods can not be overridden
    public final int special() {
        return 10;
    }

}
