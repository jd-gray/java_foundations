package Week6;
/**
 * Assignment 6 Question 3: Using the java.util.Stack library, prompt user to enter text and type DONE
 * 													when finished. After display in reverse order on seperate lines.
 * 
 * Completion time: 20 minutes
 * 
 * @author Jared Gray
 * @version 1.0
 */


import java.util.Scanner;
import java.util.Stack;

public class Gray_A06Q03 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		userInput(stack);
		
		// Convert to array and print in reverse
		Object[] inputs = stack.toArray();
		for (int i = inputs.length - 1; i >= 0; i--) {
			System.out.println(inputs[i]);
		}
	}
	
	public static void userInput(Stack<String> stack) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		while(true) {
	  	System.out.println("Please enter a line of text (Type DONE to exit): ");
	  	String userInput = scan.nextLine();
	  	if (userInput.equals("DONE")) { break; }
	  	stack.push(userInput);
	  }
	}

	public static class UserInputStack<T> {
		private final static int DEFAULT_CAPACITY = 100;
		String[] stack;
		
		public UserInputStack() {
			this(DEFAULT_CAPACITY);
		}
		
		public UserInputStack(int initialCapacity) {
		}
	}
}
