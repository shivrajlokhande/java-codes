import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter String");
		StringBuffer str = new StringBuffer(sc.nextLine());
		for (int i = 0; i < str.length(); i++) {
			if((str.codePointAt(i) >= 97) && (str.codePointAt(i) <= 122))
				str.setCharAt(i, (char)(str.codePointAt(i) - 32));
		}
		System.out.println("String in Upper Case:  ");
		System.out.println(str);
	}
}
