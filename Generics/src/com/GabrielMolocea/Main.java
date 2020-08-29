package com.GabrielMolocea;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootbalPlayer joe = new FootbalPlayer("Joe");
        BaseballPlayer pat =  new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        
        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);
        
        System.out.println(adelaideCrows.numPlayers());
    }
}
