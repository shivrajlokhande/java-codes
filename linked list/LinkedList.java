package datastructure;

/*
 * @author Shivraj Lokhande (https://github.com/shivrajlokhande)
 */

/*
 * Implementation of Singly Linear Linked List using Head pointer
 * Contains addFirst, addLast, addAfter, deleteFirst, deleteLast, traverse methods 
 */

public class LinkedList {

	/* Node Class */
	class Node
	{
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	private Node head;
	
	public LinkedList() {
	}
	
	/* Returns True if Linked List is empty */
	public boolean isEmpty()
	{
		return this.head == null;
	}
	
	/* Method to iterate through Linked List */
	public void traverse() throws CustomException
	{
		if(this.isEmpty())
			throw new CustomException("Linked List is Empty!");
		System.out.println("Linked List:");
		Node temp = this.head;
		while(temp != null)
		{
			System.out.printf("%d	",temp.data);
			temp = temp.next;
		}
		System.out.println("");
	}
	
	/* Method to add new node at first position */
	public void addFirst(int data)
	{
		if(this.isEmpty())
		{
			this.head = new Node(data);
		}
		else
		{
			Node temp = new Node(data);
			temp.next = this.head;
			this.head = temp;
		}
	}
	
	/* Method to add new node at last position */
	public void addLast(int data)
	{
		if(this.isEmpty())
			this.addFirst(data);
		else
		{
			Node temp = this.head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = new Node(data);
		}
	}
	
	/* Method to add new node after first occurrence data
	 * Throws Custom Exception: Node not found */ 
	public void addAfter(int node,int value) throws CustomException
	{
		Node temp = this.head;
		while(temp.next != null)
		{
			if(temp.data == node)
				break;
			temp = temp.next;
		}
		if((temp.data == node) && (temp.next == null))
		{
			this.addLast(value);
			return;
		}
		if(temp.data == node)
		{
			Node next = temp.next;
			Node newNode = new Node(value);
			temp.next = newNode;
			newNode.next = next;
			return;
		}
		if(temp.data != node)
			throw new CustomException("Node not found");
	}
	
	/* Method to delete node at first position */
	public void deleteFirst() throws CustomException
	{
		if(this.isEmpty())
			throw new CustomException("Linked List is Empty!");
		Node temp = this.head;
		this.head = this.head.next;
		temp = null;
	}
	
	/* Method to delete node at last position */
	public void deleteLast() throws CustomException
	{
		if(this.isEmpty())
			throw new CustomException("Linked List is Empty!");
		
		if(this.head.next == null)
		{
			this.head = null;
			return;
		}
			
		Node temp = this.head;
		Node prev = null;
		
		while(temp.next != null)
		{
			prev = temp;
			temp = temp.next;
		}
		
		prev.next = null;
		temp = null;
	}
	
	/*
	 * Method to delete node after first occurrence of specified element 
	 * Throws Custom Exception: Node not found & Last Node & List is empty
	 */
	public void deleteAfter(int node) throws CustomException
	{
		if(this.isEmpty())
			throw new CustomException("Linked List is Empty!");

		Node temp = this.head;
		while(temp.next != null)
		{
			if(temp.data == node)
				break;
			temp = temp.next;
		}
		if((temp.data == node) && (temp.next != null))
		{
			Node deletedNode = temp.next;
			temp.next = temp.next.next;
			deletedNode = null;
			return;
		}
		if(temp.next == null)
			throw new CustomException("Last Node");
		if(temp.data != node)
			throw new CustomException("Node not found");
	}
	
}
