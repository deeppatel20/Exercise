package com.google.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class ReverseStringTest {

    ReverseString rs = new ReverseString();

    @Test
    public void givenArray_whenReversedArray_thenReturnReversedArray() {
        //given
        char[] s = {'h', 'e', 'l', 'o'};
        char[] expectedReversed = {'o', 'l', 'e', 'h'};

        //when
        char[] actualReversed = rs.reverseString(s);

        //then
        assertArrayEquals(expectedReversed, actualReversed);
    }

    /**
     * Method under test: {@link ReverseString#reverseString(char[])}
     */
    @Test
    void testReverseString() {
        ReverseString reverseString = new ReverseString();
        char[] s = "AZAZ".toCharArray();
        char[] actualReverseStringResult = reverseString.reverseString(s);
        assertSame(s, actualReverseStringResult);
        assertEquals(4, actualReverseStringResult.length);
        assertEquals('Z', actualReverseStringResult[0]);
        assertEquals('A', actualReverseStringResult[1]);
        assertEquals('Z', actualReverseStringResult[2]);
        assertEquals('A', actualReverseStringResult[3]);
    }

}