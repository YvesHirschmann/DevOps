package de.fherfurt.fhe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the OperationType enum.
 */
class OperationTypeTest {
    /**
     * Tests that fromSymbol returns the correct OperationType for valid symbols.
     */
    @Test
    void testFromSymbolValid() {
        assertEquals(OperationType.ADD, OperationType.fromSymbol('+'));
        assertEquals(OperationType.SUBTRACT, OperationType.fromSymbol('-'));
        assertEquals(OperationType.MULTIPLY, OperationType.fromSymbol('*'));
        assertEquals(OperationType.DIVIDE, OperationType.fromSymbol('/'));
    }

    /**
     * Tests that fromSymbol throws IllegalArgumentException for invalid symbol.
     */
    @Test
    void testFromSymbolInvalid() {
        assertThrows(IllegalArgumentException.class, () -> OperationType.fromSymbol('x'));
    }

    /**
     * Tests getSymbol returns the correct character for each OperationType.
     */
    @Test
    void testGetSymbol() {
        assertEquals('+', OperationType.ADD.getSymbol());
        assertEquals('-', OperationType.SUBTRACT.getSymbol());
        assertEquals('*', OperationType.MULTIPLY.getSymbol());
        assertEquals('/', OperationType.DIVIDE.getSymbol());
    }
}
