package com.main;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ValidationNameTest {
    static ValidationName obj = null;
    @BeforeClass
    public static void start(){
        obj=new ValidationName();
    }
    @AfterClass
    public static void stop(){
        obj=null;
    }
    @Test
    public void validNameTestPositive(){
       boolean result = obj.validName("Nabhat");
        assertTrue(result);
    }

    @Test
    public void validNameTestNegative(){
        boolean result = obj.validName("123#");
        assertFalse(result);
    }
}
