package Week4;

import java.util.Scanner;

public class GRAY_A04Q02 {
	static final int MAX_SIZE = 5;
	static double[] values = new double[MAX_SIZE];
	
	public static void main(String[] args) {
		userInput();
	}
	
	public static void userInput() {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < values.length; i++) {
			try {
				System.out.println("Please enter a number: ");
				values[i] = Double.parseDouble(scan.nextLine());
			} catch (java.lang.NumberFormatException e) {
				System.out.println("Please enter a valid number.");
				continue;
			}
		}
	}
}
