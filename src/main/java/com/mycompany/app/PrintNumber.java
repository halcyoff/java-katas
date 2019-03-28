package com.mycompany.app;

import com.mycompany.app.Constants.PrintNumberConstants;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {

    }

    public static void showPrompt() {
        System.out.println(PrintNumberConstants.WELCOME_MESSAGE);
        System.out.print(PrintNumberConstants.PROMPT);
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}