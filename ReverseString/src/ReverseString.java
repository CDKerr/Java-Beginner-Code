import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
    String input;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter a String");
	
	input = in.next();
	reverse(input);	
	}

	private static void reverse(String input) {
		for (int idx = input.length()-1; idx >= 0; idx--)
			System.out.print(input.charAt(idx));
	}

}
