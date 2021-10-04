package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */
public class Solution28 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //declare count variable
        //declare collection variable
        //declare total variable
        //initialize loop with count constraint
        //prompt for number
        //add number to total
        //print total

        int counter = 0;
        int total = 0;

        while(counter < 5){
            System.out.print("Enter a number: ");
            int collection = in.nextInt();

            total += collection;
            counter++;
        }

        System.out.printf("The total is %d.", total);
    }
}
