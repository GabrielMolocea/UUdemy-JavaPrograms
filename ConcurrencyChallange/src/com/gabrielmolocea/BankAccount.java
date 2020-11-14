package com.gabrielmolocea;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

/**
 * Created by Gabriel on 14/11/2020
 */

public class BankAccount {
    
    private double balance;
    private String accountName;
    private Lock lock;
    
    public BankAccount(String accountName, double balance) {
        this.balance = balance;
        this.accountName = accountName;
        this.lock = new ReentrantLock();
    }
    
//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }
    
    public void deposit(double amount) {
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    balance += amount;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void withdraw(double amount) {
        try {
            if (lock.tryLock(1000,TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }
        } catch (InterruptedException e) {
        
        }
    }
    public String getAccountName() {
        return accountName;
    }
    
    public void printAccountNumber() {
        System.out.println("Account number = " + accountName);
    }
}
