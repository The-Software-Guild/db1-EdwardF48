package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {

    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner myScanner = new Scanner(System.in);
        int guess;
        int guessAmount = 0;
        int NUMBER_OF_ATTEMPTS = 2;


            int myNumber = randomizer.nextInt(201) - 100;
            System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
            do {
            System.out.print("Your Guess: ");
            guess = myScanner.nextInt();
            guessAmount += 1;
            if (guess == myNumber) {
                System.out.println("Wow, nice guess! That was it!");
            }else{
                if (guess>myNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }
            }while (guessAmount < NUMBER_OF_ATTEMPTS);


    }
}
