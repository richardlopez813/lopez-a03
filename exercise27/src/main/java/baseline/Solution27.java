package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */
public class Solution27 {
    //declare string variables
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       //prompt for firstName
       //scan for firstName
       //prompt for lastName
       //scan for lastName
       //prompt for zipCode
       //scan for zipCode
        //prompt for id
        //scan for id
        //call validateInput function
        System.out.print("Enter the first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = in.nextLine();
        System.out.print("Enter the ZIP code name: ");
        String zipCode = in.nextLine();
        System.out.print("Enter the employee ID name: ");
        String id = in.nextLine();



    }
    public void fNameChecker(String firstName){
        //if name at least 2 characters long
        //return null
        //if name less than 2 characters
        //return message

        String returnMessage;

        if(firstName.length() < 2)
        {
            System.out.print("The first name must be at least 2 characters long.");
        }
    }

    public String lNameChecker(){
        //if name at least 2 characters long
        //return null
        //if name less than 2 characters
        //return message
    }

    public String zipCodeChecker(){
        //loop through string to check if numbers
        //if all numbers return null
        //else return message
    }

    public String idChecker(){
        //check if first two are letters
        //check if hyphen next
        //check if next 4 elements are numbers
        //return null
        //else return message
    }

    public String validateInput(){
        //call methods in print statement
    }
}
