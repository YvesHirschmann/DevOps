package de.fherfurt.fhe;

/**
 * Main application class for the calculator.
 */
public final class CalculatorApp {

    /**
     * Private constructor to prevent instantiation.
     */
    private CalculatorApp() { }

    /**
     * Entry point of the calculator application.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {
        InputHandler input = new InputHandler();
        double num1 = input.readNumber("Enter the first number: ");
        OperationType opType = input.readOperation(
                "Enter the " + "operation (+, -, *, /): ");
        double num2 = input.readNumber("Enter the second number: ");

        Operation operation = new Operation(num1, num2, opType);
        double result = operation.execute();

        System.out.println("Result: " + result);
    }
}
