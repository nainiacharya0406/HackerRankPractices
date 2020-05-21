package warmup;


public class LongSum {
	static long aVeryBigSum(long[] ar) {
		long sum=0;
		for(int i=0; i<ar.length; i++) {
			sum += ar[i];
			
		}
		return sum;

	}

	public static void main(String[] args){
		long[] ar = {8,9,2,6,3};
		long result = aVeryBigSum(ar);	
		System.out.println(result);
	}
}
