package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

class TbiBank extends Bank {

    public TbiBank() {
        this.bankName = "TBI Bank";
    }  

    @Override
    public String getBankName(){
    	 return this.bankName;
    }  
}  