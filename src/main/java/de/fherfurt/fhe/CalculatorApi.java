package de.fherfurt.fhe;

import static spark.Spark.*;

/**
 * Stellt eine HTTP-API für den Calculator bereit.
 */
public class CalculatorApi {
    public static void main(String[] args) {
        port(8080);
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
                    default -> throw new IllegalArgumentException("Invalid operation: " + op);
                };
                Operation operation = new Operation(num1, num2, opType);
                double result = operation.execute();
                return String.valueOf(result);
            } catch (Exception e) {
                res.status(400);
                return "Error: " + e.getMessage();
            }
        });
    }
}
