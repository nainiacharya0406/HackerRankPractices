import java.util.HashMap;
import java.util.Map;

public class CountTriplets {

	
	public static void main(String[] args) {
		int[] arr = {1,4,16,64};
		int r =4;
		long ans = countTriplets(arr, r);	
		System.out.println(ans);
	}

	private static long countTriplets(int[] arr, int r) {
		// TODO Auto-generated method stub
		Map<Long, Long> potential = new HashMap<Long, Long>();
		Map<Long, Long> counter = new HashMap<Long, Long>();
		long count = 0;
		for (int i = 0; i < arr.length; i++) {
			long a = arr[i];
			long key = a / r;
			
			if (counter.containsKey(key) && a % r == 0) {
				count += counter.get(key);
			}
			
			if (potential.containsKey(key) && a % r == 0) {
				long c = potential.get(key);
				counter.put(a, counter.getOrDefault(a, 0L) + c);
			}
			
			potential.put(a, potential.getOrDefault(a, 0L) + 1); // Every number can be the start of a triplet.
		}
		return count;
	}
}
