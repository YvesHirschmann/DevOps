package de.fherfurt.fhe;

public enum OperationType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    OperationType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static OperationType fromSymbol(char symbol) {
        for (OperationType type : values()) {
            if (type.symbol == symbol) {
                return type;
            }
        }
        throw new IllegalArgumentException("Ungültige Rechenoperation: " + symbol);
    }
}
