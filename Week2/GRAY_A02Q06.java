/**
 * Assignment 2 Question 6: Stars Program, 10 rows high, 9 characters wide 
 *   
 * Completion time: 30 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week2;

public class GRAY_A02Q06 {
	static int NUMBER_ROWS = 10, row, space, dash;
	
	public static void main(String[] args) {
		top();
		bottom();
	}
	
	public static void top() {
		for (row = 1; row <= NUMBER_ROWS; row++) {
			for (space = NUMBER_ROWS; space >= row; space--) {
				System.out.print(" ");
			}
			for (dash = 1; dash <= row; dash++) {
				System.out.print(" *");
			}
			System.out.println("\n");
		}
	}
	
	public static void bottom() {
		for (row = 1; row <= NUMBER_ROWS; row++) {
			for (space = 1; space <= row; space++) {
				System.out.print(" ");
			}
			for (dash = NUMBER_ROWS; dash >= row; dash--) {
				System.out.print(" *");
			}
			System.out.println("\n");
		}
	}
}
