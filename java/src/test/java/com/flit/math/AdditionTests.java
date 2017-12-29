package com.flit.math;

import static org.junit.Assert.*;

import org.junit.Test;

import com.flit.math.solution.AdditionImpl;

public class AdditionTests {

	@Test
	public void test1() {

		Addition addition = new AdditionImpl();

		assertEquals("2", addition.add("1", "1"));

	}

	@Test
	public void test2() {

		Addition addition = new AdditionImpl();

		assertEquals("1", addition.add("1", "0"));

	}

	@Test
	public void test3() {

		Addition addition = new AdditionImpl();

		assertEquals("9", addition.add("9", "0"));

	}


	@Test
	public void test4() {

		Addition addition = new AdditionImpl();

		assertEquals("11", addition.add("10", "1"));

	}

	@Test
	public void test5() {

		Addition addition = new AdditionImpl();

		assertEquals("2147483648", addition.add("2147483647", "1"));

	}

	@Test
	public void test6() {

		Addition addition = new AdditionImpl();

		assertEquals("2147483648", addition.add("2147483648", "0"));

	}

	@Test
	public void test7() {

		Addition addition = new AdditionImpl();

		assertEquals("9223372036854775808", addition.add("9223372036854775807", "1"));

	}

	@Test
	public void test8() {

		Addition addition = new AdditionImpl();

		assertEquals("9223372036854775808", addition.add("9223372036854775808", "0"));

	}

	@Test
	public void test9() {

		Addition addition = new AdditionImpl();

		assertEquals("22", addition.add("11", "11"));

	}
	
	@Test
	public void test10() {

		Addition addition = new AdditionImpl();

		assertEquals("9223372036854775808", addition.add( "1","9223372036854775807"));

	}

}
