import java.util.*;;

public class Solution2 {

	public static void main(String srgs[]) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List list = threeSum(nums);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static List<List<Integer>> threeSum(int[] nums) {		
		List listList = new ArrayList();
		for(int i=0; i<nums.length-2; i++) {
			if(nums[i]+nums[i+1]+nums[i+2] == 0 ) {
				List<Integer> intList = new ArrayList<Integer>();
				intList.add(nums[i]);
				intList.add(nums[i+1]);
				intList.add(nums[i+2]);
				listList.add(intList);			
			}
		}


		return listList;
	}

}
