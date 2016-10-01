package Week6;

import java.util.Stack;

public class scratch {
	public static void main(String[] args) {
//		Stack S = new Stack();
//		S.push(new Integer(4));
//		S.push(new Integer(3));
//		System.out.println(S);
//		//a) What is the content of the stack at this point?
//		Integer Y = (Integer) S.pop();
//		S.push(new Integer(7));
//		S.push(new Integer(2));
//		S.push(new Integer(5));
//		S.push(new Integer(9));
//		System.out.println(S);
//		//b) What is the content of the stack at this point?
//		Integer X = (Integer) S.pop();
//		S.push(new Integer(3));
//		S.push(new Integer(9));
//		System.out.println(S);
//		//c) What is the content of the stack at this point?
		
		Stack S = new Stack();
		S.push(1);
		S.push(3);
		S.push(2);
		S.push(8);
		S.push(4);
		System.out.println(S.peek());
		S.pop();
		System.out.println(S.peek());
		System.out.println(S.pop());
		System.out.println(S.peek());
		System.out.println(S);
	}
}
