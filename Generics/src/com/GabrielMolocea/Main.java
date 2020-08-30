package com.GabrielMolocea;

public class Main {

    public static void main(String[] args) {
        FootbalPlayer joe = new FootbalPlayer("Joe");
        BaseballPlayer pat =  new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        
        Team<FootbalPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);
        
        System.out.println(adelaideCrows.numPlayers());
        
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        
        Team<SoccerPlayer> brokenTeam = new Team<>("this will work now ");
        brokenTeam.addPlayer(beckham);
    }
}
