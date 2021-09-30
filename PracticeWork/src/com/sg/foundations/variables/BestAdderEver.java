package com.sg.foundations.variables;
import java.util.Scanner;

public class BestAdderEver {

    public static void main(String[] args) {
        double number1;
        double number2;
        double number3;
        double answer;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter First Number:");
        number1 = myScanner.nextDouble();

        System.out.println("Please enter Second Number:");
        number2 = myScanner.nextDouble();

        System.out.println("Please enter Third Number:");
        number3 = myScanner.nextDouble();
        answer = number1+number2+number3;
        System.out.println(number1 + "+" + number2 + "+" + number3 + "=" + answer );

    }

}
