package com.condition.loop.basicQ;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x;

        if(a>b){
            x=a;
        }else{
            x=b;
        }
        if(x<c){
            x=c;
        }

        System.out.println("Largest number is: " + x );
    }
}
