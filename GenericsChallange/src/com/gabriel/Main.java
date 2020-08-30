package com.gabriel;

public class Main {
    
    public static void main(String[] args) {
        League<Team<FootbalPlayer>> footballLeague = new League<>("AFL");
        
        Team<FootbalPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootbalPlayer> melbourne = new Team<>("Melbourne");
        Team<FootbalPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootbalPlayer> fremantle = new Team<>("Fremantle");
        
        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
        
        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,0);
        adelaideCrows.matchResult(fremantle,2,1);
        
        footballLeague.showLeagueTable();
    }

}
