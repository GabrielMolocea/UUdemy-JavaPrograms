package com.GabrielMolocea;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static  Button btnPrint =  new Button("Print");
    public static void main(String[] args) {
//        class ClickLisinet implements Button.onClickLustener{
//            public ClickLisinet(){
//                System.out.println("I've benn attached");
//            }
//
//            @Override
//            public void onClick(String titile) {
//                System.out.println(titile + " was cliced") ;
//
//            }
//        }
//        btnPrint.setOnClickLustener(new ClickLisinet());
        btnPrint.setOnClickLustener(new Button.onClickLustener() {
            @Override
            public void onClick(String titile) {
                System.out.println(titile + " was clicked");
        
            }
        });
        listen();
    }
    private  static void  listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit =true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}