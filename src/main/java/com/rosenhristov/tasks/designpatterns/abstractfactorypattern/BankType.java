package com.rosenhristov.tasks.designpatterns.abstractfactorypattern;

public enum BankType {
    BULBANK("Bulbank"),
    FIBANK ("Fibank"),
    TBI_BANK("TBI Bank");

    private String value;

    BankType(String value) {
        this.value = value;
    }



    public void setValue(String value) {
        this.value = value;
    }

    public static boolean isValid(String input) {
        return input.equalsIgnoreCase(BULBANK.toString())
                || input.equalsIgnoreCase(FIBANK.toString())
                || input.equalsIgnoreCase(TBI_BANK.toString());
    }

    public static boolean isInvalid(String input) {
        return !isValid(input);
    }

    @Override
    public String toString() {
        return value;
    }
}
