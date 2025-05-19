package de.fherfurt.fhe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OperationTest {

    private static final double NUM1 = 2.0;
    private static final double NUM2 = 3.0;
    private static final double NUM3 = 5.0;
    private static final double NUM4 = 10.0;
    private static final double NUM5 = 2.5;
    private static final double NUM6 = 0.0;

    @Test
    void testAddition() {
        Operation op = new Operation(NUM1, NUM2, OperationType.ADD);
        assertEquals(NUM3, op.execute());
    }

    @Test
    void testSubtraction() {
        Operation op = new Operation(NUM3, NUM1, OperationType.SUBTRACT);
        assertEquals(NUM2, op.execute());
    }

    @Test
    void testMultiplication() {
        Operation op = new Operation(NUM4, NUM5, OperationType.MULTIPLY);
        assertEquals(NUM4, op.execute());
    }

    @Test
    void testDivision() {
        Operation op = new Operation(NUM4, NUM1, OperationType.DIVIDE);
        assertEquals(NUM3, op.execute());
    }

    @Test
    void testDivisionByZeroThrowsException() {
        Operation op = new Operation(NUM4, NUM6, OperationType.DIVIDE);
        assertThrows(ArithmeticException.class, op::execute);
    }
}