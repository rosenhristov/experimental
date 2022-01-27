package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

public enum LoanType {

    HOME_LOAN("home"),
    BUSINESS_LOAN("business"),
    EDUCATION_LOAN("education");

    private String value;

    LoanType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static boolean isValid(String value) {
        return value.equalsIgnoreCase(HOME_LOAN.toString())
                        || value.equalsIgnoreCase(BUSINESS_LOAN.toString())
                        || value.equalsIgnoreCase(EDUCATION_LOAN.toString());
    }

    public static boolean isInvalid(String value) {
        return !isValid(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
