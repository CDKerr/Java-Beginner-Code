import java.util.Scanner;

/**
 * 
 * @author Christopher.Kerr
 * This exercise will have a user input a number and then use 5 iterations of the Babylonian algorithm to find
 * the square root of the number. 
 */
public class BabylonianAlgorithm {
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		
		double n1 = keyboard.nextDouble();
		
		double guess = n1/2;
		
		double r1 = n1/guess;
		guess = (guess + r1)/2;
		
		r1 = n1/guess;
		guess = (guess = r1)/2;
		
		r1 = n1/guess;
		guess = (guess = r1)/2;
		
		r1 = n1/guess;
		guess = (guess = r1)/2;
		
		r1 = n1/guess;
		guess = (guess = r1)/2;
		
		System.out.println("Using the babylonian algorithm five times,");
		System.out.println("the closest estimation of the square root");
		System.out.printf("of " + n1 + " is: %.2f", guess);
	}
}
