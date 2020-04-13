/*
 * @author Shivraj Lokhande 
 */

/*
 * Question: Reverse an array of characters without 
 * reversing the special characters.
 * for ex - char []ch = {a,b,$,c,d,#}
 * output - {d,c,$,b,a,#}
*/
public class Test {
	
	public static boolean isSpecialCharacter(Character ch)
	{
		String temp = ch.toString();
		if(temp.matches("[^A-Za-z0-9]"))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		char ch[] = {'a','b','$','c','d','#'};
		int i=0,j=ch.length-1;
		while(i < j)
		{
			if(isSpecialCharacter(ch[i]))
				i++;
			else if(isSpecialCharacter(ch[j]))
				j--;
			else
			{
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;j--;
			}
					
		}
		System.out.println(ch);
	}
}
