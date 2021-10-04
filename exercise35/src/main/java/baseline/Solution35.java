package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //declare arraylist
        //declare loop condition
        //declare variables
        //loop number question asking
        //generate random number
        //print winner using random number as index
        
        ArrayList<String> winnerNames = new ArrayList<String>();
        boolean loopCondition = true;
        int counter = 0;

        while(loopCondition){
            System.out.println("Enter a name: ");
            String newName = in.nextLine();

            if(newName == "") {
                loopCondition = false;
                continue;
            }

            winnerNames.add(newName);
            counter++;
        }

        Random random = new Random();
        int randomNum = random.nextInt(winnerNames.size());

        System.out.printf("The winner is... %s", winnerNames.get(randomNum));
    }
}
