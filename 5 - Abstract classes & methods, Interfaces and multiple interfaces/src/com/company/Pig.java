package com.company;
public class Pig implements StoreName, Animal {

//    Must override all methods in StoreName and Animal
    @Override
    public String getStoreName() {
        return storeName;
    }

    @Override
    public void animalSound() {
        System.out.println("wee wee");
    }
    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
    public void print() {
        System.out.println("print");
    }

}
