package com.gabrielmolocea;

import static com.gabrielmolocea.ThreadColor.ANSI_RED;

/**
 * Gabriel created on 03/11/2020 inside the package - com.gabrielmolocea
 */

public class MyRunnable implements Runnable {
    
    
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello form MyRunnable`s implementation of run()");
    }
}
