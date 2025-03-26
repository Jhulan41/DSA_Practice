package com.jhulan;

import java.util.ArrayList;

public class Looping {
    public static void main(String[] args) {
        int x=1;
        while(x!=5){
            System.out.println(x);
            x++;
        }
        for(int i=0; i<5; i++){
            System.out.println("hello baby");
        }
        callme();
        String[] arr = new String[]{"Hello Darling"};
        Main.main(arr);
//        Main r = new Main();
    }

    static void callme(){
        for(int i=0; i<5; i++){
            System.out.println("Good bye baby");
        }
    }
}
