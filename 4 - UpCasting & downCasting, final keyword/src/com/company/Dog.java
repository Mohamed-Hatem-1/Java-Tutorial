package com.company;
public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Haow Haow");
    }
    public void growl() {
        System.out.println("Grrrrrrrrr");
    }

    // Error
    // @Override
    // public int special() {
    //    return 50;
    //  }

}
