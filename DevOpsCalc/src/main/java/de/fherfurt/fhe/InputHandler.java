package de.fherfurt.fhe;

import java.util.Scanner;

/**
 * Handles user input for numbers and operations.
 */
public class InputHandler {

    /**
     * Scanner instance for reading user input.
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Reads a number from the user.
     *
     * @param prompt The prompt message to display.
     * @return The number entered by the user.
     */
    public double readNumber(final String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    /**
     * Reads a mathematical operation from the user.
     *
     * @param prompt The prompt message to display.
     * @return The corresponding OperationType.
     * @throws IllegalArgumentException If the entered symbol is invalid.
     */
    public OperationType readOperation(final String prompt) {
        System.out.print(prompt);
        char symbol = scanner.next().charAt(0);
        return OperationType.fromSymbol(symbol);
    }
}
