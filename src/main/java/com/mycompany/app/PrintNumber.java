package com.mycompany.app;

import com.mycompany.app.Constants.PrintNumberConstants;

import java.util.Scanner;

public class PrintNumber {
    private static int userInput;

    public static void main(String[] args) {
        showPrompt();
        userInput = getUserInput();
    }

    public static void showPrompt() {
        System.out.println(PrintNumberConstants.WELCOME_MESSAGE);
        System.out.print(PrintNumberConstants.PROMPT);
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void validateUserInput(int input) {

    }
}