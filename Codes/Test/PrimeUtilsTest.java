package Codes.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Codes.PrimeUtils;

public class PrimeUtilsTest {
    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue("5 should be prime", PrimeUtils.isPrime(5));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse("4 should not be prime", PrimeUtils.isPrime(4));
    }
}
