package com.gabrielmolocea;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;
    
    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + varOne);
        
    }
    
    public int getVarOne() {
        return varOne;
    }
    
    public void  timeTow(){
            int varTow = 2;
            for (int i=0;i<10;i++){
                System.out.println(i + " time tow is " + i * varTow);
            }
    }
    
    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }
    
    public class InnerClass{
        private int varThree = 3;
        
        public InnerClass() {
            System.out.println("InnerClass created, varOne is +"+ varOne +" and  varThree is " + varThree);
        }
        
        public void  timeTow(){
            System.out.println("varOne is still available here: " + varOne);
            for (int i=0;i<10;i++){
                System.out.println(i + " time tow is " + i * varThree);
            }
        }
    }
}
