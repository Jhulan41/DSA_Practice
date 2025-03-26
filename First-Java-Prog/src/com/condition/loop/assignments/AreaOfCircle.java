package com.condition.loop.assignments;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Enter the radius to calculate area of circle or enter 0 to exit: ");
            int r = in.nextInt();
            if (r == 0) break;
            System.out.println("Area of the circle with radius "+r+" is : "+ (22/7f)*r*r);
        }
    }
}
