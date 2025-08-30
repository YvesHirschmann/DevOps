package de.fherfurt.fhe;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The Operation class represents a mathematical operation
 * with two operands and an operation type.
 */
@Getter
@AllArgsConstructor
public class Operation {

	/**
	 * First operand.
	 */
	private final double a;
	/**
	 * Second operand.
	 */
	private final double b;
	/**
	 * Type of operation.
	 */
	private final OperationType type;

	/**
	 * Executes the stored mathematical operation.
	 *
	 * @return The result of the calculation.
	 * @throws ArithmeticException If division by zero is attempted.
	 * @throws IllegalStateException Unknown operation type,
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
						"Division by zero!");
				}
				return a / b;
			default:
				String msg = "Unexpected value: "
					+ type;
				throw new IllegalStateException(msg);
		}
	}
}
