package com.mycompany.app;

import com.mycompany.app.Constants.PrintNumberConstants;
import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrintNumberTest {
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    private static final int USER_INPUT = 123;
    private static final int INVALID_INPUT = -1;
    private static final int FINAL_RESULT = 234;

    @Test
    public void testConsoleOutput() {
        ByteArrayOutputStream outMessages = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outMessages, true));
        PrintNumber.showPrompt();

        assertTrue(outMessages.toString().contains(PrintNumberConstants.WELCOME_MESSAGE));
        assertTrue(outMessages.toString().contains(PrintNumberConstants.NUMBER_PROMPT));
    }

    @Test
    public void testGetUserInput() {
        System.setIn(new ByteArrayInputStream(String.valueOf(USER_INPUT).getBytes()));
        PrintNumber.getUserInputFromConsole();
        int input = PrintNumber.getUserInput();

        assertEquals(USER_INPUT, input);
    }

    @Test
    public void testValidateUserInput() {
        ByteArrayOutputStream outMessages = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outMessages, true));
        System.setIn(new ByteArrayInputStream(String.valueOf(USER_INPUT).getBytes()));
        PrintNumber.validateUserInput(INVALID_INPUT);

        assertTrue(outMessages.toString().contains(PrintNumberConstants.ERROR_MESSAGE));
        assertTrue(outMessages.toString().contains(PrintNumberConstants.NUMBER_PROMPT));
    }

    @Test
    public void testIncrementNumbers() {
        ByteArrayOutputStream outMessages = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outMessages, true));
        System.setIn(new ByteArrayInputStream(String.valueOf(USER_INPUT).getBytes()));
        String[] args = new String[0];
        PrintNumber.main(args);

        assertEquals(FINAL_RESULT, PrintNumber.getFinalResult());
        assertTrue(outMessages.toString().contains(PrintNumberConstants.RESULTS_MESSAGE));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
//Description
//A number is input in computer then a new no should get printed by adding one to each of its digit. If you encounter a
// 9, insert a 10 (don't carry over, just shift things around).
//
//For example, 998 becomes 10109.
//
//Bonus
//This challenge is trivial to do if you map it to a string to iterate over the input, operate, and then cast it back.
// Instead, try doing it without casting it as a string at any point, keep it numeric (int, float if you need it) only.
//
//Credit
//This challenge was suggested by user /u/chetvishal
//, many thanks! If you have a challenge idea please share it in /r/dailyprogrammer_ideas and there's a good chance
// we'll use it.
