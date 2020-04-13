/*
 * @author Shivraj Lokhande 
 */

/*
 * Implementation of String Reverse Program
 */

import java.util.Scanner;


public class Test {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter String");
		StringBuffer inputString = new StringBuffer(sc.nextLine());
		int i=0,j=inputString.length() - 1;
		while(i<j)
		{
			char temp = inputString.charAt(i);
			inputString.setCharAt(i, inputString.charAt(j));
			inputString.setCharAt(j, temp);
			++i;
			--j;
		}
		System.out.println("Reverse String: "+inputString);
	}
}
