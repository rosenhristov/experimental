package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

class FactoryCreator
{
    public static AbstractFactory getFactory(String choice) {

    	FactoryType factory = FactoryType.valueOf(choice);
    	AbstractFactory abstractFactory;

    	switch (factory) {
    		case BANK :
				abstractFactory = new BankFactory();
				break;
			case LOAN:
				abstractFactory = new LoanFactory();
				break;
			default:
				abstractFactory = null;
				break;
		}
    	return abstractFactory;
    }
}