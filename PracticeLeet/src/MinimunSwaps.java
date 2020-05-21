import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimunSwaps {

	static int minimumSwaps(int[] arr) {
		int count =0;
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		for(int i = 1; i <=arr.length; i++) {
			arrL.add(i);
		}
		Collections.sort(arrL);
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != arrL.get(i)) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[j] == arrL.get(i)) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						count++;
						break;
					}
				}
			}
		}

		return count;

	}



	public static void main(String[] args){
		int[] arr = {7,1,3,2,4,5,6};
		int res = minimumSwaps(arr);
		System.out.println(res);
	}
}
