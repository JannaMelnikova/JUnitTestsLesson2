package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator=new Calculator();


    @Nested
    class DefaultMethodCalc{
        @Test
        void add() {

            assertEquals(7,calculator.add(5, 2));
        }

        @Test
        void subtract() {
            Assertions.assertEquals(3, calculator.subtract(5,2));
        }

        @Test
        void multiply() {
            Assertions.assertEquals(12,calculator.multiply(3,4));
        }

        @Test
        void divide() {
            Assertions.assertEquals(2, calculator.divide(4, 2));
        }

        @Test
        void divideByZero() {
            Assertions.assertThrows(IllegalArgumentException.class, ()-> calculator.divide(6,0));
        }
    }

    @Nested
class newMethodCalc {

    @Test
    @Timeout(5)
    void sqrt() {
        Assertions.assertEquals(3, calculator.sqrt(9));
    }

    @ParameterizedTest
    @ValueSource(ints={2,5,7,13,97})
    void isPrime(int n) {
        Assertions.assertTrue(calculator.isPrime(n));

    }
}
}