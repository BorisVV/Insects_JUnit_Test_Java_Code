package com.BorisV.java;

public class Bee extends Insect {
    protected static String color;
    protected static String favFlower;

    public Bee(String name, String color, String favFlower, int numOfWings) {
        super(name, numOfWings);
        this.color = color;
        this.favFlower = favFlower;
    }

    public void printSpeciesData() {
        System.out.println("Name = "+this.getName()+", color = "+getcolor()+", makes honey = "
                +gethoney()+ ", favorite flower = "+getFavFlower()+
                "number of wings = "+getNumOfWings());


    }

    public boolean gethoney() {
        if (this.getName().equalsIgnoreCase("honey bee")) {
            return true;
        }
        else return false;
    }


    public static String getcolor() {
        return color;
    }

    public static void setcolor(String color) {
        Bee.color = color;
    }

    public static String getFavFlower() {
        return favFlower;
    }

    public static void setFavFlower(String favFlower) {
        Bee.favFlower = favFlower;
    }
}