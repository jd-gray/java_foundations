package Week7;
/**
 * Assignment 7 Question 3: Represents the structure of a LinearDoubleNode.
 * 
 * @author Jared Gray
 * @version 1.0
 */

public class LinearDoubleNode<T> {
	private LinearDoubleNode<T> next;
	private LinearDoubleNode<T> prev;
	private T element;
	
	/**
   * Creates an empty node.
   */
	public LinearDoubleNode() {
		prev.next = next;
		next.prev = prev;
	}
	
  /**
   * Creates a node storing the specified element.
   * @param elem element to be stored
   */
	public LinearDoubleNode(T elem) {
		element = elem;
	}
	
  /**
   * Returns the node that follows this one.
   * @return reference to next node
   */
	public LinearDoubleNode<T> getNext() {
		return next;
	}
	
  /**
   * Sets the node that follows this one.
   * @param node node to follow this one
   */
	public void setNext(LinearDoubleNode<T> node) {
		next = node;
	}
	
	/**
   * Returns the previous node. 
   * @return reference to prev node
   */
	public LinearDoubleNode<T> getPrev() {
		return prev;
	}
	
	/**
   * Sets the previous node.
   * @param node node to follow this one
   */
	public void setPrev(LinearDoubleNode<T> node) {
		prev = node;
	}
	
  /**
   * Returns the element stored in this node.
   * @return element stored at the node
   */
  public T getElement() {
      return element;
  }

  /**
   * Sets the element stored in this node.
   * @param elem element to be stored at this node
   */
  public void setElement(T elem) {
      element = elem;
  }
}
