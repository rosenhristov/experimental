package com.rosenhristov.tasks.designpatterns.singletonpattern;

import java.io.Serializable;

class EarlySingleton implements Serializable {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static EarlySingleton obj = new EarlySingleton();//Early, instance will be created at load time  
    private EarlySingleton() {
    	
    }  
    public static EarlySingleton getEarlySingleton(){  
    	return obj;  
    }  
    public void doSomething(){  
    	System.out.println("A method in a Singleton class with early created instance.");  
    }
    protected Object readResolve() {  
        return getEarlySingleton();  
    }
}  
