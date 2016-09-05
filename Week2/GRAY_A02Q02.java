/**
 * Assignment 2 Question 2: Calculation triangle area 
 *   
 * Completion time: 5 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class GRAY_A02Q02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("What is s?");
		double s = scan.nextDouble();
		
		System.out.println("What is a?");
		double a = scan.nextDouble();
		
		System.out.println("What is b?");
		double b = scan.nextDouble();
		
		System.out.println("What is c?");
		double c = scan.nextDouble();
		
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("The area is " + fmt.format(area));
	}
}
