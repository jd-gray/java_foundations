/**
 * Assignment 4 Question 3: Program that reads strings and then prints strings
 * 													to file. Exits when the user types 'DONE'.
 *   
 * Completion time: 20 minutes
 * 
 * @author  Jared Gray
 * @version 1.0
 */

package Week5;

import java.util.Scanner;
import java.io.*;

public class GRAY_A04Q03 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String file = "userStrings.txt";
		
		FileWriter fw = new FileWriter(file);
	  BufferedWriter bw = new BufferedWriter(fw);
	  PrintWriter outFile = new PrintWriter(bw);
	  
	  printFile(scan, outFile, file);
	}

	private static void printFile(Scanner scan, PrintWriter outFile, String file) {
		while(true) {
	  	System.out.println("Enter text (Type DONE to exit and create file): ");
	  	String userInput = scan.nextLine();
	  	if (userInput.equals("DONE")) { break; }
	  	outFile.print(userInput);
	  	outFile.println();
	  }
	  outFile.close();
	  System.out.println ("Output file has been created: " + file);
	}
}
