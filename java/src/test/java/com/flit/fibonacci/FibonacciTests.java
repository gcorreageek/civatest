package com.flit.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.flit.fibonacci.solution.FibonacciImpl;

public class FibonacciTests {

	@Test
	public void test1() {

		Fibonacci fibonacci = new FibonacciImpl();

		assertEquals("2", fibonacci.calculate(3));

	}
	
	
	@Test
	public void test2() {

		Fibonacci fibonacci = new FibonacciImpl();

		assertEquals("5", fibonacci.calculate(5));

	}
	
	
	@Test
	public void test3() {

		Fibonacci fibonacci = new FibonacciImpl();

		assertEquals("55", fibonacci.calculate(10));

	}
	
	
	@Test
	public void test4() {

		Fibonacci fibonacci = new FibonacciImpl();

		assertEquals("354224848179261915075", fibonacci.calculate(100));

	}
	
	@Test
	public void test5() {

		Fibonacci fibonacci = new FibonacciImpl();

		assertEquals("59425114757512643212875125", fibonacci.calculate(125));

	}
	
	
	@Test
	public void test6() {

		Fibonacci fibonacci = new FibonacciImpl();

		assertEquals("139423224561697880139724382870407283950070256587697307264108962948325571622863290691557658876222521294125", fibonacci.calculate(500));

	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test7() {

		Fibonacci fibonacci = new FibonacciImpl();

		assertEquals("0", fibonacci.calculate(0));

	}
	
	
	
}
