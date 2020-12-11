package com.gabrielmolocea;

import org.junit.runner.*;
import org.junit.runners.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gabriel on 11/12/2020
 */

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {
    
    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;
    
    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }
    
    @org.junit.Before
    public void setup() {
        account = new BankAccount("Gabriel", "Molocea", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test....");
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {325.14, true, 1325.14},
                {489.33, true, 1489.33},
                {1000.00, true, 2000.00}
        });
    }
    
    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Gabriel",  "Molocea", 1000, BankAccount.CHECKING);
        account.deposit(amount, branch);
//        assertEquals(1200.00, balance,  0);
        assertEquals(expected, account.getBalance(), .01);
    }
}
