
public class SubSuper extends SuperSub {

	void printMethod(){
		System.out.println("in sub class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSuper sc = new SubSuper(); //sub class
		SuperSub sb = new SuperSub(); //super class
		SuperSub sbc = new SubSuper(); //sub class
		//SubSuper scb = new SuperSub();
		sc.printMethod();
		sb.printMethod();
		sbc.printMethod();
		

	}

}
