package com.sg.foundations.basics.arrays;

import java.util.Random;

public class HiddenNuts {

    public static void main(String[] args) {

        int arr[] = new int[6];
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        for (int i=0; i<hidingSpots.length; i++){
            if (hidingSpots[i] == "Nut"){
                System.out.println("Nut is in spot with index:" + i);
            }
        }
    }
}
