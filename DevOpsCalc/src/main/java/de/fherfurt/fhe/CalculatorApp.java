package de.fherfurt.fhe;

public class CalculatorApp {
    public static void main(String[] args) {
        InputHandler input = new InputHandler();
        double num1 = input.readNumber("Geben Sie die erste Zahl ein: ");
        OperationType opType = input.readOperation("Geben Sie die Rechenoperation (+, -, *, /) ein: ");
        double num2 = input.readNumber("Geben Sie die zweite Zahl ein: ");

        Operation operation = new Operation(num1, num2, opType);
        double result = operation.execute();

        System.out.println("Ergebnis: " + result);
    }
}
