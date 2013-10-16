
public class CheckPassFailExercise {

	public static void passfailcheck(int mark){
		if (mark >=50 ){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) {
		int mark = 77;
		passfailcheck(mark);
	}

}
