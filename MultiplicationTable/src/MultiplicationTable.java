
public class MultiplicationTable {

	public static void main(String[] args){
		
		int size = 9;
		
		for (int row = 1; row <= size; ++row){
			for (int col = 1; col <= size; ++row){
				int num = row * col;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
