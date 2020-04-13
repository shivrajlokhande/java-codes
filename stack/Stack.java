
package datastructure;
/*
 * @author Shivraj Lokhande (https://github.com/shivrajlokhande)
 */

/*
 * Implementation of Stack using Array
 * Contains all stack methods push,pop,peek
 * One additional traverse method to iterate through stack 
 */

public class Stack {

	private int size;
	private int top;
	private Integer[] stack;
	
	/*
	 * Parameterized constructor taking size input 
	 * Creating new Stack array based on size
	 */	
	public Stack(int size) {
		this.size = size;
		this.top = -1;
		//Array of References
		this.stack = new Integer[this.size];
	}
	
	/* Returns True if Stack is empty */
	public boolean isEmpty()
	{
		return this.top == -1;
	}
	
	/* Returns True if Stack is full */
	public boolean isFull()
	{
		return this.top == (this.size - 1);
	}
	
	/* Method to add new element in Stack
	 * Throws Custom Exception:Stack is full
	 */
	public void push(int value) throws CustomException
	{
		if(this.isFull())
			throw new CustomException("Stack is full");
		this.stack[++this.top] = value;
	}
	
	/*
	 * Method to delete top element from Stack
	 * Returns deleted element 
	 * Throws Custom Exception:Stack is empty
	 */
	public int pop() throws CustomException
	{
		if(this.isEmpty())
			throw new CustomException("Stack is empty");
		return this.stack[this.top--];
	}
	
	/*
	 * Method to get top element from Stack 
	 * Throws Custom Exception:Stack is empty
	 */
	public int peek() throws CustomException
	{
		if(this.isEmpty())
			throw new CustomException("Stack is empty");
		return this.stack[this.top];
	}
	
	/* Method to Iterate over Stack
	 * Throws Custom Exception:Stack is empty
	 */
	public void traverse() throws CustomException
	{
		if(this.isEmpty())
			throw new CustomException("Stack is empty");
		System.out.println("Traverse:");
		for(int i=this.top;i>=0;i--)
			System.out.printf("%d	", this.stack[i]);
		System.out.println();
	}
	
}
