package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

public enum FactoryType {

    BANK ("bank"),
    LOAN ("loan");

    private String value;

    FactoryType(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static boolean isValid(String value) {
        return value.equalsIgnoreCase(BANK.toString())
                || value.equalsIgnoreCase(LOAN.toString());
    }

    @Override
    public String toString() {
        return value;
    }
}
