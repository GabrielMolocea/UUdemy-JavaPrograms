package com.gabrielmolocea;

/**
 * Created by Gabriel on 14/11/2020
 */

public class BankAccount {
    
    private double balance;
    private String accountName;
    
    public BankAccount(String accountName, double balance) {
        this.balance = balance;
        this.accountName = accountName;
    }
    
//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }
    
    public void deposit(double amount) {
        synchronized (this) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        synchronized (this) {
            balance -= amount;
        }
    }
}
