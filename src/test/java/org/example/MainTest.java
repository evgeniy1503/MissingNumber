package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * MainTest.
 *
 * @author Evgeniy_Prohorov
 */
class MainTest {

    @Test
    public void testMissingNumber1() {
        int[] arr = {12, 11, 9, 13, 14, 15};
        assertEquals(10, MissingNumber.findMissingNumber(arr));
    }

    @Test
    public void testMissingNumber2() {
        int[] arr = {7, 9, 10, 11, 12};
        assertEquals(8, MissingNumber.findMissingNumber(arr));
    }

    @Test
    public void testMissingNumberArrayLength1() {
        int[] arr = {1};
        assertThrows(RuntimeException.class, () -> {
            MissingNumber.findMissingNumber(arr);
        });
    }

    @Test
    public void testMissingNumberArrayLength0() {
        int[] arr = {};
        assertThrows(RuntimeException.class, () -> {
            MissingNumber.findMissingNumber(arr);
        });
    }
}