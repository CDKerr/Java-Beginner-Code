
public class FibonacciLoop {
	
	static void getFibonacci(int n){
		double f1 = Math.pow(((1 + Math.sqrt(5)) / 2.0), n);
		double f2 = Math.pow(((1 - Math.sqrt(5)) / 2.0), n);
		
		int result = (int) ((f1 - f2) / Math.sqrt(5));
		System.out.print(result + " ");	
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 20; ++i){
			getFibonacci(i);
		}
	}

}
