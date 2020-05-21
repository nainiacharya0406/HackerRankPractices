package warmup;

import java.util.ArrayList;
import java.util.List;

public class CountTriplets {
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<Integer>();
		int countA = 0, countB = 0;
		for(int i=0; i<a.size(); i++) {
			if(a.get(i) > b.get(i)) countA++;
			else if (a.get(i) < b.get(i)) countB++;
			
		}
		result.add(countA);
		result.add(countB);


		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		List<Integer> b = new ArrayList<Integer>();
		b.add(3);
		b.add(2);
		b.add(1);
		
		 List<Integer> result = compareTriplets(a, b);
		 System.out.println(result);

	}

}
