package com.gabrielmolocea;

public class Main {

    public static void main(String[] args) {
        String varFour = "This is private to main()";
        
        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        System.out.println("scopeInstance varOne = " + scopeInstance.getVarOne());
        System.out.println(varFour);
        
        
        scopeInstance.timeTow();
        System.out.println("*********************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        
        innerClass.timeTow();
    }
}
