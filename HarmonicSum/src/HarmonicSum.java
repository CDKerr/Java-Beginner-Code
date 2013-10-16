
public class HarmonicSum {
	
	static int maxDenominator = 50000;
	static double sumL2R = 0.0;
	
	static void HarmonicSumLeft2Right(){
		for (int denominator = 1; denominator <= maxDenominator; ++denominator){
				sumL2R = sumL2R + (double)1/denominator;
		}
		System.out.println(sumL2R);
	}

	public static void main(String[] args) {
		HarmonicSumLeft2Right();

	}

}
