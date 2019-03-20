package com.mycompany.app;

import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial app!");
        System.out.print("Enter an integer greater than 0: ");
        int input = scanner.nextInt();
        System.out.println(getFactorial(input));
    }

    public static int getFactorial(int num) {
        if (num == 1) {
            return num;
        }
        return num * getFactorial(num - 1);
    }
}
