package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("red", 1, true);
        Animal animal2 = new Animal("red", 3, true);

        System.out.println(animal1.getDescription());
        System.out.println(animal2.getDescription());
    }
}
