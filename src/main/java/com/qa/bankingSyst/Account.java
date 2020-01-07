package com.qa.bankingSyst;


import java.util.ArrayList;

public class Account {
    private int id;
    private String name;
    private double balance;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        Credit(amount);



    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double Credit(double amount) {
        double deposit = 0;
        balance += deposit;
        transactions.add(new Transaction(amount));
        return balance;
    }

    public double Debit(double amount) {
        double withdrawal = 0;
        balance += withdrawal*-1;
        transactions.add(new Transaction(withdrawal));
        return balance;

    }

    public double CurrentBalance() {
     this.balance=balance;
     double balance = 0;
     for(Transaction txn: transactions) {
         balance+= txn.getAmount();
     }
        return balance;



}

    public double AvailableBalance() {
    this.balance = balance;
    return balance;
}


}


