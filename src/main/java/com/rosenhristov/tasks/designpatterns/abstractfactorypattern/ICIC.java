package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

class ICICI implements Bank{  
    private final String BNAME;  
    ICICI(){  
             BNAME="ICICI BANK";  
     }  
     public String getBankName() {  
               return BNAME;  
     }  
}  