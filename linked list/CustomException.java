package datastructure;

/*
 * @author Shivraj Lokhande (https://github.com/shivrajlokhande)
 */

/*
 * Throwing Custom Exception if LinkedList is empty
 */

public class CustomException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String exception;
	
	/* Constructor */
	public CustomException(String exception) {
		this.exception =exception;
	}
	
	/* Getter method to get custom exception message */
	public String getException()
	{
		return this.exception;
	}

}
