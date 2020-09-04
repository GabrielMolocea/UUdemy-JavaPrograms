package com.gabrielmolocea;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    
    
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sandSerifLarge = new Font("SansSerif",Font.BOLD,18);
        Font sandSerifSmall = new Font("SansSerif",Font.BOLD,12);
        g.setFont(sandSerifLarge);
        g.drawString("The Complete Java Developer Course",60,60);
        g.setFont(sandSerifSmall);
        g.drawString("by Gabriel Molocea",60,100);
    }
    
}
