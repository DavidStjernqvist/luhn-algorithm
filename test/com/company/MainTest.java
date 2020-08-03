package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main main = new Main();

    @Test
    void checkProvidedNumTrue(){
        assertEquals(3, main.getProvidedValue(new int[]{3,1,1,3,5,6,7,3,2,1,4,3}));
        assertEquals(1, main.getProvidedValue(new int[]{1,3,1,3,5,6,3,1,4,1,3,5,1}));
    }
    @Test
    void checkProvidedNumFalse(){
        assertNotEquals(3, main.getProvidedValue(new int[]{7,2,5,1,4,9,5,2,1,3,6}));
        assertNotEquals(7, main.getProvidedValue(new int[]{9,3,1,4,7,7,7,3,2,7,8,4}));
    }
    @Test
    void checkResTypeTrue(){
        assertEquals("Valid", main.resType(true));
        assertEquals("Invalid", main.resType(false));
    }
    @Test
    void checkResTypeFalse(){
        assertNotEquals("Valid", main.resType(false));
        assertNotEquals("Invalid", main.resType(true));
    }

}