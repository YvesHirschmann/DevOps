package de.fherfurt.fhe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the CalculatorApi class.
 *
 * Note: Full integration tests would require starting the HTTP server and making HTTP requests.
 * Here, we only check that the class cannot be instantiated.
 */
class CalculatorApiTest {
    /**
     * Tests that CalculatorApi cannot be instantiated.
     */
    @Test
    void testPrivateConstructor() {
        assertThrows(UnsupportedOperationException.class, () -> {
            java.lang.reflect.Constructor<CalculatorApi> ctor =
                CalculatorApi.class.getDeclaredConstructor();
            ctor.setAccessible(true);
            ctor.newInstance();
        });
    }
}
