package datastructure;
/*
 * @author Shivraj Lokhande (https://github.com/shivrajlokhande)
 */

/*
 * Implementation of Queue using Array
 * Contains both Queue methods enqueue and dequeue
 * One additional traverse method to iterate through Queue 
 */

public class Queue {

	private int size;
	private int index;
	private Integer[] queue;
	
	/*
	 * Parameterized constructor taking size input 
	 * Creating new queue array based on size
	 */	

	public Queue(int size)
	{
		this.size = size;
		this.index = -1;
		//Array of References
		this.queue = new Integer[this.size];
	}

	/* Returns True if Queue is full */
	public boolean isFull()
	{
		return this.index == (this.size - 1);
	}
	
	/* Returns True if Queue is empty */
	public boolean isExpty()
	{
		return this.index == -1;
	}
	
	/* Method to add new element in Queue
	 * Throws Custom Exception:Queue is full
	 */
	public void enqueue(int value) throws CustomException
	{
		if(this.isFull())
			throw new CustomException("Queue is full");
		this.queue[++this.index] = value;
	}

	/* Method to remove element from Queue
	 * Throws Custom Exception:Queue is empty
	 */
	public void dequeue() throws CustomException
	{
		if(this.isExpty())
			throw new CustomException("Queue is empty");
		for (int i = 0; i <= (queue.length - 2); i++) {
			this.queue[i] = this.queue[i+1];
		}
		this.queue[this.index--] = null;
	}
		
	/* Method to Iterate over Queue
	 * Throws Custom Exception:Queue is empty
	 */
	public void traverse() throws CustomException
	{
		if(this.isExpty())
			throw new CustomException("Queue is Empty");

		System.out.println("Queue:");
		for(int i=0;i<=this.index;i++)
			System.out.printf("%d	",this.queue[i]);

		System.out.println();
	}

}
