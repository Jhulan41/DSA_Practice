package com.condition.loop;

import java.util.Scanner;
import java.util.*;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f0 =0 ;
        int f1=1;
        int count=2;

        while(count <= n){
            int temp = f1;
            f1=f0+f1;
            f0=temp;
//            System.out.println(f1);
            count++;
        }
        if(n==0){
            System.out.println(f1);
        }
//        System.out.println(f1);

    }
}
