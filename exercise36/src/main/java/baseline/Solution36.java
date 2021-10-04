package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */
public class Solution36 {
    public static void main(String[] args) {
        //declare variables
        int i = 0;
        int nums[] = new int[10];
        String input = "";
        Scanner in = new Scanner(System.in);
        //intake loop
        while(!input.equalsIgnoreCase("done")){
                try{
                    //prompt for number
                    System.out.print("Enter a number: ");
                    //scan for number
                    input = in.next();
                    nums[i++] = Integer.parseInt(input);
                }
                //if input not numerical
                catch (InputMismatchException inputMismatchException) {
                    //catch error for input mismatch
                    in.nextLine();
                    //output message
                    System.out.print("Sorry. That's not a valid input.\n");
                }
        }

        System.out.print("Numbers: ");
        for (int j = 0; j < nums.length; j++)
        {
            System.out.print(nums[j] + ", ");
        }

        //output results with values returned from functions
    }

//    public double average(){
//        //loop to add elements
////        for(){
////            //add to total
////        }
//
//        //divide total by number of elements
//        //return average
//    }
//
//    public int max(){
//        //declare variables
//        //loop to find max
//        for(){
//            //check if next element bigger
//            if(){
//                //change value to max variable
//            }
//        }
//
//        //output max
//    }
//
//    public int min(){
//        //declare variables
//        //loop to find min
//        for(){
//            //check if next element smaller
//            if(){
//                //change value to min variable
//            }
//        }
//
//        //output min
//    }
//
//    public double stdDev(){
//        //declare variables
//        //aggregate of (element - mean)^2
//        for(){
//            //add to total
//        }
//
//        //finish calculation
//        //return calculation
//    }
}
