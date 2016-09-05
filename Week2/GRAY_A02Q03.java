/**
 * Assignment 2 Question 3: Program rolling select amount of dice with
 * 							additional number 
 *   
 * Completion time: 10 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week2;

import java.util.Scanner;
import java.util.Random;

public class GRAY_A02Q03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("How many dice would you like to roll?");
		int dice = scan.nextInt();
		
		System.out.println("What should be added to the result?");
		int additional = scan.nextInt();
		
		int result = dice * (rand.nextInt(6) + 1) + additional;
		
		System.out.println("The result of rolling " + dice + "D6+" + additional + " is " + result);
	}
}
