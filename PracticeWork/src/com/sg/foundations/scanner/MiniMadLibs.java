package com.sg.foundations.scanner;
import java.util.Scanner;


public class MiniMadLibs {
    public static void main(String[] args) {
        String noun1, adjective1, noun2, adjective2;
        String pluralnoun1, pluralnoun2, pluralnoun3,
        verbpresenttense, verbpasttense;
        double number;

        Scanner inputReader = new Scanner(System.in);


        System.out.println("Enter Noun: ");
        noun1 = inputReader.nextLine();
        System.out.println("Enter Adjective: ");
        adjective1 = inputReader.nextLine();
        System.out.println("Enter Noun: ");
        noun2 = inputReader.nextLine();
        System.out.println("Enter Number: ");
        number = Double.parseDouble(inputReader.nextLine());
        System.out.println("Enter Adjective: ");
        adjective2 = inputReader.nextLine();
        System.out.println("Enter Plural Noun: ");
        pluralnoun1= inputReader.nextLine();
        System.out.println("Enter Plural Noun: ");
        pluralnoun2= inputReader.nextLine();
        System.out.println("Enter Plural Noun: ");
        pluralnoun3= inputReader.nextLine();
        System.out.println("Enter Verb in present tense: ");
        verbpresenttense= inputReader.nextLine();
        System.out.println("Enter same Verb in past tense: ");
        verbpasttense= inputReader.nextLine();


        System.out.println(noun1 + ": the " + adjective1 +
                " frontier. These are the voyages of the starship " +
                noun2+". Its "+ number + "-year mission: to explore strange " + adjective2 + " " + pluralnoun1 +
                ", to seek out "+ adjective2 + " "+ pluralnoun2 +" and " + adjective2 + " " + pluralnoun3+
                ", to boldly "+ verbpresenttense + " where no one has " + verbpasttense + " before.");
    }
}
