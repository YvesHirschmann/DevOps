package de.fherfurt.fhe;

/**
 * Enum representing the types of mathematical operations.
 */
public enum OperationType {
    /**
     * Represents addition operation.
     */
    ADD('+'),
    /**
     * Represents subtraction operation.
     */
    SUBTRACT('-'),
    /**
     * Represents multiplication operation.
     */
    MULTIPLY('*'),
    /**
     * Represents division operation.
     */
    DIVIDE('/');

    private final char symbol;

    /**
     * Constructor for OperationType.
     *
     * @param symbol The character symbol representing the operation.
     */
    OperationType(final char symbol) {
        this.symbol = symbol;
    }

    /**
     * Returns the symbol associated with the operation type.
     *
     * @return The operation symbol.
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * Returns the OperationType corresponding to the given symbol.
     *
     * @param symbol The character symbol of the operation.
     * @return The matching OperationType.
     * @throws IllegalArgumentException If the symbol does not match any operation.
     */
    public static OperationType fromSymbol(char symbol) {
        for (OperationType type : values()) {
            if (type.symbol == symbol) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid operation: " + symbol);
    }
}
