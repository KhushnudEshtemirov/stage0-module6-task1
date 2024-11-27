package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(String color, int numberOfPaws, boolean hasFur) {
        return "This animal is mostly " + color + ". Is has " + numberOfPaws + (numberOfPaws == 1 ? "paw and " : " paws and ") + (hasFur ? "a" : "no") + " fur.";
    }
}
