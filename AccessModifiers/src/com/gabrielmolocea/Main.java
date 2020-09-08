package com.gabrielmolocea;

public class Main {

    public static void main(String[] args) {
        Account gabrielAccount = new Account("Gabriel");
        gabrielAccount.deposit(1000);
        gabrielAccount.withdraw(500);
        gabrielAccount.withdraw(-200);
        gabrielAccount.deposit(-20);
        gabrielAccount.calculateBalance();
    
        System.out.println("Balance on account is "+ gabrielAccount.getBalance());
    }
}
