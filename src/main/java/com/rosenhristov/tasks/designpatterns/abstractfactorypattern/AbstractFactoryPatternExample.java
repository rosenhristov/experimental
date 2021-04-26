package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

import java.io.*;

class AbstractFactoryPatternExample {  
      public static void main(String args[])throws IOException {  
       
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
	  
	      System.out.println("Enter the name of Bank from where you want to take loan amount:");
	      String bankName = br.readLine();
		  BankFactory bankFactory = (BankFactory) FactoryCreator.getFactory("Bank");
		  Bank bank = bankFactory.getBank(bankName);

	      System.out.printf("\nEnter the type of loan: 'home', 'business' or 'education' loan:");
	      String loanName = br.readLine();
	      LoanFactory loanFactory = (LoanFactory) FactoryCreator.getFactory("Loan");
		  Loan loan =loanFactory.getLoan(loanName);

	      System.out.printf("\nEnter the interest rate for %s: ", bank.getBankName());
	      double rate = Double.parseDouble(br.readLine());

	      System.out.print("\nEnter the loan amount you want to take: ");
	      double loanAmount = Double.parseDouble(br.readLine());

	      System.out.print("\nEnter the number of years to pay your entire loan amount: ");
	      int years = Integer.parseInt(br.readLine());
			  
	      System.out.printf("\nYou are taking the loan from %s: ", bank.getBankName());
		  loan.getInterestRate(rate);
		  loan.calculateLoanPayment(loanAmount, years);
	  }
}