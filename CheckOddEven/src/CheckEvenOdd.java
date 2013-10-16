
public class CheckEvenOdd {
	
	public static void CheckOddEven(int number){
		if (number % 2 == 0 ){
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		int number = 77;
		CheckOddEven(number);
	}

}
