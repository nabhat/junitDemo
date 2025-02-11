package com.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ValidationNameParameteraisedTest {
    private String name;
    private boolean result;

    public ValidationNameParameteraisedTest(String name, boolean result){
        this.name=name;
        this.result=result;
    }
    @Parameters
    public static Collection<Object[]> data(){
        Object[][] data= new Object[][]{{"Nabhat", true},{"1334",false},{"Diba",false}};
        return Arrays.asList(data);
    }   

    @Test
    public void validNameTestNegative(){
        ValidationName obj= new ValidationName();
        boolean output =obj.validName(name);
        assertEquals(this.result, output);
    }
}
