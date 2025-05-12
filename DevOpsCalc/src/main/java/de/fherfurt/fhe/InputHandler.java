package de.fherfurt.fhe;

import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public double readNumber(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public OperationType readOperation(String prompt) {
        System.out.print(prompt);
        char symbol = scanner.next().charAt(0);
        return OperationType.fromSymbol(symbol);
    }
}
