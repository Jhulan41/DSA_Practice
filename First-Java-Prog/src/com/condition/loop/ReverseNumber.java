package com.condition.loop;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12234;

        int res= 0;
        while(n>0){
            int k=n%10;
            res = res*10+k;
            n=n/10;
        }
        System.out.println(res);


    }
}
