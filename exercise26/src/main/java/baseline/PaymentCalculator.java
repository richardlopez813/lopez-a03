package baseline;

import static java.lang.Math.log;

public class PaymentCalculator {
    //declare static intake variables
    //create constructor
    //set and get methods
    //calculate months until its paid off

    private int bal;
    private int apr;
    private int monPay;

    public PaymentCalculator(int bal, int apr, int monPay){
        this.bal = bal;
        this.apr = apr;
        this.monPay = monPay;
    }

    public int getBal() {
        return bal;
    }
    public int getApr() {
        return apr;
    }
    public int getMonPay() {
        return monPay;
    }
    public void setBal(){
        this.bal = bal;
    }
    public void setApr(){
        this.apr = apr;
    }
    public void setMonPay(){
        this.apr = monPay;
    }

    public int calculateMonthsUntilPaidOff(){
        //calculation code
        //round up numOfMonths
        //return numOfMonths

        double numOfMonths = 0;

        double dailyRate = apr/365;

        numOfMonths = -(1/30) * log(1 + bal/monPay * (1 - Math.pow(1 + dailyRate,30)) / log(1 + dailyRate));
        Math.ceil(numOfMonths);


        return (int) numOfMonths;
    }
}

