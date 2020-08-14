package com.GabrielMolocea;

public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts(String phoneNumber,String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts createContact(String name, String phoneNumber){
        return new Contacts(name,phoneNumber);
    }
}
