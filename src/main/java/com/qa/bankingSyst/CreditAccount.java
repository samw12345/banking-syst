package com.qa.bankingSyst;

public class CreditAccount extends Account {
    public CreditAccount(int id, String name, double amount) {
        super(id, name, amount);
    }

    @Override
    public double Debit(double amount) {
        if(super.AvailableBalance() - amount < 0){
            double withdrawal = amount + ((InterestRate.HOME_LOAN.rate() / 100) * amount);
            super.Debit(withdrawal);
        }
        return super.Debit(amount);
    }
}
