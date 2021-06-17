import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTest {
    @Test
    public void test_2() {
        // Given
        Prime prime = new Prime();

        // When

        // Then
        assertTrue(prime.checkPrime(2));
    }

    @Test
    public void test_5() {
        // Given
        Prime prime = new Prime();

        // When

        // Then
        assertTrue(prime.checkPrime(5));
    }

    @Test
    public void test_29() {
        // Given
        Prime prime = new Prime();
        // When

        // Then
        assertTrue(prime.checkPrime(29));
    }


    @Test
    public void test_9() {
        // Given
        Prime prime = new Prime();
        // When

        // Then
        assertFalse(prime.checkPrime(9));
    }

}