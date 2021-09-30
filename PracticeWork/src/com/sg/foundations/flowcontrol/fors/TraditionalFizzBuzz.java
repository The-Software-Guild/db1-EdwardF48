package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        //This isn't what the task wants but to do that you'd use a while loop surely??
        int maxNumber;
        String output ="";

        Scanner myScanner = new Scanner(System.in);


        System.out.println("What number should we go up to?");
        maxNumber = myScanner.nextInt();

        for (int i=0; i<maxNumber+1; i++){
            output ="";
            if(i%3 == 0){
                output += "Fizz ";

            }
            if(i%5 == 0){
                output += "Buzz ";
            }
            if (output.isBlank()){
                System.out.println(i);
            }else{
                System.out.println(output);
            }

        }
        System.out.println("TRADITION!!!!!");

    }
}
