/**
 * Assignment 2 Question 4: User input for determining if year is a leap year 
 *   
 * Completion time: 10 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week2;

import java.util.Scanner;

public class GRAY_A02Q04 {
	public static void main(String[] args) {
		String LEAP_YEAR = "That is a leap year";
		String NORMAL_YEAR = "That is not a leap year";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What year should be checked?");
		int year = scan.nextInt();
		
		// Return if not within Gregorian calendar 		
		if (year < 1582) {
			System.out.println("Please only enter years after 1581"); 
			return;
		}
		
		String result = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? LEAP_YEAR : NORMAL_YEAR;
		System.out.println(result);
	}
}
