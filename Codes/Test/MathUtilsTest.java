package Codes.Test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import Codes.MathUtils;

public class MathUtilsTest {
    @Test
public void testDivideValidInput() {
    MathUtils util = new MathUtils();
    assertEquals(5, util.divide(10, 2));
}
}
