package com.flit.fibonacci;

import java.math.BigInteger;

/**
 * 
 * @author tonyacunar
 *
 */
public interface Fibonacci {

	/**
	 * Calculates the nth fibonacci number in the fibonacci series.
	 * 
	 * Fibonacci sequence is characterized by the fact that every number
	 * after the first two is the sum of the two preceding ones
	 * 
	 * example: if n = 3 then return value is 2
	 * 
	 * @param n
	 * @return
	 */
	public BigInteger calculate(long n);
	
	
}
