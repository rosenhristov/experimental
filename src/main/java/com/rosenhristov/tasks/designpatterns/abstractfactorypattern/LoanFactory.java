package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

class LoanFactory extends AbstractFactory
{
	@Override
    public Loan getLoan(String input) {

		if (LoanType.isInvalid(input)) {
			throw new IllegalArgumentException(
					String.format(
							"Value '%s' is not a valid input. Choose between "
							+ "'home', 'education' or 'business' loan",
							input)
			);
		}

		LoanType loanType = LoanType.valueOf(input);
		Loan loan;

		switch (loanType) {
			case HOME_LOAN:
				loan = new HomeLoan();
				break;
			case EDUCATION_LOAN:
				loan = new EducationLoan();
				break;
			case BUSINESS_LOAN:
				loan = new BusinessLoan();
				break;
			default:
				loan = null;
				break;
		}
		return loan;
    }  
}  