package com.rosenhristov.tasks.designpatterns.singletonpattern;

import java.io.Serializable;

class LazySingleton implements Serializable {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static LazySingleton obj;  
    private LazySingleton(){
    	
    }  
    public static LazySingleton getLazySingleton() {  
    	if (obj == null){  
    		synchronized(LazySingleton.class) {  
    			if (obj == null){  
    				obj = new LazySingleton();//instance will be created at request time  
    			}  
    		}              
    	}  
    	return obj;  
    }  
    public void doSomething(){  
    	System.out.println("A method in a Singleton class with early created instance.");
    }
    protected Object readResolve() {  
        return getLazySingleton();  
    }
}  
