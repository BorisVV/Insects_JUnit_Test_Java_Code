package com.BorisV.java;

import java.util.ArrayList;

public class InsectManager {

    public static void main(String[] args) {
        //This the main and is calling the Insect class, then the insects to put the information for each insect.
        //This is the Inset manager for the main method.

        // Create a LinkedList to add insects.
        ArrayList<Insect> insects = new ArrayList<>();

        // Add Butterflies.
        Butterfly butterfly1 =  new Butterfly("Monarch", 4, "orange and black", "milkweed");
        Butterfly butterfly2 =  new Butterfly("Common Yellow Swallowtail", 4, "yellow and black", "parsley");

        // Add Bees.
        Bee bee1 = new Bee("Honey bee", 4,"yellow and black", "Jasmine");
        Bee bee2 = new Bee("Bumble bee", 4,"yellow and black and white", "clover");

        insects.add(butterfly1); // Add Butterflies to the insects Array.
        insects.add(butterfly2);

        insects.add(bee1); // Add Bees to the insects Arrays.
        insects.add(bee2);

        System.out.println("This is the information...");

        //for enhance loop is used to call the Insects.
        for (Insect insect : insects) {
            System.out.println(insect.toString()); //This prints all the data from the objects in the LinkedList.
        }

    }
}
