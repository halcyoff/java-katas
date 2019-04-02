package com.mycompany.app;

import com.mycompany.app.Constants.PrintNumberConstants;

import java.util.Scanner;

public class PrintNumber {
    private static int userInput;
    private static int finalResult;

    public static void main(String[] args) {
        showPrompt();
        getUserInputFromConsole();
//        userInput = 293;
        incrementNumbers();
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

    public static int getFinalResult() {
        return finalResult;
    }

    public static int getUserInput() {
        return userInput;
    }

    public static void incrementNumbers() {
        StringBuilder preliminaryResult = new StringBuilder();
        String input = String.valueOf(userInput);
        for (int i = 0; i < input.length(); i++) {
            String tempChar = String.valueOf(input.charAt(i));
            int temp = Integer.valueOf(tempChar);
            temp++;
            preliminaryResult.append(temp);
        }

        finalResult = Integer.valueOf(preliminaryResult.toString());
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