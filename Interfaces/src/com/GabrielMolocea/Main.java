package com.GabrielMolocea;

public class Main {

    public static void main(String[] args) {
	ITelephone gabrielPhone;
	gabrielPhone = new DeskPhone(123456);
	gabrielPhone.powerOn();
	gabrielPhone.callPhone(123456);
	gabrielPhone.answer();
	
	gabrielPhone = new MobilePhone(465789);
	gabrielPhone.powerOn();
	gabrielPhone.callPhone(465789);
	gabrielPhone.answer();
	
	
    }
}
