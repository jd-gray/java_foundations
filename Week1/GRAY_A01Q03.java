/**
 * Assignment 1 Question 3: Convert Fahrenheit to Kelvin Calculator
 * 
 * Completion time: 10 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week1;

import java.util.Scanner;

public class GRAY_A01Q03 {
	public static void main (String[] args) {
		final double BASE = 459.67;
		final double CONVERSION_FACTOR = 5.0 / 9.0;
		
		System.out.println("Please enter a temperature in Fahrenheit:");
		
		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
		double result = (input + BASE) * CONVERSION_FACTOR;
		
		System.out.println("Kelvin Temperature: " + result);
	}
}
