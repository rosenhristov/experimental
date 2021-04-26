
package com.rosenhristov.tasks.designpatterns.factorypattern;

import java.io.*;    

/**
 * Created by Rossen Hristov, 13 Feb. 2017
 * The program is a practical representation of the Factory Pattern in which is used an example for creation of different types of bills. 
 */

class GenerateBill{  
    
	public static void main(String args[])throws IOException{  
      PlanFactory planFactory = new PlanFactory();  
        
      System.out.print("Enter the name of plan for which the bill will be generated: ");  
      BufferedReader bufReader =new BufferedReader(new InputStreamReader(System.in));  
  
      String planName=bufReader.readLine();  
      System.out.print("Enter the number of units for bill will be calculated: ");  
      int units=Integer.parseInt(bufReader.readLine());  
  
      Plan p = planFactory.getPlan(planName);  
      
      //call getRate() method and calculateBill()method of DomesticPaln.  
      System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
      p.getRate();  
      p.calculateBill(units);  
	}  
}