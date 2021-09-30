package com.sg.foundations.flowcontrol;
import java.util.Scanner;
public class Factoriser {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your Number:");
        int number = userInput.nextInt();
        System.out.println("The factors of "+number+" are:");
        System.out.print(1+" ");
        int factorTotal = 1;
        int numberOfFactors =1;

        for (int i=2; i<number;i++){
            if (number % i == 0){
                System.out.print(i + " ");
                factorTotal += i;
                numberOfFactors += 1;
            }
        }
        if (number != 1){
        System.out.print(number);
        numberOfFactors += 1;}
        System.out.println();

        System.out.println(number+" has " + numberOfFactors + " factors");

        if (factorTotal == number && number != 1){
            System.out.println(number + " is a perfect number");
        }else{
            System.out.println(number + " is not a perfect number");
        }

        if (numberOfFactors==2){
            System.out.println(number + " is prime");
        }else{
            System.out.println(number + " is not prime");
        }
    }
}
