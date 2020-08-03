package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CreditCardTest {
    private final CreditCard creditCard = new CreditCard();
    
    @Test
    void checkLastDigitEqual(){
        assertEquals(2, creditCard.lastDigit(new int[]{4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2}));
        assertEquals(3, creditCard.lastDigit(new int[]{7,9,9,2,7,3,9,8,7,1,3}));
        assertEquals(0, creditCard.lastDigit(new int[]{4,3,2,1,9,8,2,1,4,7,1,0,4,3,2,0}));
        assertEquals(2, creditCard.lastDigit(new int[]{3,1,4,4,3,9,1,1,4,8,2,9,1,2}));
    }
    @Test
    void checkLastDigitNotEqual(){
        assertNotEquals(5, creditCard.lastDigit(new int[]{4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2}));
        assertNotEquals(3, creditCard.lastDigit(new int[]{4,3,2,1,9,8,2,1,4,7,1,0,4,3,2,0}));
    }
    @Test
    void checkGetUserInputEquals(){
        assertEquals("424242424242424 2" , creditCard.getUserInput(new int[]{4,2,4,2,4,2,4,2,4,2,4,2,4,2,4,2}));
        assertEquals("7992739871 3", creditCard.getUserInput(new int[]{7,9,9,2,7,3,9,8,7,1,3}));

    }
    @Test
    void checkGetUserInputNotEquals(){
        assertNotEquals("24146564245 8", creditCard.getUserInput(new int[]{2,4,1,4,6,5,6,4,2,4,5,2}));
    }
    @Test
    void checkValidityTrue(){
        assertTrue(creditCard.isValid(3, 3));
        assertTrue(creditCard.isValid(4,4));

    }
    @Test
    void checkValidityFalse(){
        assertFalse(creditCard.isValid(3,1));
        assertFalse(creditCard.isValid(1,40));
    }

}