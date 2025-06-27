package de.fherfurt.fhe;

/**
 * The Operation class represents a mathematical operation with two operands
 * and an operation type.
 */
public class Operation {
    /**
     * First operand of the operation.
     */
    private final double a;
    /**
     * Second operand of the operation.
     */
    private final double b;
    /**
     * Type of the operation (addition, subtraction, multiplication, division).
     */
    private final OperationType type;

    /**
     * Creates a new Operation.
     *
     * @param operand1 The first operand.
     * @param operand2 The second operand.
     * @param operationType The type of mathematical operation.
     */
    public Operation(final double operand1,
                     final double operand2,
                     final OperationType operationType) {
        this.a = operand1;
        this.b = operand2;
        this.type = operationType;
    }

    /**
     * Executes the stored mathematical operation.
     *
     * @return The result of the calculation.
     * @throws ArithmeticException If division by zero is attempted.
     * @throws IllegalStateException If an unknown operation type is encountered.
     */
    public double execute() {
        switch (type) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                if (b == 0) {
                    throw new ArithmeticException(
                        "Division by zero!"
                    );
                }
                return a / b;
            default:
                throw new IllegalStateException(
                    "Unexpected value: " + type
                );
        }
    }
}
