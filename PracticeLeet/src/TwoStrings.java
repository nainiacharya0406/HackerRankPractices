import java.util.ArrayList;

public class TwoStrings {
	static String twoStrings(String s1, String s2) {
		String s3 = "NO";
		int s1L = s1.length();
		int s2L = s2.length();
		ArrayList<Character> ch = new ArrayList<Character>();
		int j=0;
		if(s1L >= s2L) {
			for(int i=0 ; i<s1.length(); i++) {
				ch.add(s1.charAt(i));
			}
			while(j<s2.length()) {
				if(ch.contains(s2.charAt(j))){
					s3 = "YES";
					return s3;
				}
				j++;
			}
		}else {
			for(int i=0 ; i<s2.length(); i++) {
				ch.add(s2.charAt(i));
			}
			while(j<s1.length()) {
				if(ch.contains(s1.charAt(j))){
					s3 = "YES";
					return s3;
				}
				j++;
				
			}
		}
		return s3;

    }

	public static void main(String[] args) {
		String s1= "hldi";
		String s2 = "world";
		String result = twoStrings(s1, s2);
		System.out.println(result);

	}

}
