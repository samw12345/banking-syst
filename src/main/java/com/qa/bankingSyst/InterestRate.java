package com.qa.bankingSyst;

public enum InterestRate {
    accountValueAtOrOver10000(0.07),
    accountValueUnder10000(0.03);

    private final double rate;

    InterestRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}

