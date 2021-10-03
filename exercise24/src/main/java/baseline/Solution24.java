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
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n" +
                "Enter the first string: ");
        //scan for first string
        String string1 = in.nextLine();

        //scan for second string
        System.out.print("Enter the second string: ");
        String string2 = in.nextLine();

        boolean anagram = isAnagram(string1, string2);//call isAnagram function
        //print result

        if(anagram){
            System.out.printf("%s and %s are anagrams.", string1, string2);
        }
        else
            System.out.printf("%s and %s are not anagrams.", string1, string2);
    }

    public static boolean isAnagram(String string1, String string2) {
        //declare variables
        int letterMatch = 0;

        //if lengths are same continue
        if (string1.length() == string2.length()) {
            //loop through first string
            for (int counter1 = 0; counter1 < string1.length(); counter1++) {
                //loop through second string
                for (int counter2 = 0; counter2 < string1.length(); counter2++) {
                    //if matching increment match variable
                    if (string2.charAt(counter2) == string1.charAt(counter1)) {
                        letterMatch++;
                    }
                }
            }
        } else {
            return false;
        }

        //return true if all characters match
        if (letterMatch == string1.length()) {
            return true;
        } else {
            return false;
        }
    }
}
