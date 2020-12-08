package com.gabrielmolocea;

import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    
    @org.junit.jupiter.api.Test
    public void deposit() {
        BankAccount account = new BankAccount("Gabriel",  "Molocea", 1000, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance,  0);
//        assertEquals(1200.00, account.getBalance(), 0);
        
    }
    
    @org.junit.jupiter.api.Test
    public void withdraw() {
        fail("This test has yet to be implemented");
    }
    
    @org.junit.jupiter.api.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Gabriel",  "Molocea", 1000, BankAccount.CHECKING);
        account.deposit(200.00, true);
//        assertEquals(1200.00, balance,  0);
        assertEquals(1200.00, account.getBalance(), 0);
    }
    
    @org.junit.jupiter.api.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Gabriel", "Molocea", 1000, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }
    
    @org.junit.jupiter.api.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Gabriel", "Molocea", 1000, BankAccount.CHECKING);
        assertTrue("The account in NOT a checking account", account.isChecking());
    }
}