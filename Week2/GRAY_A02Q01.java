/**
 * Assignment 2 Question 1: Calculation of distance between two points 
 *   
 * Completion time: 5 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week2;

import java.util.Scanner;

public class GRAY_A02Q01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is x1?");
		double x1 = scan.nextDouble();
		
		System.out.println("What is y1?");
		double y1 = scan.nextDouble();
		
		System.out.println("What is x2?");
		double x2 = scan.nextDouble();
		
		System.out.println("What is y2?");
		double y2 = scan.nextDouble();
		
		double totalDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("The distance is " + totalDistance);
	}
}
