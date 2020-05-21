package warmup;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int result=0;
		int digA=0;
		int digB=0;
		for(int i=0; i<arr.size();i++) {
			for(int j=0; j<arr.size(); j++) {
				if(i==j) {
					digA += digA + arr.get(i).get(i) ;
				}
			}
		}
		System.out.println(digA);
		
		
		
		return result;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> arrRowItems = new ArrayList<>();
		for(int j=0; j<3; j++) {
			for(int i=0; i<3; i++) {
				arrRowItems.add(0+j);		arrRowItems.add(1+j);		arrRowItems.add(2+j);
			}
			arr.add(arrRowItems);
		}
		System.out.println(arrRowItems);
		int result = DiagonalDifference.diagonalDifference(arr);
		System.out.println(result);
	}

}
