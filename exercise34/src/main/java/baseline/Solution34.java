package baseline;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */
public class Solution34 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //declare list of names
        //print employee list using loop
        //prompt for name to remove
        //remove name
        //print output

        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        //print introduction
        for(int counter = 0; counter < employees.size(); counter++){
            //output names
            System.out.println(employees.get(counter));

        }

        System.out.print("Enter an employee name to remove: ");
        String nameRemoval = in.nextLine();

        //check if strings match
        if(employees.contains(nameRemoval)){
            employees.remove(employees.indexOf(nameRemoval));
        }

        //print new employee list
        for(int counter = 0; counter < employees.size(); counter++){
            System.out.println(employees.get(counter));
        }
    }
}
