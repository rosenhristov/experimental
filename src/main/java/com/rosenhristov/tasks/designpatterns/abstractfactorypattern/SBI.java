package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

class SBI extends Bank {
    private final String BNAME;  
    public SBI(){  
    	BNAME="SBI BANK";  
    }  
    public String getBankName(){  
    	 return BNAME;  
    }  
}  