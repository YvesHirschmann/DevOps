package de.fherfurt.fhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Spring Boot entry point for the Calculator API.
 * This is a utility class and should not be instantiated.
 */
@SpringBootApplication
public final class SpringCalculatorApi {

    /**
     * Private constructor to prevent instantiation.
     */
    private SpringCalculatorApi() {
        throw new UnsupportedOperationException();
    }

    /**
     * Main method to start the Spring Boot application.
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(SpringCalculatorApi.class, args);
    }
}
