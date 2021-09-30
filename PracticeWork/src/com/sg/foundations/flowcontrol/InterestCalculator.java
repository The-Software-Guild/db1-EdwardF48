package com.sg.foundations.flowcontrol;
import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        double interestRate;
        int years;
        double interestThisYear;
        double investment;
        int interestFreq;
        String interestChoice;

        Scanner userInput = new Scanner(System.in);

        System.out.println("How much do you want to invest?");
        investment = Double.parseDouble(userInput.nextLine());

        System.out.println("How many years for?");
        years = Integer.parseInt(userInput.nextLine());

        System.out.println("What is the annual interest rate?");
        interestRate = Double.parseDouble(userInput.nextLine());

        System.out.println("Do you want interest daily (d), monthly (m), or quarterly (q)?");
        interestChoice = userInput.nextLine();

        switch (interestChoice){
            case "d":
                interestFreq = 52;
                break;
            case "m":
                interestFreq = 12;
                break;
            default:
                interestFreq = 4;
        }

        for (int i = 1; i <= years; i++) {
            interestThisYear = 0;
            System.out.println("Year " + i + ":");
            System.out.print("Began With: ");
            System.out.printf("%.2f",investment);
            System.out.println();
            for (int m = 1; m <= interestFreq; m++) {
                interestThisYear += investment * ((interestRate / interestFreq) / 100);
                investment += investment * ((interestRate / interestFreq) / 100);
            }
            System.out.print("Earned: ");
            System.out.printf("%.2f",interestThisYear);
            System.out.println();

            System.out.print("Ended With: ");
            System.out.printf("%.2f",investment);
            System.out.println("\n");

        }


    }

}

