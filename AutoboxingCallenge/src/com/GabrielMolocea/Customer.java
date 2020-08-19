package com.GabrielMolocea;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name,double intAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(intAmount);
    }

    public  void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
