package com.stringCaculator;

import org.junit.Assert;
import org.junit.Test;

import com.stringCalculator.StringCalculator;

public class StringCalculatorTest {
	
	
	@Test
	public void testCase1() {
		Assert.assertEquals(3, StringCalculator.addNumbers("1,2"));
	}
	
	@Test
	public void testCase2() {
		Assert.assertEquals(1, StringCalculator.addNumbers("1,"));
	}
	
	@Test
	public void testCase3() {
		Assert.assertEquals(0, StringCalculator.addNumbers(""));
	}
	
	@Test
	public void testCase4() {
		Assert.assertEquals(0, StringCalculator.addNumbers(null));
	}
	
	@Test
	public void testCase5() {
		Assert.assertEquals(6, StringCalculator.addNumbers("1,2,3"));
	}
	
	@Test
	public void testCase6() {
		Assert.assertEquals(6, StringCalculator.addNumbers("1 2 3"));
	}
	
	@Test
	public void testCase7() {
		Assert.assertEquals(105, StringCalculator.addNumbers("100 2 3"));
	}
	
	@Test
	public void testCase8() {
		Assert.assertEquals(0, StringCalculator.addNumbers("-1"));
	}
	
	@Test
	public void testCase9() {
		Assert.assertEquals(101, StringCalculator.addNumbers("0 2 99"));
	}
	
	@Test
	public void testCase10() {
		Assert.assertEquals(18, StringCalculator.addNumbers("1 2 3 123 145 645454 345343453 234234 123 12312 545 12 4341 3423 34324 12231 123123 123213 23123213 -1212 -1 0987"));
	}
	
}
