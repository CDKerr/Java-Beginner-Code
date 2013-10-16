
public class Product1ToN {
	
	static void productInt1To10(int upperLimit){
		int product = 1;
		
		for (int i = 1; i <= upperLimit; i++){
			System.out.print(product + ",");
			System.out.println();
			product += product*i;
		}
		System.out.println(product);
	}

	public static void main(String[] args) {
		productInt1To10(10);

	}

}
