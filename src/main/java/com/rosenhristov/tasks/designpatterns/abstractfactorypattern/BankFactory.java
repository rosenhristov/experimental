package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String input) {

		if (BankType.isInvalid(input)) {
			throw new IllegalArgumentException(
					String.format(
							"Value '%s' is not a valid input. Choose between "
							+ "'Bulbank', 'Fibank' or 'TBI Bank'",
							input)
			);
		}

		BankType bankType = BankType.valueOf(input);
		Bank bank;

		switch (bankType) {
			case BULBANK:
				bank = new Bulbank();
				break;
			case FIBANK:
				bank = new Fibank();
				break;
			case TBI_BANK:
				bank = new TbiBank();
				break;
			default:
				bank = null;
				break;
		}
		return bank;
	}
}
