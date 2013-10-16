import java.util.Scanner;


public class AdvancedBabylonianAlgorithm {

	/**
	 * Program that uses iterations of babylonian algorithm to find square root of number until last guess is within
	 * 1% of previous guess
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a positive Integer");
		double n1 = keyboard.nextDouble();
		
		double guess = (n1/2);
		double guessholder = 0.0;
		
		
		do {
			guessholder = guess;
			@SuppressWarnings("unused")
			double r1 = (n1/guess);
			
			if (guessholder<guess) {
				guessholder=guessholder/guess;
			} else {
				guessholder=guess/guessholder;
			}
		} while ((guessholder<=0.99));
		
		System.out.println("Using the babylonian algorithm,");
		System.out.println("the closest estimation of the square root");
		System.out.printf("of " + n1 + " is: %.2f", guess);
	}

}
