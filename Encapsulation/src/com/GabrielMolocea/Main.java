package com.GabrielMolocea;

public class Main {

    public static void main(String[] args) {
//        Player player =  new Player();
//        player.name = "Gabriel";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());
//
//        damage =11;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Gabriel", 200,"Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
