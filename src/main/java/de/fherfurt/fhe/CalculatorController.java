
package de.fherfurt.fhe;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for calculator API endpoints.
 */
@RestController
@RequestMapping("/api/calculator")
@RequiredArgsConstructor
public final class CalculatorController {

    /** Calculator API service. */
    private final CalculatorApi calculatorApi;

    /**
     * Calculates the result for two numbers and an operation.
     * @param a first number
     * @param b second number
     * @param operation operation type (+, -, *, /)
     * @return calculation result
     */
    @GetMapping("/calculate")
    public double calculate(
            @RequestParam final double a,
            @RequestParam final double b,
            @RequestParam final String operation) {
        return calculatorApi.calculate(a, b, operation);
    }
}
