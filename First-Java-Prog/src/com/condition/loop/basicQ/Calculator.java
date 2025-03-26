package com.condition.loop.basicQ;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Enter the operator or X to exit: ");
            char ch = in.next().trim().charAt(0);

            if (ch == 'x' || ch == 'X') {
                break;
            }

            System.out.println("Enter first number: ");
            int n1 = in.nextInt();

            System.out.println("Enter second number: ");
            int n2 = in.nextInt();

            int res = 0;

            if (ch == '+' || ch == '*' || ch == '-' || ch == '/' || ch == '%') {
                if (ch == '+') {
                    res = n1 + n2;
                }
                if (ch == '-') {
                    res = n1 - n2;
                }
                if (ch == '*') {
                    res = n1 * n2;
                }
                if (ch == '/') {
                    if (n2 == 0) {
                        System.out.println("∞");
                        continue;
                    } else {
                        res = n1 / n2;
                    }

                }
                if (ch == '%') {
                    res = n1 % n2;
                }
                System.out.println(res);
            } else {
                System.out.println("Invalid input");
            }


        }
    }
}
