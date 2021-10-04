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
        String zipCode = in.next();
        System.out.print("Enter the employee ID name: ");
        String id = in.next();

        validateInput(firstName, lastName, zipCode, id);
    }
    public static String fNameChecker(String firstName){
        //if name at least 2 characters long
        //return null
        //if name less than 2 characters
        String msg = "";
        if(firstName.equalsIgnoreCase("") && firstName.length() < 2)
        {
            msg += "The first name must be filled in";
            msg += "\nThe first name must be at least 2 characters long";
        }
        else if(firstName.length() < 2)
        {
            msg += "The first name must be at least 2 characters long.";
        }
        return msg;
    }

    public static String lNameChecker(String lastName){
        //if name at least 2 characters long
        //return null
        //if name less than 2 characters
        //return message
        String msg = "";

        if(lastName.equalsIgnoreCase("") && lastName.length() < 2)
        {
            msg += "The last name must be filled in";
            msg += "\nThe last name must be at least 2 characters long";
        }
        else if(lastName.length() < 2)
        {
            msg += "The last name must be at least 2 characters long.";
            return msg;
        }

        return msg;
    }

    public static String zipCodeChecker(String zip){
        //loop through string to check if numbers
        //if all numbers return null
        //else return message
        String msg = "";
        int count = 0;
        for (int i = 0; i < zip.length(); i++)
        {
            if (Character.isDigit(zip.charAt(i)))
            {
                continue;
            }
            else
            {
                count++;
            }
        }

        if (count > 0) msg += "The zipcode must be a 5 digit number.";

        return msg;
    }

    public static String idChecker(String id){
        //check if first two are letters
        //check if hyphen next
        //check if next 4 elements are numbers
        //return null
        //else return message
        String msg = "";

        if (id.charAt(2) != '-')
        {
            msg += "The employee ID must be in the format of AA-1234.";
        }

        return msg;
    }

    public static void validateInput(String fname, String lname, String zip, String id){
        if (fNameChecker(fname).equalsIgnoreCase("") && lNameChecker(lname).equalsIgnoreCase("")
        && zipCodeChecker(zip).equalsIgnoreCase("") && idChecker(id).equalsIgnoreCase(""))
        {
            System.out.println("There were no errors found.");
        }
        else {
            System.out.println(fNameChecker(fname) + "\n" + lNameChecker(lname) + "\n" + zipCodeChecker(zip)
                    + "\n" + idChecker(id));
        }
    }
}
