package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

class ICICI extends Bank {
    private final String BNAME;  
    ICICI(){  
             BNAME="ICICI BANK";  
     }  
     public String getBankName() {  
               return BNAME;  
     }  
}  