package Week7;
/**
 * Assignment 7 Question 1: Implementation of the LinkedStack class with completed
 * 													implementations of peek, isEmpty, size, and toString methods
 * 
 * @author Lewis et al., Jared Gray
 * @version 1.0
 */

import java.util.Iterator;

public class Gray_A07Q01
{
    /**
     * Program entry point for stack testing.
     * @param args Argument list.
     */    
    public static void main(String[] args)
    {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        
        System.out.println("STACK TESTING");
        
        System.out.println("The stack contains:\n" + stack.toString());
        
        stack.push(3);
        stack.push(7);
        stack.push(4);
        System.out.println(stack.peek());
        stack.pop();        
        stack.push(9);
        stack.push(8);
        System.out.println(stack.peek());        
        System.out.println(stack.pop());
        System.out.println(stack.peek());        
        
        System.out.println("The size of the stack is: " + stack.size());
        System.out.println("The stack contains:\n" + stack.toString());        
    }
    
    /**
     * Represents a linked implementation of a stack.
     *
     * @author Java Foundations 
     * @version 4.0
     */
    public static class LinkedStack<T> implements StackADT<T>
    {
        private int count;  
        private LinearNode<T> top; 
    
        /**
         * Creates an empty stack.
         */
        public LinkedStack()
        {
            count = 0;
            top = null;
        }
    
        /**
         * Adds the specified element to the top of this stack.
         * @param element element to be pushed on stack
         */
        public void push(T element)
        {
            LinearNode<T> temp = new LinearNode<T>(element);
    
            temp.setNext(top);
            top = temp;
            count++;
        }
    
        /**
         * Removes the element at the top of this stack and returns a
         * reference to it. 
         * @return element from top of stack
         * @throws EmptyCollectionException if the stack is empty
         */
        public T pop() throws EmptyCollectionException
        {
            if (isEmpty())
                throw new EmptyCollectionException("stack");
    
            T result = top.getElement();
            top = top.getNext();
            count--;
     
            return result;
        }
       
        /**
         * Returns a reference to the element at the top of this stack.
         * The element is not removed from the stack.  
         * @return element on top of stack
         * @throws EmptyCollectionException if the stack is empty  
         */
        public T peek() throws EmptyCollectionException {
          if (isEmpty())
            throw new EmptyCollectionException("stack");

          return top.getElement();
        }
    
        /**
         * Returns true if this stack is empty and false otherwise. 
         * @return true if stack is empty
         */
        public boolean isEmpty() {
        	return (count == 0);
        }
     
        /**
         * Returns the number of elements in this stack.
         * @return number of elements in the stack
         */
        public int size() {
          return count;
        }
    
        /**
         * Returns a string representation of this stack. The string has the
         * form of each element printed on its own line, with the top most
         * element displayed first, and the bottom most element displayed last.
         * If the list is empty, returns the word "empty".
         * @return a string representation of the stack
         */
        public String toString() {
        	String result = "";
        	LinearNode current = top;

          while (current != null) {
            result = result + (current.getElement()).toString() + "\n";
            current = current.getNext();
          }
          
          String display = (result.isEmpty()) ? "empty" : result;
          return display;
        }
    }
}