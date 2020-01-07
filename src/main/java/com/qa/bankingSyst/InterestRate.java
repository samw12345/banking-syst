package com.qa.bankingSyst;

public enum InterestRate {
    HOME_LOAN(5.67),
    BUSINESS_LOAN(2.34);

    private final double rate;


    InterestRate(double rate) {
        this.rate = rate;
    }
    public double rate(){
    return rate;}}


