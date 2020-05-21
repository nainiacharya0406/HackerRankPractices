import java.util.HashMap;
import java.util.Map;

public class SocksMerchant {
	
	static int sockMerchant(int n, int[] ar) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<ar.length; i++) {
			if(map.containsKey(ar[i])) {
				map.put(ar[i], map.get(ar[i])+1);
			}else {
				map.put(ar[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> hashMap : map.entrySet()) {
			if(hashMap.getValue()%2 ==0 || hashMap.getValue()/2 >=1) {
				count = count+ hashMap.getValue()/2;
			}
		}
		return count;

    }
	
	public static void main(String[] args) {
		
		int n = 7;
		int[] ar = {1,2,1,2,1,3,2};
		int result = sockMerchant(n, ar);
		System.out.println(result);

	}

}
