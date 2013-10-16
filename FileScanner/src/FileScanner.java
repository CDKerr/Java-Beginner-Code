import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;;

public class FileScanner {
	public static void main(String[] args) throws FileNotFoundException {
		int num1; double num2; String name;
		
		Scanner in = new Scanner(new File("in.txt"));
		num1 = in.nextInt();
		num2 = in.nextDouble();
		name = in.next();
		
		System.out.println("Hello " + name + " the sum of " + num1 + " and " + num2 + " is " + (num1+num2) + ".");
	}
}
