package com.BorisV.java;

public class Butterfly extends Insect {

    public Butterfly(String name, int numOfWings, String color, String favFlower) {
        super(name, numOfWings, color, favFlower);
    }

    // Displays the information about the insect.
    @Override
    public String toString() {
        return
        "A "+this.getName()+" has "+ this.getLegs() + " legs, "+
                this.getNumOfWings()+ " wings, it is "+this.getColor()+
                ", and likes a plant called "+this.getFavFlower();
    }

}