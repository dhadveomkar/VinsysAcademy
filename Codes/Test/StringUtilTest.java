package Codes.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Codes.StringUtil;

public class StringUtilTest {
    @Test
    public void testGetStringLengthWithNormalString() {
        StringUtil util = new StringUtil();
        int result = util.getStringLength("Hello");
        assertEquals("Expected length of 'Hello' is 5", result, 5);
    }

    @Test
    public void testGetStringLengthWithEmptyString() {
        StringUtil util = new StringUtil();
        int result = util.getStringLength("");
        assertEquals("Expected length of empty string is 0", result, 0);
    }
}
