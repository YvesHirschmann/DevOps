package de.fherfurt.fhe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void testAddition() {
        Operation op = new Operation(2.0, 3.0, OperationType.ADD);
        assertEquals(5.0, op.execute());
    }

    @Test
    void testSubtraction() {
        Operation op = new Operation(5.0, 2.0, OperationType.SUBTRACT);
        assertEquals(3.0, op.execute());
    }

    @Test
    void testMultiplication() {
        Operation op = new Operation(4.0, 2.5, OperationType.MULTIPLY);
        assertEquals(10.0, op.execute());
    }

    @Test
    void testDivision() {
        Operation op = new Operation(10.0, 2.0, OperationType.DIVIDE);
        assertEquals(5.0, op.execute());
    }

    @Test
    void testDivisionByZeroThrowsException() {
        Operation op = new Operation(10.0, 0.0, OperationType.DIVIDE);
        assertThrows(ArithmeticException.class, op::execute);
    }
}
