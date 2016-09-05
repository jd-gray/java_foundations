/**
 * Assignment 1 Question 4: Calculation of user input of hours, minutes, and seconds
 * 							into total seconds
 * 
 * Completion time: 5 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week1;

import java.util.Scanner;

public class GRAY_A01Q04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter hours:");
		int hours = scan.nextInt(); 
		
		System.out.println("Enter minutes:");
		int minutes = scan.nextInt();
		
		System.out.println("Enter seconds:");
		int seconds = scan.nextInt();
		
		int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
		
		System.out.println("The total seconds is " + totalSeconds);	
	}
}
