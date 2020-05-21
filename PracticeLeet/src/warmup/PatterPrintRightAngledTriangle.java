package warmup;

public class PatterPrintRightAngledTriangle {

	static void staircase(int n) {
			for(int i=0; i<n ;i++) {
				for(int j=n; j>i; j--) {
					System.out.print(" ");
				}
				for(int k=0; k<=i; k++) {
					System.out.print("#");
				}
				System.out.println();
			}

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staircase(7);

	}

}
