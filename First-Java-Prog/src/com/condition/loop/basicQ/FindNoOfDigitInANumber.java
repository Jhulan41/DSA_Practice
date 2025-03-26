package com.condition.loop.basicQ;

import java.util.Scanner;

public class FindNoOfDigitInANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num= in.nextInt();
        int count = 0;

        while(num>0){
            int r = num%10;
            if(r==n){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
