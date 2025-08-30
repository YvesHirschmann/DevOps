
package de.fherfurt.fhe;

import lombok.Getter;

/**
 * Enum representing the types of mathematical operations.
 */
@Getter
public enum OperationType {
    /** Addition operation. */
    ADD('+'),
    /** Subtraction operation. */
    SUBTRACT('-'),
    /** Multiplication operation. */
    MULTIPLY('*'),
    /** Division operation. */
    DIVIDE('/');

    /** Symbol representing the operation. */
    private final char symbol;

    OperationType(final char operationSymbol) {
        this.symbol = operationSymbol;
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
     * @throws IllegalArgumentException If the symbol
     *  does not match any operation.
     */
    public static OperationType fromSymbol(final char symbol) {
        for (OperationType type : values()) {
            if (type.symbol == symbol) {
                return type;
            }
        }
        throw new IllegalArgumentException(
            "Invalid operation symbol: " + symbol
        );
    }
}
