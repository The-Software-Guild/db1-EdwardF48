package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {

    public static void main(String[] args) {
        int numberOfAsks = 0;
        boolean roomCleaned = false;
        Random rng = new Random();
        float chance;

        do{
            numberOfAsks ++;
            System.out.println("Clean your room!! (x" + numberOfAsks +")");
            chance = rng.nextFloat()*100;
            if (chance<numberOfAsks*10) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                roomCleaned = true;
            }else if (numberOfAsks == 7){
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                roomCleaned = true;
            }
        } while(!roomCleaned);
    }

}
