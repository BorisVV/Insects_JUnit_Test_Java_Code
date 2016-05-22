package com.BorisV.java;

public abstract class Insect {

    protected static String name;
    protected static int numOfWings;
    protected static final int legs = 6;

    public Insect(String name, int numOfWings) {
        this.name = name;
        this.numOfWings = numOfWings;
    }

    public static String getName() {
        return name;
    }

    public Insect setName(String name) {
        this.name = name;
        return this;
    }

    public static int getNumOfWings() {
        return numOfWings;
    }

    public Insect setNumOfWings(int numOfWings) {
        this.numOfWings = numOfWings;
        return this;
    }

    public abstract void printSpeciesData();
}

