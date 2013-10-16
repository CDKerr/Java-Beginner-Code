
public class DeadMice {
	
		public static final double SWEETENER_TO_KILL_A_MOUSE = 0.030;
		public static final double WEIGHT_OF_MOUSE = 0.1;
		public static final double WEIGHT_OF_DIETER = 90.0;
		public static final double DESIRED_WEIGHT_OF_DIETER = 70.0;
		public static final double PERCENTAGE_SWEETENER_IN_SODA = 0.001;
	
		public static void main(String[] args) {
		
		double sweenterInSodaCan = (330/100)*PERCENTAGE_SWEETENER_IN_SODA;
		System.out.println("In every can of soda ther is " + sweenterInSodaCan + " grams of sweetener");
		
		double toKillAMouse = SWEETENER_TO_KILL_A_MOUSE/sweenterInSodaCan;
		System.out.println("To kill a mouse with sweetener a mouse would have to drink " + toKillAMouse + " cans of soda");
		
		double amountOfSodaSafeToDrink = DESIRED_WEIGHT_OF_DIETER/sweenterInSodaCan;
		System.out.println("The amount of soda its safe to drink is: " + amountOfSodaSafeToDrink  +" cans");
		
		double amountOfSodaToKillDieter = WEIGHT_OF_DIETER/sweenterInSodaCan;
		System.out.println("The amount of soda to kill the dieter is " + amountOfSodaToKillDieter  + " cans");
		
		double cansPerWeek =amountOfSodaToKillDieter/52;
		System.out.println("Over a year, thats " + cansPerWeek + " cans per week or " + (cansPerWeek/7) + " a day");
	}

}
