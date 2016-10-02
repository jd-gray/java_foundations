package Week7;
/**
 * Assignment 7 Question 4: Implementation of a Deque using LinearDoubleNode and DequeADT
 * 
 * @author Lewis et al., Jared Gray
 * @version 1.0
 */

public class Gray_A07Q04 {
    /**
     * Program entry point for deque testing.
     * @param args Argument list.
     */    
    public static void main(String[] args) {
        LinkedDeque<Integer> deque = new LinkedDeque<Integer>();
        
        System.out.println("DEQUE TESTING");
        
        //per Q1
        deque.enqueueBack(3);
        deque.enqueueBack(7);
        deque.enqueueBack(4);
        deque.dequeueFront();        
        deque.enqueueBack(9);
        deque.enqueueBack(8);
        deque.dequeueFront();
        System.out.println("The size of the deque is: " + deque.size());
        System.out.println("The deque contains:\n" + deque.toString());   
        
        //new features
        System.out.println(deque.dequeueFront());        
        deque.enqueueFront(1);
        deque.enqueueFront(11);                         
        deque.enqueueFront(3);                 
        deque.enqueueFront(5);         
        System.out.println(deque.dequeueBack());
        System.out.println(deque.dequeueBack());        
        System.out.println(deque.last());                
        deque.dequeueFront();
        deque.dequeueFront();        
        System.out.println(deque.first());        
        System.out.println("The size of the deque is: " + deque.size());
        System.out.println("The deque contains:\n" + deque.toString());            
    }
    
    /**
     * LinkedDeque represents a linked implementation of a deque.
     * 
     * @author Lewis et al., CST200
     * @version 1.0
     */
    public static class LinkedDeque<T> implements DequeADT<T> {
    	private int count;
      private LinearDoubleNode<T> head, tail; //front, back
 
      public LinkedDeque() {
          count = 0;
          head = tail = null;
      }

			public void enqueueFront(T element) {
				LinearDoubleNode<T> node = new LinearDoubleNode<T>(element);
				
				if (isEmpty()) {
					head = node;
					tail = node;
				} else {
					head.setPrev(node);
					node.setNext(head);
					head = node;
				}
				
				count++;
			}

			public void enqueueBack(T element) {
				LinearDoubleNode<T> node = new LinearDoubleNode<T>(element);
				
				if (isEmpty()) {
					head = node;
					tail = node;
				} else {
					tail.setNext(node);
					node.setPrev(tail);
					tail = node;
				}
				
				count++;
			}

			public T dequeueFront() {
				if (isEmpty())
          throw new EmptyCollectionException("queue");
				
        T result = head.getElement();
        head = head.getNext();
        head.setPrev(null);
        count--;

        if (isEmpty())
            tail = null;

        return result;
			}

			public T dequeueBack() {
				if (isEmpty())
          throw new EmptyCollectionException("queue");
				
        T result = tail.getElement();
        tail = tail.getPrev();
        tail.setNext(null);
        count--;

        if (isEmpty())
            tail = null;

        return result;
			}

			public T first() {
				return head.getElement();
			}

			public T last() {
				return tail.getElement();
			}

			public boolean isEmpty() {
				return (count == 0);
			}

			public int size() {
				return count;
			}
			
			public String toString() {
      	String result = "";
      	LinearDoubleNode<T> current = head;

        while (current != null) {
          result = result + (current.getElement()).toString() + " ";
          current = current.getNext();
        }
        
        String display = (result.isEmpty()) ? "empty" : result;
        return display;
			}
    }
}