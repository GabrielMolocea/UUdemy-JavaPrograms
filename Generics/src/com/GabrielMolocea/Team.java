package com.GabrielMolocea;

import java.util.ArrayList;

public class Team {
    private String name;
    int played =0;
    int wom =0;
    int lost = 0;
    int tied = 0;
    
    private ArrayList<Player> members = new ArrayList<>();
    
    public Team(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean addPlayer(Player player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + "is picked for team" + this.name);
            return true;
        }
    }
    public int numPlayers(){
        return this.members.size();
    }
    public void  matchResult(Team opponent,int ourScoure,int theirScore){
        if (ourScoure > theirScore){
            wom++;
        }else if (ourScoure == theirScore){
            tied++;
        } else {
            lost++;
        }
        played++;
        if (opponent != null){
            opponent.matchResult(null,theirScore,ourScoure);
        }
    }
    
    public  int ranking(){
        return (wom * 2) + tied;
    }
}
