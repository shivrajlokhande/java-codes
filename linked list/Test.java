package datastructure;
/*
 * @author Shivraj Lokhande (https://github.com/shivrajlokhande)
 */

import java.util.Scanner;

/*
 * Class to Test functionality of Linked List in a menu driven program
 */

public class Test {

	private static Scanner sc = new Scanner(System.in);
	
	public static PrintOptions displayMenu()
	{
		System.out.println("0.ADD FIRST");
		System.out.println("1.ADD LAST");
		System.out.println("2.ADD AFTER");
		System.out.println("3.DELETE FIRST");
		System.out.println("4.DELETE LAST");
		System.out.println("5.DELETE AFTER");
		System.out.println("6.TRAVERSE");
		System.out.println("7.EXIT");
		int value = sc.nextInt();
		return PrintOptions.getEnum(value);
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Linked List Program");
		LinkedList list = new LinkedList();
		
		while(true)
		{
			try
			{
				switch(displayMenu())
				{
					case  ADD_FIRST:
						System.out.println("Enter element to ADD");
						list.addFirst(sc.nextInt());
						break;
						
					case ADD_LAST:
						System.out.println("Enter element to ADD");
						list.addLast(sc.nextInt());
						break;
						
					case ADD_AFTER:
						System.out.println("Enter node and data");
						list.addAfter(sc.nextInt(),sc.nextInt());
						break;
						
					case DELETE_FIRST:
						list.deleteFirst();
						break;
						
					case DELETE_LAST:
						list.deleteLast();
						break;
						
					case DELETE_AFTER:
						System.out.println("Enter node");
						list.deleteAfter(sc.nextInt());
						break;
						
					case TRAVERSE:
						list.traverse();
						break;
						
					case EXIT:
						return;
				}
				
			}
			catch (CustomException ex) {
				System.err.println(ex.getException());
			}
		}
	}
}
