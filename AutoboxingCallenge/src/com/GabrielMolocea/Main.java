package com.GabrielMolocea;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Romania Bank");

        bank.addBranch("Usa");
        bank.addCustomer("Usa", "Gabriel", 50.20);
        bank.addCustomer("Usa", "Marian", 175.34);
        bank.addCustomer("Usa", "Percy", 220.12);


        bank.addBranch("Bucurescti");
        bank.addCustomer("Bucurescti", "Bob", 150.54);

        bank.addCustomer("Bucurescti", "Gabriel", 50.20);
        bank.addCustomer("Bucurescti", "Marian", 175.34);
        bank.addCustomer("Bucurescti", "Percy", 220.12);

        bank.listCustomers("Usa", true);

    }

}
