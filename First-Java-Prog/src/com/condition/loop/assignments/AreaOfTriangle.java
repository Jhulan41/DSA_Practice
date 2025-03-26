package com.condition.loop.assignments;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Enter the base of the triangle or enter 0 to exit: ");
            int base = in.nextInt();
            if (base == 0) break;

            System.out.println("Enter the height of the triangle: ");
            int height = in.nextInt();

            System.out.println("Area of the Triangle is : " + (1 / 2f) * base * height);
        }
    }
}
