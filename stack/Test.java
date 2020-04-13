package datastructure;
/*
 * @author Shivraj Lokhande (https://github.com/shivrajlokhande)
 */

import java.util.Scanner;

/*
 * Class to Test functionality of stack in a menu driven program
 */

public class Test {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static PrintOptions displayMenu()
	{
		System.out.println("0.PUSH");
		System.out.println("1.POP");
		System.out.println("2.PEEK");
		System.out.println("3.TRAVERSE");
		System.out.println("4.EXIT");
		int value = sc.nextInt();
		return PrintOptions.getEnum(value);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Stack Program");
		System.out.println("Enter Size of Stack");
		int size = sc.nextInt();
		Stack stack = new Stack(size);
		
		while(true)
		{
			try
			{
				switch (displayMenu()) {
				case PUSH:
					System.out.println("Enter Value to Push into Stack");
					stack.push(sc.nextInt());
					break;
					
				case POP:
					System.out.println("Popped Element:  "+stack.pop());
					break;
					
				case PEEK:
					System.out.println("Peek Element:  "+stack.peek());
					break;
					
				case TRAVERSE:
					stack.traverse();
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
