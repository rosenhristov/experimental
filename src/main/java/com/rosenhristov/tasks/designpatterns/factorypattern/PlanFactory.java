
package com.rosenhristov.tasks.designpatterns.factorypattern;


/**
 * Created by Rossen 13.02.2017 
*/

class PlanFactory{  
          
	//use getPlan method to get object of type Plan   
	public Plan getPlan(String planType){  
		if(planType == null){  
			return null;  
        }  
        else if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
        	return new DomesticPlan();  
        }   
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
        	return new CommercialPlan();  
        }   
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
        	return new InstitutionalPlan();  
        }  
          return null;  
       }  
    }
