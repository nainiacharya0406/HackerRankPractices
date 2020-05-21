import java.util.HashSet;
import java.util.Set;

public class IceCreamParlour {

	
	static void whatFlavors(int[] cost, int money) {
		int count=0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<cost.length; i++) {
			if(set.contains(money-cost[i])) {
				count++;
			}
		}

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 5;
		int[] cost= {2,1,3,5,6};
		whatFlavors(cost, money);
	}

}
