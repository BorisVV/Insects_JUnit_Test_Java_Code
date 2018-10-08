package com.BorisV.java;

public class Bee extends Insect {

    public Bee(String name, int numOfWings, String color, String favFlower) {
        super(name, numOfWings, color, favFlower);
    }

    // Display information about the insect.
    @Override
    public String toString() {
        return
                "Name = "+this.getName() + ", color = "+ getColor()+", makes honey = "
                        + getHoney() + ", favorite flower = " + getFavFlower() +
                        "number of wings = " + getNumOfWings();
    }

    // Will return  true or false.
    private boolean getHoney() {
        return
                this.getName().equalsIgnoreCase("honey bee");
    }
}