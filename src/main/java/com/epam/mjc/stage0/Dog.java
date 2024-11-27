package com.epam.mjc.stage0;

public class Dog extends Animal {
    Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    Dog dog = new Dog("brown", 4, true);
}
