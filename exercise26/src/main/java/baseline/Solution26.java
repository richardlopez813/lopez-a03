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

        int bal = 0;
        int apr = 0;
        int monPay = 0;

        System.out.print("What is your balance? ");
        bal = in.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        apr = in.nextInt();
        System.out.print("What is the monthly payment you can make? ");
        monPay = in.nextInt();

        PaymentCalculator calculation1 = new PaymentCalculator(bal, apr, monPay);
        //System.out.printf("%d %d %d\n",calculation1.getBal(), calculation1.getApr(), calculation1.getMonPay());

        System.out.printf("It will take you %d months to pay off this card.",
                calculation1.calculateMonthsUntilPaidOff());
    }
}
