package baseline;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */
public class Solution29 {
    private final static Scanner in = new Scanner(System.in);

    public static int yearDouble(int rate) throws ArithmeticException{
        //calculate result
        //throw error in result or return result
            return 72 / rate;
    }


    public static void main(String[] args) {
        //declare scanner
        //declare loop condition
        //do while loop to keep input going
        //try catch statement to catch errors
        boolean continueLoop = true;

        do {
            try {
                //output prompt for return rate
                //call yearDouble
                //output result
                //end loop
                System.out.print("What is the rate of return? ");
                int rate = in.nextInt();

                int result = yearDouble(rate);

                System.out.printf("It will take %d years to double your initial investment.", result);

                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                //catch error for input mismatch
                //output message
                in.nextLine();
                System.out.print("Sorry. That's not a valid input.\n");
            } catch (ArithmeticException arithmeticException) {
                //catch error for divide by zero error
                //output message
                System.out.print("Sorry. That's not a valid input.\n");
            }
        } while (continueLoop);
    }
}
