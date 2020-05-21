
public class withoutMain {
	
	static {
		System.out.println("in static");
	}
	public static void main(String[] args) {
		System.out.println("in main");
		main(10);
	}
	public static void main(int id) {
		System.out.println("id: " +id);
	}

}
