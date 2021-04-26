package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

public abstract class Loan {

    protected double rate;

    public abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, int years) {

         /**
         * to calculate the monthly loan payment i.e. EMI
         * rate = annual interest rate / 12 * 100%;
         */
          double EMI;  
          int n;  
   
          n = years * 12;
          rate = rate / 12 * 100;
          EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;
   
          System.out.printf("\nYour monthly EMI is %s for the amount of %s you have borrowed\n", EMI, loanAmount);
    }
}