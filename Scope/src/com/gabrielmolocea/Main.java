package com.gabrielmolocea;

public class Main {

    public static void main(String[] args) {
        String privateVar = "This is private to main()";
        
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar = " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);
        
        
        scopeInstance.timeTow();
        System.out.println("*********************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timeTow();
    }
}
