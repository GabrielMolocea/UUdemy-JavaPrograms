package com.gabrielmolocea;

public class Password {
    private static final  int key = 789456123;
    private final int encryptedPassword;
    
    public Password(int password) {
        this.encryptedPassword = encryptedDecrypt(password);
    }
    
    private int encryptedDecrypt(int password){
        return password ^ key;
    }
    
    public final void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }
    
    public boolean letMeIn(int password){
        if (encryptedDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot com in");
            return false;
        }
    }
}
