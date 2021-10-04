package baseline;

import static java.lang.Math.log;
import java.lang.Math;

public class PaymentCalculator {
    //declare static intake variables
    //create constructor
    //set and get methods
    //calculate months until its paid off

    public double bal;
    public double apr;
    public double monPay;

    public PaymentCalculator(double bal, double apr, double monPay){
        this.bal = bal;
        this.apr = apr;
        this.monPay = monPay;
    }

    public double getBal() {
        return bal;
    }
    public double getApr() {
        return apr;
    }
    public double getMonPay() {
        return monPay;
    }

    public int calculateMonthsUntilPaidOff(){
        //calculation code
        //round up numOfMonths
        //return numOfMonths

        double numOfMonths;

        double dailyRate = apr/365.0;

        numOfMonths = (-(1.0/30.0) * log(1.0 + bal/monPay * (1.0 - Math.pow(1 + dailyRate,30.0)) / log(1.0 + dailyRate)));
        //numOfMonths = Math.ceil(numOfMonths);

        return (int)numOfMonths;
    }
}

