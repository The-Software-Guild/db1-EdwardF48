package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {
        String color = randomColour(); // call color method here
        String animal = randomAnimal(); // call animal method again here
        String colorAgain = randomColour(); // call color method again here
        int weight = randomInteger(5,200); // call number method,
        // with a range between 5 - 200
        int distance = randomInteger(10,20); // call number method,
        // with a range between 10 - 20
        int number = randomInteger(10000,20000); // call number method,
        // with a range between 10000 - 20000
        int time = randomInteger(2,6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    private static String randomAnimal() {
        Random rng = new Random();
        String[] animalList = {"Cat","Dog","Bear","Badger","Owl"};
        int number = rng.nextInt(animalList.length);
        return animalList[number];
    }

    private static int randomInteger(int min, int max) {
        Random rng = new Random();
        int number = rng.nextInt(max-min)+min;
        return number;
    }

    private static String randomColour() {
        Random rng = new Random();
        String[] colourListList = {"Red","Yellow","Orange","Blue","Green"};
        int number = rng.nextInt(colourListList.length);
        return colourListList[number];
    }

}

