package de.fherfurt.fhe;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Provides an HTTP API for the calculator.
 */
public class CalculatorApi {
    private static final int SERVER_PORT = 8080;
    private static final int BAD_REQUEST = 400;

    private CalculatorApi() {
        throw new UnsupportedOperationException();
    }

    /**
     * Starts the Calculator HTTP API.
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        port(SERVER_PORT);
        get("/calculate", (req, res) -> {
            try {
                double num1 = Double.parseDouble(req.queryParams("num1"));
                double num2 = Double.parseDouble(req.queryParams("num2"));
                String op = req.queryParams("op");
                OperationType opType = switch (op) {
                    case "+" -> OperationType.ADD;
                    case "-" -> OperationType.SUBTRACT;
                    case "*" -> OperationType.MULTIPLY;
                    case "/" -> OperationType.DIVIDE;
                    default -> throw new IllegalArgumentException(
                        "Invalid operation: " + op
                    );
                };
                Operation operation = new Operation(num1, num2, opType);
                double result = operation.execute();
                return String.valueOf(result);
            } catch (Exception e) {
                res.status(BAD_REQUEST);
                return "Error: " + e.getMessage();
            }
        });
    }
}