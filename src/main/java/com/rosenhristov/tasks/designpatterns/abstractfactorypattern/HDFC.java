package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

class HDFC implements Bank {  
   private final String BNAME;  
   public HDFC(){  
           BNAME="HDFC BANK";  
   }  
   public String getBankName() {  
             return BNAME;  
   }  
}  
