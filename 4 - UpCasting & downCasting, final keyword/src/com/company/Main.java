package com.company;

public class Main {
    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        if (animal instanceof Dog) {
            Dog myDog = (Dog) animal;
            myDog.growl();
        }
    }

    public static void main(String[] args) {

        Animal myAnimal = new Dog(); // Up casting
//        myAnimal.growl(); // Error
        doAnimalStuff(myAnimal);

    }

}
