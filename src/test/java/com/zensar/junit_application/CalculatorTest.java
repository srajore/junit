package com.zensar.junit_application;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class CalculatorTest {
	
	 Calculator calculator = null;

	@BeforeClass
	public static void setupBeforeClass() {   // Only One
		System.out.println("Before Class ");//1
	}
	
	@Before
	public void setupBeforeEachTest() {  // Multipal times 
		calculator=new Calculator();
		System.out.println("I am in setupBeforeEachTest");
	}

	@Test
	public void testAdd() {
		assertEquals(30, calculator.add(10, 20)); // NPE
		System.out.println("I am inside testAdd");
	}

	@Test
	public void testSub() {
		assertEquals(10, calculator.sub(20, 10));
		System.out.println("I am inside testSub");

	}
	
	@Test(expected = ClassNotFoundException.class)
	@Ignore
	public void testDivisionByZero() {
		calculator.division(10, 0);
	}
	
	@After
	public void tearDown() {
		System.out.println("Runs after each test case");
	}
	
	@AfterClass
	public static void cleanupAfterClass() {
		System.out.println("I am inside cleanupAfterClass ");
	}
	
	

}
