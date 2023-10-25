package studio6;

import java.lang.reflect.Array;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
			// base case
		if(n==0) {
			return 0;}
		else {
			return geometricSum(n-1)+Math.pow(0.5, n);
			
		}
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			if(q==0) {
				return p;
			}
			else {
				return(gcd(q,p%q));
		
	}
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {	
		int [] reversed = new int [array.length];
		else { // for test string: 1234, length = 4, 4321
			int index = array.length-1; // last index of array which will be our reversed[0]
			recursion(array, index);
			
			reversed[array.length-index] = ;
			index--;
			// pull values out + put into new array one by one
		}
		return reversed;
	}
	
	private static int recursion(int [] array, int index) { // helper method is NOT recursive
		int [] reversed = new int [array.length];
		if(index == 0){
			return array[0];
		}
		else {
			reversed[array.length-1-index] = array[index];
			return recursion(array,index-1);
		}
	}
				
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
