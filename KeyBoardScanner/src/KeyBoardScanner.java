import java.util.Scanner;

public class KeyBoardScanner {

	public static void main(String[] args) {
		int num1; double num2; String name; double sum;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num1 = in.nextInt();
		System.out.println("Enter a double: ");
		num2 = in.nextDouble();
		System.out.println("Enter your name: ");
		name = in.next();
		sum = (num1+num2);
		System.out.println("Hello " + name + ", The sum of " + num1 + " and " + num2 + " is: " + sum);

	}

}
