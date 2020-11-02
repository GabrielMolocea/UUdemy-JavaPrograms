package com.gabrielmolocea;

import static com.gabrielmolocea.ThreadColor.ANSI_BLUE;

/**
 * Gabriel created on 02/11/2020 inside the package - com.gabrielmolocea
 */

public class AnotherThread extends Thread {
    
    
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from another thread");;
    }
}
