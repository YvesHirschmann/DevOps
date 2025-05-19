package de.fherfurt.fhe;

/**
 * The Operation class represents a mathematical operation with two operands and an operation type.
 */
public class Operation {
    private final double a;
    private final double b;
    private final OperationType type;

    /**
     * Creates a new Operation.
     *
     * @param a    The first operand.
     * @param b    The second operand.
     * @param type The type of mathematical operation.
     */
    public Operation(final double a,
                     final double b,
                     final OperationType type) {
        this.a = a;
        this.b = b;
        this.type = type;
    }

    /**
     * Executes the stored mathematical operation.
     *
     * @return The result of the calculation.
     * @throws ArithmeticException    If division by zero is attempted.
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
                    throw new ArithmeticException("Division by zero!");
                }
                return a / b;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
