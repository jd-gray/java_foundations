/**
 * Assignment 5 Question 1: Capture user input of 5 numbers and then display the average.
 * 													Program only accepts numbers and warns the user if an invalid
 * 													character is entered.
 *   
 * Completion time: 45 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week5;

import java.util.Scanner;

public class GRAY_A05Q01 {
	static final int MAX_SIZE = 5;
	static double[] values = new double[MAX_SIZE];
	static double sum = 0;
	
	public static void main(String[] args) {
		userInput();
	}
	
	public static void userInput() {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < values.length; i++) {
			while(true) {
				try {
					System.out.println("Please enter a number: ");
					values[i] = Double.parseDouble(scan.nextLine());
					sum = sum + values[i];
					break;
				} catch (java.lang.NumberFormatException e) {
					System.out.println("Please enter a valid number.");
					continue;
				}
			}
		}
		double average = sum / MAX_SIZE;
		System.out.println("The average is: " + average);
	}
}
