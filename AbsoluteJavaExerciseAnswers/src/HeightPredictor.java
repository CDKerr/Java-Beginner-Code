import java.util.Scanner;


public class HeightPredictor {


	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String gender;
		double childHeight, childFeet, childInches, mumHeight, mumFeet, mumInches, dadHeight, dadFeet, dadInches;
		
		System.out.println("Enter gender, mums height in feet and inches, dads height in feet and inches");
		
		gender = keyboard.next().toLowerCase();
		
		if (!(gender.equalsIgnoreCase("m")||gender.equalsIgnoreCase("f"))){
			System.out.println("Incorrect gender exiting");
		}
		
		mumFeet = keyboard.nextDouble();
		mumInches = keyboard.nextDouble();
		dadFeet = keyboard.nextDouble();
		dadInches = keyboard.nextDouble();
		
		mumHeight = (mumFeet*12)+mumInches;
		dadHeight = (dadFeet*12)+dadInches;
		
		if (gender.equalsIgnoreCase("m")){
			childHeight=((mumHeight*12/13)+mumHeight/2);
			childFeet=childHeight/12;
			childInches=childHeight%12;
		}else{
			childHeight=((dadHeight*13/12)+mumHeight/2);
			childFeet=childHeight/12;
			childInches=childHeight%12;
		}
		
		System.out.printf("You are %1.0f feet and %1.0f inches tall.", childFeet, childInches);
		System.out.println("Obvs this is rubbish but shows I can code!!!");
	}

}
