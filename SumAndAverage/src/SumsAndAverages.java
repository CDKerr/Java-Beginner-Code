public class SumsAndAverages {

	private static int sum;
	private static int i;

	public static void SumAndAverage(int upperLimit){
		
		for (i = 1; i <= upperLimit; ++i){
			sum += i;
		}
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + (sum/(double)i));
		System.out.println("This is a for loop");
		System.out.println();
	}
	
	public static void SumAndAverage2(int upperLimit){
		while (i <= upperLimit){
			sum += i;
			++i;
		}
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + (sum/(double)i));
		System.out.println("This is a while loop");
		System.out.println();
	}
	
	public static void SumAndAverage3(int upperLimit){
		do{
			sum += i;
			++i;
		}while(i<=upperLimit);
		
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + (sum/(double)i));
		System.out.println("This is a do-while loop, includes the next number when set up same way as others");
		System.out.println();
	}
	
	public static void SumAndAverage4(){
		int count = 0;
		final int lowerLimit = 111;
		final int upperLimit = 8899;
		
		for (int number = lowerLimit; number <= upperLimit; ++number){
			sum += number;
			++count;
		}
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + (sum/(double)i));
		System.out.println("Count = " + count);
		System.out.println("Lowerlimit = 111, UpperLimit = 8899 and a count");
		System.out.println();
	}
	
public static void SumAndAverage5(int upperLimit){
	
		int sum2 = 0;
		for (i = 1; i <= upperLimit; ++i){
			if (i %2 != 0){
			sum2 += i;
			}
		}
		System.out.println("Sum = " + sum2);
		System.out.println("Average = " + (sum2/(double)i));
		System.out.println("This is a for loop with a nested if only using negatives");
		System.out.println();
	}
	
public static void SumAndAverage6(){
	int upperLimit = 100;
	int sum2 = 0;
	for (i = 1; i <= upperLimit; ++i){
		if (i % 7 == 0){
			System.out.print(i+",");
		sum2 += i;
		}
	}
	System.out.println("Sum = " + sum2);
	System.out.println("Average = " + (sum2/(double)i));
	System.out.println("This is a for loop with a nested if only using numbers divisible by seven");
	System.out.println();
}

public static void SumAndAverage7(){
	int sum3=0;
	for (i = 1; i <= 100; ++i){
		System.out.println(i*i);
		sum3 += (i*i);
		
	}
	System.out.println("Sum = " + sum3);
	System.out.println("Average = " + (sum3/(double)i));
	System.out.println("This is a for loop calculating the sum of all squares");
	System.out.println();
}

	public static void main (String[] args){
		SumAndAverage(10);
		SumAndAverage2(10);
		SumAndAverage3(10); 
		SumAndAverage4();
		SumAndAverage5(10);
		SumAndAverage6();
		SumAndAverage7();
	}
}
