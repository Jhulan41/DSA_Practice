package com.condition.loop.assignments;

import java.util.Scanner;

public class AreaOfTriangle2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Enter the three sides of the triangle or enter 0 to exit: ");
            int a = in.nextInt();
            if (a == 0) break;
            int b = in.nextInt();
            int c = in.nextInt();

            int sp = (a + b + c) / 2;

            System.out.println("Area of the Triangle is : " + (double) Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c)));
        }
    }
}
