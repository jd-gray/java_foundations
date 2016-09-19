package Week6;
/**
 * Assignment 6 Question 2: DropOutStack, if the stack goes over the stated amount of elements,
 * 													then the bottom element will be dropped from the stack. 
 * 
 *  Completion time: 1 hour
 * 
 * @author Lewis et al., Jared Gray
 * @version 1.0
 */

public class Gray_A06Q02 {
    /**
     * Program entry point for drop-out stack testing.
     * @param args Argument list.
     */    
    public static void main(String[] args) {
        ArrayDropOutStack<Integer> stack = new ArrayDropOutStack<Integer>(4);
        
        System.out.println("DROP-OUT STACK TESTING");
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);       
        stack.push(5);               
        
        System.out.println("The size of the stack is: " + stack.size());        
        if(!stack.isEmpty())            
            System.out.println("The stack contains:\n" + stack.toString());
        
        stack.pop();        
        stack.push(7);
        stack.push(8);      
        
        System.out.println("The size of the stack is: " + stack.size());                
        if(!stack.isEmpty())            
            System.out.println("The stack contains:\n" + stack.toString());
    }
    
    public static class ArrayDropOutStack<T> implements StackADT<T> {	
    	private int top = 0;  
      private T[] stack;
      
    	@SuppressWarnings("unchecked")
			public ArrayDropOutStack(int initialCapacity) { 
        stack = (T[])(new Object[initialCapacity]);
    	}

    	public void push(T element) {
          if (size() == stack.length) {
              for (int i = 0; i < stack.length - 1; i++) {
              	stack[i] = stack[i + 1];
              }
          		stack[stack.length - 1] = element;
          } else {
          	stack[top] = element;
          	top++;
          }
      }
    	
    	public T pop() throws EmptyCollectionException {
          if (isEmpty())
              throw new EmptyCollectionException("stack");
  
          top--;
          T result = stack[top];
          stack[top] = null; 
  
          return result;
      }

    	public T peek() throws EmptyCollectionException {
          if (isEmpty())
              throw new EmptyCollectionException("stack");
  
          return stack[top-1];
      }

    	public boolean isEmpty() {
        return (top == 0);
      }

    	public int size() {
      	return top;
      }
    	
    	public String toString() {
      	String result = "";
				for (int i = top-1;  i >= 0; i--)
      		result += stack[i] + "\n";
          return result;
      }
    }
}