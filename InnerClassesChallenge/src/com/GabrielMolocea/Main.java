package com.GabrielMolocea;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
	Album album = new Album("StormBringer","Deep Purple");
	album.addSong("StormBringer",4.6);
    album.addSong("Love don't mean a thing",4.22);
    album.addSong("Holy man",4.3);
    album.addSong("Hold on",5.6);
    album.addSong("Lady double dealer",3.21);
    album.addSong("You can't do it right",4.27);
    album.addSong("The gypsy",4.2);
    album.addSong("Soldier of fortune",3.13);

    albums.add(album);
// New Object Created
    album = new Album("For those about to rock","AC/DC");
    album.addSong("For those about to rock",5.44);
    album.addSong("I put the finger on you",3.25);
    album.addSong("Lets go",3.45);
    album.addSong("Inject the venom",3.33);
    album.addSong("SnowBalled",4.51);
    album.addSong("Evil walks",3.45);
    album.addSong("C.O.D",5.25);
    album.addSong("Breaking the rules",5.32);
    album.addSong("Night of the long knives",5.12);

    albums.add(album);

    LinkedList<Song> playList = new LinkedList<Song>();
    albums.get(0).addToPlayList("You can't do it right",playList);
    albums.get(0).addToPlayList("Holy man",playList);
    albums.get(0).addToPlayList("Speed king",playList);//Does not exist
    albums.get(0).addToPlayList(1,playList);
    albums.get(1).addToPlayList(5,playList);
    albums.get(1).addToPlayList(3,playList);
    albums.get(1).addToPlayList(2,playList);
    albums.get(1).addToPlayList(24,playList); //No tack 24


    play(playList);

    }
    private static void play(LinkedList<Song> plyList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward =true;
        ListIterator<Song> listIterator = plyList.listIterator();
        if (plyList.size() == 0){
            System.out.println("No song in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();

        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("PlayList complete.");
                    quit =true;
                    break;
                case 1: // Next song
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward =true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward =false;
                    }
                    break;
                case 2: //Previous song
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward =false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward =true;
                    }
                    break;
                case 3:// Replay song
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward =false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4://Song list
                    printList(plyList);
                    break;
                case 5://Actions
                    printMenu();
                    break;
                case 6:
                    if (plyList.size()> 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to pay next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list song in the play list\n"+
                "5 - print available actions.\n"+
                "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==========================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==========================");
    }


}
