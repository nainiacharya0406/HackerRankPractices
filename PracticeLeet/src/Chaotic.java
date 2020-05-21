import java.util.ArrayList;

public class Chaotic {
	static void minimumBribes(int[] q) {
		int sum = 0;
		for(int k=q.length; k>0; k--) {
			if(q[k-1] > k) {
				sum = sum + findDif(q[k-1], k, sum);
			}
		}
		System.out.println(sum);
	}

	static int findDif(int i, int j, int sum) {
		if(i-j > 2) {
			System.out.println("Too Chaotic");
			System.exit(0);
		}else {
			sum = i-j;
		}
		return sum;
	}

	public static void main(String[] args) {
		int t = 3;
		int[] q = {2, 1, 5, 3, 4};
		minimumBribes(q);

	}
}
