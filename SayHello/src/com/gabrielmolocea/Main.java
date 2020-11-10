package com.gabrielmolocea;

import sun.awt.windows.*;

public class Main {

    public static void main(String[] args) {
	final PolitePerson gabriel = new PolitePerson("Gabriel");
	final PolitePerson tom = new PolitePerson("Tom");
	
	new Thread(new Runnable() {
        @Override
        public void run() {
            gabriel.sayHello(tom);
        }
    }).start();
	
	new Thread(new Runnable() {
        @Override
        public void run() {
            tom.sayHello(gabriel);
        }
    }).start();
	
    }
    static class PolitePerson {
        private final String name;
    
        public PolitePerson(String name) {
            this.name = name;
        }
    
        public String getName() {
            return name;
        }
        
        public synchronized void sayHello(PolitePerson person) {
            System.out.format("%s: %s " + " has said hello to me!%n", this.name, person.getName());
            person.sayHelloBack(this);
        }
        
        public synchronized void sayHelloBack(PolitePerson person) {
            System.out.format("%s: %s" + " has said hello back to me!%n", this.name, person.getName());
        }
        
    }
}
