package com.zensar.junit_application;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MathUtilsTest {
	
	private int input1;// 10
	private int input2;// 20
	private int expected; //200
	
	public MathUtilsTest(int input1, int input2, int expected) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		
		
		return Arrays.asList(new Object[][]{
			{10,20,200},
			{1,2,2},
			{2,4,8},
			
		});
	}
	
	@Test
	public void testMultiply() {
		assertEquals(expected, MathUtils.multiply(input1,input2) );
	}
	


}
