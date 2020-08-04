package com.GabrielMolocea;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagePrinted = 0;
    }

    public int addToner (int tonerAmount){
        if (tonerLevel > 0 )
    }

}
