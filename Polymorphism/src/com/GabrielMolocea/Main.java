package com.GabrielMolocea;

class  Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependentsDay extends Movie{
    public IndependentsDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wats");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }

    class Forgetable extends Movie{
        public Forgetable() {
            super("Forgetable");
        }
        //
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
