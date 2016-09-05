/**
 * Assignment 2 Question 5: HiLo Game! 
 *   
 * Completion time: 20 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week2;

import java.util.Scanner;
import java.util.Random;

public class GRAY_A02Q05 {
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) { 
		String playAgain = "Y";
		
		while (playAgain.equalsIgnoreCase("Y")) {
			playGame();
			
			System.out.println("Do you want to play again (Y/N)");
			playAgain = scan.next();
		}
	}
	
	public static void playGame() {
		int randomNumber = rand.nextInt(100) + 1;
		int userInput = -1, count = 0;
	
		while (true) {
			System.out.println("What number do you guess?");
			userInput = scan.nextInt();
			count++;
			
			if (userInput == 0) {
				break;
			} else if(userInput < randomNumber) {
				System.out.println("Thats too low");
			} else if (userInput > randomNumber) {
				System.out.println("Thats too high");
			} else {
				System.out.println("Thats correct! You made " + count + " guesses.");
				break;
			}
		}
	}
}