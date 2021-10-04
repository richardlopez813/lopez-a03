package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */
public class Solution33 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //declare ArrayList
        //generate randomNum
        //prompt for question
        //output answer with corresponding numeric element using randomNum

        ArrayList<String> answers = new ArrayList<String>();
        answers.add("Yes");
        answers.add("No");
        answers.add("Maybe");
        answers.add("Ask again later");

        Random random = new Random();
        int randomNum = random.nextInt(4);

        System.out.println("what's your question?");
        in.nextLine();

        System.out.printf("%s", answers.get(randomNum));
    }
}
