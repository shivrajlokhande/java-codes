import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter String in Upper Case");
		StringBuffer str = new StringBuffer(sc.nextLine());
		
		for (int i = 0; i < str.length(); i++) {
			if((str.codePointAt(i) >= 65) && (str.codePointAt(i) <= 90))
				str.setCharAt(i, (char)(str.codePointAt(i) + 32));
		}
		System.out.println("String in Lower case:");
		System.out.println(str);
	}
}
