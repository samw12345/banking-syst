package com.qa.bankingSyst;

public class CreditAccount extends Account {
    public CreditAccount(int id, String name, double amount) {
        super(id, name, amount);
    }

    @Override
    public double Debit(double amount) {
        return super.Debit(amount);
    }
}
