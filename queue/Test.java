package datastructure;
/*
 * @author Shivraj Lokhande (https://github.com/shivrajlokhande)
 */

import java.util.Scanner;

/*
 * Class to Test functionality of Queue in a menu driven program
 */

public class Test {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static PrintOptions displayMenu()
	{
		System.out.println("0.ENQUEUE");
		System.out.println("1.DEQUEUE");
		System.out.println("2.TRAVERSE");
		System.out.println("3.EXIT");
		int value = sc.nextInt();
		return PrintOptions.getEnum(value);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Queue Program");
		System.out.println("Enter Size of Queue");
		int size = sc.nextInt();
		Queue queue = new Queue(size);
		
		while(true)
		{
			try
			{
				switch (displayMenu()) {
				case ENQUEUE:
					System.out.println("Enter Value to Add in Queue");
					queue.enqueue(sc.nextInt());
					break;
					
				case DEQUEUE:
					queue.dequeue();
					break;
					
				case TRAVERSE:
					queue.traverse();
					break;
										
				case EXIT:
					return;
				}
			}
			catch (CustomException exception) {
				System.err.println(exception.getException());
			}
		}
	}
	
}
