package com.gabrielmolocea;

import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    public BankAccount account;
    private static int count;
    
    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }
    
    @org.junit.Before
    public void setup() {
        account = new BankAccount("Gabriel",  "Molocea", 1000, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }
    
    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance,  0);
//        assertEquals(1200.00, account.getBalance(), 0);
        
    }
    
    @org.junit.Test
    public void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400, balance, 0);
    }
    
    
    @org.junit.Test (expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
        account.withdraw(600.0, false);
        fail("Should have thrown an IllegalArgumentException");
    }
    
    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Gabriel",  "Molocea", 1000, BankAccount.CHECKING);
        account.deposit(200.00, true);
//        assertEquals(1200.00, balance,  0);
        assertEquals(1200.00, account.getBalance(), 0);
    }
    
    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Gabriel", "Molocea", 1000, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }
    
    @org.junit.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Gabriel", "Molocea", 1000, BankAccount.CHECKING);
        assertTrue("The account in NOT a checking account", account.isChecking());
    }
}