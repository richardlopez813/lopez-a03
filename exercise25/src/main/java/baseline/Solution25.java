package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */

import java.util.Scanner;

public class Solution25 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt to enter password
        //scan for password
        //call passwordValidator function
        //switch statement to determine which it is
        //print status of password
        String passwordType = "";

        System.out.print("What is your password? ");
        String password = in.nextLine();

        int passwordStrength = passwordValidator(password);

        switch(passwordStrength){
            case 1:
                passwordType = "very weak";
                break;
            case 2:
                passwordType = "weak";
                break;
            case 3:
                passwordType = "strong";
                break;
            case 4:
                passwordType = "very strong";
                break;
            default:
                passwordType = "not adequate";
                break;
        }

        System.out.printf("the password \'%s\' is a %s password", password, passwordType);
    }

    public static int passwordValidator(String password){
        //declare variables
        //loop to count char types
        //if else to determine if length more or less than 8 characters
        //if else statements to check each password type
        //return returnType

        int numberCount = 0;
        int letterCount = 0;
        int specialCount = 0;
        int returnType = 0;

        //loop to count character types
        for(int counter = 0; counter < password.length(); counter++){
            char c = password.charAt(counter);
            if(Character.isDigit(c)){
                numberCount++;
            }
            if(Character.isLetter(c)){
                letterCount++;
            }
            if(!Character.isLetterOrDigit(c)){
                specialCount++;
            }
        }

        //weak cases
        if(password.length() < 8){
            if(numberCount == password.length()){
                returnType = 1;
            }
            else if(letterCount == password.length()){
                returnType = 2;
            }
        }
        //strong cases
        else if(password.length() >= 8){
            if(numberCount >= 1 && letterCount == password.length() - numberCount){
                returnType = 3;
            }
            else if(numberCount + letterCount + specialCount == password.length())
                returnType = 4;
        }
        //error case
        else{
            returnType = 0;
        }

        return returnType;
    }
}
