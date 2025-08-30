
import de.fherfurt.fhe.OperationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
/**
 * The Operation class represents a mathematical operation with two operands
 * and an operation type.
 */
@Getter
@AllArgsConstructor
public class Operation {
    /** First operand. */
    private final double a;
    /** Second operand. */
    private final double b;
    /** Type of operation. */
    private final OperationType type;

    /**
     * Executes the stored mathematical operation.
     *
     * @return The result of the calculation.
     * @throws ArithmeticException If division by zero is attempted.
     * @throws IllegalStateException If an unknown
     * operation type is encountered.
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
