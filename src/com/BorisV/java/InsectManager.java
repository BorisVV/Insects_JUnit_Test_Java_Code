package com.BorisV.java;

        import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {
        //This the main and is calling the Insect class, then the insects to put the information for each insect.
        //This is for the Butterfly insect and prints the data for each one.
        Insect object = new Butterfly("Monarch", 4, "orange and black", "milkweed");
        object.printSpeciesData();
        Insect object2 = new Butterfly("Common Yellow Swallowtail", 4, "yellow and black", "parsley");
        object2.printSpeciesData();

        //Bee objects and prints the data for each insect.
        Insect objBee1 = new Bee("Honey bee", "yellow and black", "Jasmine", 4);
        objBee1.printSpeciesData();
        Insect objBee2 = new Bee("Bumble bee", "yellow and black and white", "clover", 4);
        objBee2.printSpeciesData();


        System.out.println();

        //This the LinkedList that stores each of the above object and then loops and prints out the data
        //is basically the same as above with the difference that is all together in the array.
        System.out.println("This is the LinkList print out");
        LinkedList<Insect> insects = new LinkedList<>();
        insects.add(object);
        insects.add(object2);
        insects.add(objBee1);
        insects.add(objBee2);

        //for enhance loop is used to call the Insects.
        for (Insect i : insects) {
            i.printSpeciesData(); //This prints all the data from the objects in the LinkedList.
        }

    }
}
