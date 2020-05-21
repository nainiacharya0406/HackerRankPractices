import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

	// Complete the activityNotifications function below.
	static int activityNotifications(int[] a, int d) {
		int count = 0;
		int start = 0;
		Queue<Integer> que = new ArrayDeque<Integer>();
		int i = start;
		while(i < a.length-1) {
			for(i=0; i<d; i++) {
				que.add(a[i]);
			}
			int median = oddEven(a, d);
			if(median > a[i+1]) {
				count++;
			}
		}


		return count;
	}
	private static int oddEven(int[] a, int d) {
		int median = 0;
		//odd
		if(d%2 == 1) {
			median = a[(d/2)-1];
		}
		//even
		else {
			int median1 =(int) Math.floor(d/2)-1;
			System.out.println("median1: "+a[median1]);
			int median2 = (int) Math.ceil(d/2);
			System.out.println("median2: "+a[median2]);
			median = (a[median1] + a[median2])/2;
			System.out.println(median);
		}
		return median;
	}


	public static void main(String[] args) {
		int d = 4;

		int[] expenditure = {10,90,30,40,50,60};
		int result = activityNotifications(expenditure, d);
		System.out.println("result : "+result);
	}
}
