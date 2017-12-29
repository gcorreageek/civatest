package com.flit.math.squareroot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.flit.math.squareroot.solution.SquareRootImpl;

/**
 * 
 * @author tonyacunar
 *
 */
public class SquareRootTests {

	@Test
	public void test1() {

		SquareRoot squareRoot = new SquareRootImpl();

		assertEquals(2.23, squareRoot.squareRoot(5, 2),0);

	}
	
	@Test
	public void test2() {

		SquareRoot squareRoot = new SquareRootImpl();

		assertEquals(2.236, squareRoot.squareRoot(5, 3),0);

	}
	
	@Test
	public void test3() {

		SquareRoot squareRoot = new SquareRootImpl();

		assertEquals(0.000, squareRoot.squareRoot(0, 3),0);

	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test4() {

		SquareRoot squareRoot = new SquareRootImpl();
		squareRoot.squareRoot(-1, 1);

	}
	
	@Test
	public void test5() {

		SquareRoot squareRoot = new SquareRootImpl();
		assertEquals(10.00, squareRoot.squareRoot(100, 2),0);

	}
	
}
