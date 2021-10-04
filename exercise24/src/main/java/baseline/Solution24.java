package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */
public class Solution24 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt to enter strings
        //scan for first string
        //prompt for second string
        //scan second string
        //call anagram function
        //determine if anagram or not
        //print result
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n" +
                "Enter the first string: ");

        String string1 = in.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = in.nextLine();

        boolean anagram = isAnagram(string1, string2);

        if(anagram){
            System.out.printf("%s and %s are anagrams.", string1, string2);
        }
        else
            System.out.printf("%s and %s are not anagrams.", string1, string2);
    }

    public static boolean isAnagram(String string1, String string2) {
        //declare variables
        //loop through inputs and find matching letters
        //check if matching or not and return boolean
        int letterMatch = 0;

        if (string1.length() == string2.length()) {
            for (int counter1 = 0; counter1 < string1.length(); counter1++) {
                for (int counter2 = 0; counter2 < string1.length(); counter2++) {
                    if (string2.charAt(counter2) == string1.charAt(counter1)) {
                        letterMatch++;
                    }
                }
            }
        } else {
            return false;
        }

        if (letterMatch == string1.length()) {
            return true;
        } else {
            return false;
        }
    }
}
