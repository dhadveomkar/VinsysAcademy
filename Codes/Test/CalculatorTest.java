package Codes.Test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Codes.Calculator;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public  void testAdd() {
        assertEquals(calculator.addNumbers(-10, -10), -20);
    }

    
}
