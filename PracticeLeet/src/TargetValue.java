import java.util.HashSet;
import java.util.Set;

public class TargetValue {
	
	static int pairs(int k, int[] arr) {
		
		int count=0;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length; j++) {
//				if(arr[i]-arr[j] == k) {
//					count++;
//				}
//			}
//		}
		Set<Integer> set = new HashSet<Integer>();
		for(int j=0; j<arr.length; j++) {
			set.add(arr[j]);
		}
		for(int n=0; n<arr.length; n++) {
			if(set.contains(arr[n]+k)) {
				count++;
			}
		}
		
		
		
		
		return count;


    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int k=1;
		
		int result = pairs(k, arr);	
		System.out.println(result);

	}

}
