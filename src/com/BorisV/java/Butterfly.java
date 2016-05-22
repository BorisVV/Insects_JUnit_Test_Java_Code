package com.BorisV.java;

public class Butterfly extends Insect {
    protected static String wingColor;
    protected static String favFlower;

    public Butterfly(String name, int numOfWings, String wingColor, String favFlower) {
        super(name, numOfWings);
        this.wingColor = wingColor;
        this.favFlower = favFlower;
    }

    public void printSpeciesData() {
        System.out.println("A "+this.getName()+" has "+legs+ " legs, "+
                this.getNumOfWings()+ " wings, it is "+this.getWingColor()+
                ", and likes a plant called "+this.getFavFlower());

    }


    public static String getWingColor() {
        return wingColor;
    }

    public static void setWingColor(String wingColor) {
        Butterfly.wingColor = wingColor;
    }

    public static String getFavFlower() {
        return favFlower;
    }

    public static void setFavFlower(String favFlower) {
        Butterfly.favFlower = favFlower;
    }
}