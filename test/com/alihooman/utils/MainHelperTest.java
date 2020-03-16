package com.alihooman.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHelperTest {

    @Test
    void checkArgsArraySizeZeroTest() {
        assertFalse(MainHelper.checkArgs(new String[0]));
    }

    @Test
    void checkArgsArraySizeTwoTest() {
        assertFalse(MainHelper.checkArgs(new String[2]));
    }

    @Test
    void checkArgsArraySizeOneTest() {
        assertTrue(MainHelper.checkArgs(new String[1]));

    }
}