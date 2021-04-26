package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

class EducationLoan extends Loan {

    @Override
    public void getInterestRate(double rate) {
        this.rate = rate;
    }

}