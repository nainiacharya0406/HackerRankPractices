
public class ValleyCount {

	static int countingValleys(int n, String s) {
		int count =0;
		int countValley = 0;
		for(char ch : s.toCharArray()) {
			if(ch == 'U') {
				count++;
			}
			if(ch == 'D') {
				count--;
			}
			if(count == 0 && ch == 'U') {
				countValley++;
			}
		}
		return countValley;

	}
	public static void main(String[] args) {

		int n=8;
		String s = "UDDDUDUU";
		int result = countingValleys(n, s);
		System.out.println(result);

	}

}
