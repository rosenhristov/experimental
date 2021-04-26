package com.rosenhristov.tasks.designpatterns.builderpattern;

public class CDBuilder {  
    public CDType buildSonyCD() {
       CDType cds=new CDType();  
       cds.addItem(new Sony());  
       return cds;  
}  
	public CDType buildSamsungCD() {  
		CDType cds=new CDType();  
		cds.addItem(new Balkanton());  
		return cds;  
	}  
}
