package com.qa.bankingSyst;

import java.sql.Time;
import java.time.Instant;
import java.util.Date;

public class Transaction {
    private double amount;
    private Instant when = Instant.now();
    private Date date;
    private Time time;

    public Transaction(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public String getWhen() {
        return when.toString();
    }

}
