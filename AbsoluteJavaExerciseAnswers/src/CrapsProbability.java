
public class CrapsProbability {
	public static void main(String[] args) {
		int iterations;
		int comeOut = 0, roll = 0, point = 0, wins = 0, losses = 0;
		double comeOutDouble = 0.0;
		
		for (iterations = 0; iterations < 10000; iterations++) {
			comeOutDouble = 0.0;
			while(comeOutDouble < 2 || comeOutDouble>=12)
				comeOutDouble = Math.random()*12;
			comeOut = (int)comeOutDouble;
			System.out.println("Come out roll: " + comeOut);
			
			switch (comeOut) {
			case 7:
				System.out.println("You Win!");
				wins++;
				break;
			case 11:
				System.out.println("You Win!");
				wins++;
				break;
			case 2:
				System.out.println("You lose!");
				losses++;
				break;
			case 3:
				System.out.println("You lose!");
				losses++;
				break;
			case 12:
				System.out.println("You lose!");
				losses++;
				break;	
			default:
				point = comeOut;
				System.out.println("point: " + point);
				do {
					comeOutDouble = 0.0;
					while(comeOutDouble < 2 || comeOutDouble>=12)
						comeOutDouble = Math.random()*12;
						roll = (int)comeOutDouble;
						System.out.println(" new roll " + roll);
				} while ((roll!=7)&&(roll!=point));
				
				if (roll==7){
					System.out.println("You lose!");
					losses++;
					break;
				} else {
					System.out.println("You win!");
					wins++;
				break;
				}
			}
			
		}
		System.out.println(wins + " wins " + losses + " losses.");
	}

}
