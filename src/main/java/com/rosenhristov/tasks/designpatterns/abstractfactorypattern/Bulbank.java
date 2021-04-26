package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

public class Bulbank extends Bank {

   public Bulbank(){
           this.bankName = "Bulbank";
   }

    @Override
    public String getBankName() {
             return bankName;
   }  
}  
