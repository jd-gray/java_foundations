/**
 * Assignment 1 Question 2: Bug fixing - Find errors and comment them within file
 * 
 * Completion time: 15 minutes
 * 
 * @author  Jared Gray, initial code from Base_A01Q02.java
 * @version 1.0
 */

package Week1;

import java.util.Scanner;

public class GRAY_A01Q02 {
	// Logical error - set constant as two to find even integer
    public static final int NUM = 2;
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);       
	    int input, result;
        
	    System.out.print("Enter an integer number: ");
	    
	    // Logical-error - need to make sure user enters in proper input
	    try {
	    	// Compile-time error - correct result is to take in an integer instead of string
	    	input = scan.nextInt();
	    	// Compile-time error/Syntax error, missing semicolon to close line statement
		    result = input % NUM;
		    
		    // Compile-time error - missing double == for comparison
		    // Logical-error - if remainder returns 0 than integer is even,
		    // otherwise result is odd
		    if (result == 0) {
			    System.out.println("\n\nNumber " + input + " is even.");
		    }
		    else {
		   	    System.out.println("\n\nNumber " + input + " is odd.");
		    }
	    }
	    // Handle exception
	    catch (java.util.InputMismatchException e) {
	    	System.out.println("Please enter integer only");
	    	return;
	    }
    }   
}
