package com.rosenhristov.tasks.designpatterns.factorypattern;

/**
 * Created by Rossen 13.02.2017 
*/

public abstract class Plan {
        
	protected double rate;  
    abstract void getRate();  
     
    public void calculateBill(int units){  
        System.out.println(units*rate);  
    }  
}
