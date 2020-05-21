package warmup;

public class AntTer {
	static void insectCount(String str, int n){
		int countTermite=0;
		int countAnt=0;
		int countAntEaten=0;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == 'A' && str.charAt(i+1) == 'T') {
				countAntEaten++;
			}
			else if(str.charAt(i) == 'T') {
				countTermite++;
			}
			else if(str.charAt(i) == 'A' && str.charAt(i+1) == 'A') {
				countAnt++;
			}
		}
		if(str.charAt(n-1) == 'A') {
			countAnt++;
		}else {
			countTermite++;
		}
		if(countAnt > countTermite) {
			System.out.println("Ants");
		}
		else if(countTermite > countAnt) {
			System.out.println("Termites");
		}
		else {
			System.out.println("Tie");
		}
	}
	public static void main(String args[] ) throws Exception {
		int n = 3;
		String str = "ATA"; 
		insectCount(str,n);
	}
}
