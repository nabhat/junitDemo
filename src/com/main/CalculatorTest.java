package com.main;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	static Calculator calculator=null;

	@BeforeClass
	public static void init(){
		calculator=new Calculator();
		System.out.println("Testing stated");
	}

	@AfterClass
	public static void stop(){
		calculator = null;
		System.out.println("All testing completed");
	}
	@Test
	public void addtionTest() {
		Calculator calculator = new Calculator();
		int result = calculator.addition(1, 20);
		assertEquals(result, 21);
	}
	@Test
	public void multiplyTest() {
		Calculator calculator = new Calculator();
		int result = calculator.multipy(1, 20);
		assertEquals(result, 20);
	}
	@Test
	public void subtractionTest() {
		Calculator calculator = new Calculator();
		int result = calculator.subtraction(20, 1);
		assertEquals(result, 19);
	}
	@Test
	public void divisionTest() {
		Calculator calculator = new Calculator();
		int result = calculator.division(100, 20);
		assertEquals(result, 5);
	}
	@Test(expected = ArithmeticException.class)
	public void divisionTestForException() {
		Calculator calculator = new Calculator();
		@SuppressWarnings("unused")
		int result = calculator.division(10, 0);
	}
}
