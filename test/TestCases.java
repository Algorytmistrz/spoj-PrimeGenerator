import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCases {

        @Test
        public void isPrimeTest(){
            assertTrue(Main.isPrime(2));
            assertTrue(Main.isPrime(3));
            assertTrue(Main.isPrime(5));
            assertTrue(Main.isPrime(19));
            assertTrue(Main.isPrime(1));
            assertFalse(Main.isPrime(4));
            assertFalse(Main.isPrime(8));
            assertFalse(Main.isPrime(12));
        }

}
