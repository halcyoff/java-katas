package com.mycompany.app;

import com.mycompany.app.Constants.PrintNumberConstants;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintNumber {
    private static int userInput;

    public static void main(String[] args) {
//        showPrompt();
//        getUserInputFromConsole();
        userInput = 293;
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

    public static int getUserInput() {
        return userInput;
    }

    public static int incrementNumbers() {
        int length = (int) (Math.log10(userInput));
        int nineCount = 0;
        int divBy = 1;
        List<Integer> incrementedNumberParts = new ArrayList<>();

        divBy =  (int) Math.pow(10, length);

        System.out.println(length);
        System.out.println(divBy);
        System.out.println(userInput - divBy);
        System.out.println(userInput / divBy);

        for (int i = 0; i < length; i++) {
            int temp = 0;

            if (!incrementedNumberParts.isEmpty()) {
            }
            System.out.println(userInput / divBy);
            incrementedNumberParts.add(userInput / divBy);
            divBy /= 10;
        }

        return 0;
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