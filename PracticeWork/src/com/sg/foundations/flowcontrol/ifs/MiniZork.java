package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("Your hand gets stuck");
                System.out.println("You wait for help");
                System.out.println("No help comes - you died");
            }
        } else if (action.equals("go to the house")) {
            System.out.println("The house looks empty");
            System.out.println("The window is smashed in");
            System.out.println("Climb in window or go to back garden?");
            action = userInput.nextLine();

            if (action.equals("go to back garden")) {
                System.out.println("There is a creepy well.");
                System.out.println("Go to well or run away?");
                action = userInput.nextLine();
                if (action.equals("go to well")){
                    System.out.println("You find gold in the well");
                    System.out.println("You decide to run home - now a rich man");
                }
                else if (action.equals("run away")){
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }

            }else if (action.equals("climb in window")) {
                System.out.println("You fell through the floor of the house");
                System.out.println("You died");
            }
        }
    }
}