
public class CozaLozaWoza {
	static int number = 1;
	static void CLW(){
		
		
		for (int i = number; i <= 110; ++i){
			if (i % 12 == 0){
				System.out.println();
			} else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
				System.out.print("CozaLozaWoza ");
			} else if (i % 3 == 0 && i % 5 == 0){
				System.out.print("CozaLoza ");
			} else if (i % 3 == 0 && i % 7 == 0){
				System.out.print("CozaWoza ");
			} else if (i % 3 == 0){
				System.out.print("Coza ");
			} else if (i % 5 == 0){
				System.out.print("Loza ");
			} else if (i % 7 == 0){
				System.out.print("Woza ");
			} else {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		CLW();
	}

}
