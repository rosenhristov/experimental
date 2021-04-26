package com.rosenhristov.tasks.designpatterns.prototypepattern;

class EmployeeRecord implements Prototype {  
    
    private int id;  
    private String name, designation;
    private double salary;
    private String address;
       
    public EmployeeRecord(){  
             System.out.println("   Employee Records of Scitec Corporation ");  
             System.out.println("********************************************");  
             System.out.println("EmployeeID"+"\t"+"EmployeeName"+"\t"+"EmployeeDesignation"+"\t"+"EmployeeSalary"+"\t\t"+"Eaddress");  
       
	}
    public  EmployeeRecord(int id, String name, String designation, double salary, String address) {             
		this();  
	    this.id = id;  
	    this.name = name;  
	    this.designation = designation;  
	    this.salary = salary;  
	    this.address = address;  
    }     
    public void showRecord(){   
    	System.out.println(id + "\t\t" + name + "\t" + designation + "\t\t" + salary +
    			"\t\t" + address);  
    }
    
    public Prototype getClone() {  
    	return new EmployeeRecord(id,name,designation,salary,address);  
    }  
}