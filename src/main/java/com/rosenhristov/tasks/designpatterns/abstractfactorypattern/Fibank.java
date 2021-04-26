package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

public class Fibank extends Bank {

    Fibank() {
        this.bankName = BankType.FIBANK.toString();;
     }



    @Override
    public String getBankName() {
               return bankName;
     }  
}  