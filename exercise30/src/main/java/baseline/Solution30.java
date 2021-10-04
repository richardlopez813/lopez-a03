package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */
public class Solution30 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //declare 2d array
        //nested for loop to loop through 2d array
        //print corresponding value for each element
        
        int [][] multiplyTable = new int[12][12];

        for (int counter = 0; counter < 12; counter++){
            //loop through vertical components
            for (int counter2 = 0; counter2 < 12; counter2++){
                //print product of one more than both vertical/horizontal components
                multiplyTable[counter][counter2] = (counter + 1) * (counter2 + 1) ;
                System.out.printf("%5d ", multiplyTable[counter][counter2]);
            }
            System.out.print("\n");
        }
    }
}
