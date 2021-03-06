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
        if (tonerLevel > 0 && tonerAmount <= 100){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages (int pages){
        int pagesToPint = pages;
        if (this.duplex){
            pagesToPint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagePrinted += pagesToPint;
        return pagesToPint;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
