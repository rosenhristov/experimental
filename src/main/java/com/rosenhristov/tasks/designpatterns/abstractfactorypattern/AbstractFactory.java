                                                                                                        package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

abstract class AbstractFactory {  
      public abstract Bank getBank(String bank);  
      public abstract Loan getLoan(String loan);  
  }  
