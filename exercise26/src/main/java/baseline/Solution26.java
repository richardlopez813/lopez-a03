package baseline;

import java.util.Scanner;

import static java.lang.System.in;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Richard Lopez
 */
public class Solution26 {
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //declare intake variables
        //prompt for balance
        //scan for balance
        //prompt for apr
        //scan for apr
        //prompt for monthly payment
        //scan for monthly payment
        //create PaymentCalculator object with numbers
        //print results

        double bal, apr, monPay;

        System.out.print("What is your balance? ");
        bal = in.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        apr = in.nextDouble();
        apr /= 100;
        System.out.print("What is the monthly payment you can make? ");
        monPay = in.nextDouble();
        
        PaymentCalculator calculation1 = new PaymentCalculator(bal, apr, monPay);

        int months = calculation1.calculateMonthsUntilPaidOff();

        System.out.println("It will take you " + months + " months to pay off this card.");
    }
}
