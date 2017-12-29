package com.flit.math.squareroot;

/**
 * 
 * @author tonyacunar
 *
 */
public interface SquareRoot {

	/**
	 * This method finds the square root of a number up to a specified precision.
	 * 
	 * No imaginary numbers allowed.
	 * 
	 * Example:
	 * squareRoot(5,2) returns 2.23
	 * 
	 * @param number
	 * @param precision
	 * @return
	 */
	public double squareRoot(Integer number, Integer precision);
	
}
