package com.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalcTest {
    @Test
    public void isEvenTestForEvenData(){
        Calc calc =new Calc();
        boolean result = calc.isEven(12);
        assertTrue(result);
    }
    @Test
    public void isEvenTestForOddData(){
        Calc calc =new Calc();
        boolean result = calc.isEven(11);
        assertFalse(result);
    }
    @Test
    public void factorialTest(){
        Calc calc=new Calc();
        int result = calc.factorial(5);
        assertEquals(120, result);
    }
}   
