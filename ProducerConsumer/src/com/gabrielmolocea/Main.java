package com.gabrielmolocea;

import java.util.*;
import java.util.concurrent.locks.*;

import static com.gabrielmolocea.Main.EOF;

public class Main {
    public static final String EOF = "EOF";
    
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<String>();
        ReentrantLock bufferLock = new ReentrantLock();
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN, bufferLock);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);
        
        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}

class MyProducer implements Runnable {
    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;
    
    
    public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }
    
    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};
        
        for (String num : nums) {
            try {
                System.out.println(color + "Adding... " + num);
                bufferLock.lock();
                try {
                    buffer.add(num);
                } finally {
                    bufferLock.unlock();
                }
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }
        System.out.println(color + "Adding EOF and exiting....");
        bufferLock.lock();
        try {
            buffer.add("EOF");
        } finally {
            bufferLock.unlock();
        }
        
    }
}

class MyConsumer implements Runnable {
    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;
    
    public MyConsumer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }
    
    public void run() {
        int counter = 0;
        while (true) {
            if (bufferLock.tryLock()) {
                try {
                    if (buffer.isEmpty()) {
                        //bufferLock.unlock();
                        continue;
                    }
                    System.out.println(color + "The counter = " +counter);
                    counter = 0;
                    if (buffer.get(0).equals(EOF)) {
                        System.out.println(color + "Exiting");
                        //bufferLock.unlock();
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.remove(0));
                    }
                } finally {
                    bufferLock.unlock();
                }
            } else {
                counter++;
            }
        }
    }
}