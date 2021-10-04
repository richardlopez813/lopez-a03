package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */
public class Solution32{
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        //declare variables
        //prompt for difficulty
        //scan for difficulty
        //while loop to replay game
        //call guessingGame function
        //prompt if you want to replay
        //replay or end file

        String yesOrNo = "y";

        //enter do while loop which prompts user for input level and
        //then calls game method to guess number, breaking condition is yesOrNo = "n"
        do {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            int difficulty = in.nextInt();
            System.out.print("I have my number. What's your guess? ");
            guessingGame(difficulty);
            System.out.print("Do you wish to play again (Y/N)? ");
            yesOrNo = in.next();
        } while (yesOrNo.equalsIgnoreCase("y"));
    }
    //guessing game
    public static void guessingGame(int difficulty){
        //declare variables
        //generate random number based on difficulty

        Random random = new Random();

        int randomNum = 0;
        int counter = 0;
        boolean loopCondition = true;

        if(difficulty == 1)
            randomNum = random.nextInt(11);
        else if(difficulty == 2)
            randomNum = random.nextInt(101);
        else if(difficulty == 3)
            randomNum = random.nextInt(1001);

        //while loop until numbers match
        while(loopCondition){
            try{
                //scan for number
                //if number too low send lower message
                //if higher send lower message
                //if right end program
                //increment counter

                int guess = in.nextInt();

                if(guess < randomNum){
                    System.out.println("Too low. Guess again: ");
                    counter++;
                    continue;
                }
                else if(guess > randomNum){
                    System.out.println("Too high. Guess again: ");
                    counter++;
                    continue;
                }
                else {
                    System.out.printf("You got it in %d guesses!\n", ++counter);
                    loopCondition = false;
                }
            }
            //catch non-numeric inputs
            catch (InputMismatchException inputMismatchException) {
                //catch error for input mismatch
                //output message
                //increment counter
                in.nextLine();
                System.out.print("Sorry. That's not a valid input.\n");
                counter++;
            }

        }

    }

}


