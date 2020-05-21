import java.util.ArrayList;

public class Notification {
	
	static int activityNotifications(int[] a, int d) {
		int start =0;
		int end = d-1;
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = start; i<d-1; i++) {
			list.add(a[i]);
		}
		int med = oddEven(list, d);
		if(end < a.length-1) {
			if(med < a[end]) {
				count++;
			}
		}
		
		return count;
	}
	
	private static int oddEven(ArrayList<Integer> a, int d) {
		int median = 0;
		//odd
		if(d%2 == 1) {
			median = a.get((d/2)-1);
		}
		//even
		else {
			int median1 =(int) Math.floor(d/2)-1;
			int median2 = (int) Math.ceil(d/2);
			median = (a.get(median1) + a.get(median2))/2;
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
