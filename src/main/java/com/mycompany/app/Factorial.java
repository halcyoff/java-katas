package com.mycompany.app;

import java.util.Scanner;

public class Factorial {
    private Scanner scanner;

    public Factorial() {
        scanner = new Scanner(System.in);
    }

    public static void main(String args[]) {
        System.out.println("Welcome to the factorial app!");
        System.out.print("Enter an integer greater than 0: ");
    }
}
