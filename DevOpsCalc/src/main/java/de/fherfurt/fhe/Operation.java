package de.fherfurt.fhe;

public class Operation {
    private final double a;
    private final double b;
    private final OperationType type;

    public Operation(double a, double b, OperationType type) {
        this.a = a;
        this.b = b;
        this.type = type;
    }

    public double execute() {
        return switch (type) {
            case ADD -> a + b;
            case SUBTRACT -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE -> {
                if (b == 0) {
                    throw new ArithmeticException("Division durch Null!");
                }
                yield a / b;
            }
        };
    }
}
