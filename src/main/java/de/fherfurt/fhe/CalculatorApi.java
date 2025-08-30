package de.fherfurt.fhe;

import org.springframework.stereotype.Service;
/**
 * Service for calculator operations.
 */
@Service
public final class CalculatorApi {


    /**
     * Calculates the result for two numbers and an operation.
     * @param num1 first number
     * @param num2 second number
     * @param op operation type (+, -, *, /)
     * @return calculation result
     */
    public double calculate(final double num1, final double num2,
                           final String op) {
        OperationType opType;
        switch (op) {
            case "+":
                opType = OperationType.ADD;
                break;
            case "-":
                opType = OperationType.SUBTRACT;
                break;
            case "*":
                opType = OperationType.MULTIPLY;
                break;
            case "/":
                opType = OperationType.DIVIDE;
                break;
            default:
                String msg = "Invalid operation: "
                    + op;
                throw new IllegalArgumentException(msg);
        }
        Operation operation = new Operation(
            num1, num2, opType);
        return operation.execute();
    }
}
