package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */
public class Solution31 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //declare variables
        //declare loop condition
        //do while loop for try and catch
        //try and catch statement to catch errors and run code

        boolean continueLoop = true;
        do{
            try{
                //prompt for resting pulse and age
                //scan for resting pulse and age
                //print header
                //loop to perform calculations and printing
                //end loop condition

                System.out.print("what is your resting pulse? ");
                int pulse = in.nextInt();
                System.out.print("What is your age? ");
                int age = in.nextInt();

                System.out.println("Intensity    | Rate");
                System.out.println("-------------|--------");
                
                for(int intensity = 55; intensity < 100; intensity += 5){
                    //calculate TargetHeartRate
                    //print formatted output
                    int targetRate = (((220 - age) - pulse) * intensity/100) + pulse;
                    System.out.printf("%d%%          | %d bpm\n", intensity, targetRate);
                }
                continueLoop = false;
            }
            catch (InputMismatchException inputMismatchException) {
                //catch error for input mismatch
                //output message
                in.nextLine();
                System.out.print("Sorry. That's not a valid input.\n");
            }
        } while(continueLoop);
    }
}
