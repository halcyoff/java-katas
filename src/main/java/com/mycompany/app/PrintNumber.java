package com.mycompany.app;

import com.mycompany.app.Constants.PrintNumberConstants;

import java.util.Scanner;

public class PrintNumber {
    private static int userInput;

    public static void main(String[] args) {
        showPrompt();
        getUserInputFromConsole();
        System.out.print(userInput);
    }

    public static void showPrompt() {
        showWelcomeMessage();
        showNumberPrompt();
    }

    public static void getUserInputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
        validateUserInput(userInput);
    }

    public static void validateUserInput(int input) {
        if (input < 0) {
            showErrorMessage();
            showNumberPrompt();
            getUserInputFromConsole();
        }
    }

    public static int getUserInput() {
        return userInput;
    }

    private static void showWelcomeMessage() {
        System.out.println(PrintNumberConstants.WELCOME_MESSAGE);
    }

    private static void showNumberPrompt() {
        System.out.print(PrintNumberConstants.NUMBER_PROMPT);
    }

    private static void showErrorMessage() {
        System.out.println(PrintNumberConstants.ERROR_MESSAGE);
    }
}