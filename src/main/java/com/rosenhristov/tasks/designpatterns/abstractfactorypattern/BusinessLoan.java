package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

class BusinessLoan extends Loan {

	@Override
	public void getInterestRate(double rate) {
		this.rate = rate;
    }

}
