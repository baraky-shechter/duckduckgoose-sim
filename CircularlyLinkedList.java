package edu.frostburg.cosc310;

/**
 * 
 * @author Barak Shechter
 * @version 2015.10.2
 *
 * @param <E> Data Type of list
 */
public class CircularlyLinkedList<E> {
	
	//-------- nested Node class -----------------
	public static class Node<E> {
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> n) {
			next = n;
		}
	}
	//-------- end of nested Node class ----------

	// instance variables of the CircularlyLinkedList
	private Node<E> tail = null;
	private int size = 0;
	public CircularlyLinkedList() {}
	
	// access methods
	public int size() {
		return size;
	}
	
	
	public boolean isEmpty() {
		return size ==0;
	}
	
	
	public E first() {
		if(isEmpty()) return null;
		return tail.getNext().getElement();
	}
	
	public E last() {
		if(isEmpty()) return null;
		return tail.getElement();
	}
	
	/**
	 * Return the tail node of the list
	 * 
	 * @return Node tail
	 */
	public Node<E> getTail() {
		if(isEmpty()) return null;
		return tail;
	}
	
	// update methods
	
	// Rotate the 1st element to the back of the list
	public void rotate() {
		if (tail!=null)
			tail = tail.getNext();
	}
	
	/**
	 * 
	 * @param e
	 */
	public void addFirst(E e) {
		if (size == 0) {
			tail = new Node<>(e,null);
			tail.setNext(tail);
		} else {
			Node<E> newest = new Node<>(e,tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	
	/**
	 * 
	 * @param e
	 */
	public void addLast(E e) {
		addFirst(e);
		tail = tail.getNext();
	}
	
	/**
	 * 
	 * @return
	 */
	public E removeFirst() {
		if(isEmpty()) return null;
		Node<E> head = tail.getNext();
		if (head == tail) tail = null;
		else tail.setNext(head.getNext());
		size--;
		return head.getElement();
	}
}
