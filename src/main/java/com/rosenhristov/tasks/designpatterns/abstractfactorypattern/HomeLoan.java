package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

class HomeLoan extends Loan {

   @Override
   public void getInterestRate(double rate){
	   this.rate = rate;
   }  
}