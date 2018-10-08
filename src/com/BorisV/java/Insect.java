package com.BorisV.java;

public abstract class Insect {

    private  String name;
    private  int numOfWings;
    private  String color;
    private  String favFlower;
    private  final int legs = 6;

    public Insect(){
        /* This a blank constructor. */
    }

    /**
     * This class constructor gets a total of 4 parameters.
     * @param name for the insects.
     * @param numOfWings number of wings an insect has.
     * @param color the color of wings/insect.
     * @param favFlower the flower the insect likes.
     */
    public Insect(String name, int numOfWings, String color, String favFlower) {
        this.name = name;
        this.numOfWings = numOfWings;
        this.color = color;
        this.favFlower = favFlower;
    }

    /**
     * @return String name of the insect.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return number of wings the insects have.
     */
    public int getNumOfWings() {
        return numOfWings;
    }

    /**
     *
     * @return String color of the insects
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @return String favorite flower.
     */
    public String getFavFlower() {
        return favFlower;
    }

    /**
     *
     * @return int number of legs.
     * @see  #legs = 6
     */
    public int getLegs(){
        return legs;
    }

    /**
     * This abstract method is used to print the information of each insect.
     * @Override see other classes where it gets implemented.
     * @return
     */
    public abstract String toString();
}

