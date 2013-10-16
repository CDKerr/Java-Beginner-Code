import java.util.Scanner;


public class InflationPredictor {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double costOfItem,rateOfInflation;
		int currentYear, yearOfPurchase, yearsAhead;
		
		System.out.println("Please enter the cost of the item, the current year, the year of purchase and the rate of inflation");
		
		costOfItem = keyboard.nextDouble();
		currentYear = keyboard.nextInt();
		yearOfPurchase = keyboard.nextInt();
		rateOfInflation = keyboard.nextDouble();
		
		yearsAhead = yearOfPurchase - currentYear;
		double inflationMultiplier = rateOfInflation/100;
		
		for (int i = 0; i < yearsAhead; i++) {
			costOfItem=(costOfItem*inflationMultiplier)+costOfItem;
		}
		System.out.printf("In the year %d, the item will cost $%.2f.", yearOfPurchase,costOfItem);
	}

}
