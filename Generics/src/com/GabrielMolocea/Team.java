package com.GabrielMolocea;

import java.util.ArrayList;

public class Team<T extends  Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int wom = 0;
    int lost = 0;
    int tied = 0;
    
    private ArrayList<T> members = new ArrayList<>();
    
    public Team(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + "is picked for team" + this.name);
            return true;
        }
    }
    
    public int numPlayers() {
        return this.members.size();
    }
    
    public void matchResult(Team<T> opponent, int ourScoure, int theirScore) {
        String massage;
        
        if (ourScoure > theirScore) {
            wom++;
            massage= " beat ";
        } else if (ourScoure == theirScore) {
            tied++;
            massage = " drew with ";
        } else {
            lost++;
            massage = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + massage + opponent.getName());
            opponent.matchResult(null, theirScore, ourScoure);
        }
    }
    
    public int ranking() {
        return (wom * 2) + tied;
    }
    
    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        } else if (this.ranking() < team.ranking()){
            return 1;
        } else {
            return 0;
        }
    }
}
