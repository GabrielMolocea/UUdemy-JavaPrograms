package com.gabrielmolocea;

public class Main {

    public static void main(String[] args) {
//	    SomeClass one = new SomeClass("one");
//	    SomeClass tow = new SomeClass("tow");
//	    SomeClass three = new SomeClass("three");
//
//
//		System.out.println(one.getInstanceNumber());
//		System.out.println(tow.getInstanceNumber());
//		System.out.println(three.getInstanceNumber());
//
//		System.out.println(Math.PI);
//
//		int pw = 654321;
//		Password password = new ExtendedPassword(pw);
//		password.storePassword();
//
//		password.letMeIn(1);
//		password.letMeIn(77654321);
//		password.letMeIn(887);
//		password.letMeIn(-1);
//		password.letMeIn(654321);
//
	
		System.out.println("Main method called");
		SIBTest test = new SIBTest();
		test.someMethod();
		System.out.println("Owner is " +SIBTest.owner);
    }
}
