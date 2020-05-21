
public class MinimunBribes {
	static void minimumBribes(int[] q) {
		int swap = 0;
		for(int i =0; i<q.length; i++) {
			int swapI = 0;
			for(int j=i+1; j<q.length; j++) {
				if(q[i] > q[j]) {
					int c = q[i];
					q[i] = q[j];
					q[j] = c;
					if(swapI <= 2) {
						swapI++;
					}
					else {
						System.out.println("Too chaotic");
					}
					
				}
			}
			swap = swap +swapI;
		}
		System.out.println("swap : "+swap);
    }
	
	 public static void main(String[] args) {
		 int t = 3;
		 int[] q = {2, 5, 1, 3, 4};
		 minimumBribes(q);
	 }
}
