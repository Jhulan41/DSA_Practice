package com.condition.loop.assignments;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Enter the Length and breadth to calculate area of rectangle or enter 0 to exit: ");
            int l = in.nextInt();
            if (l == 0) break;
            int b = in.nextInt();
            System.out.println("Area of the rectangle is " + l * b);
        }
    }
}
