import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {

	static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
	public void run() {
		map.put(104, "D");
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	public static void main(String[] args) throws InterruptedException {
		map.put(101, "A");
		map.put(102, "B");
		map.put(103, "C");
		ConcurrentHashMapDemo d = new ConcurrentHashMapDemo();
		d.start();
		for(Object o : map.entrySet()) {
			Object s =o;
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(map);
		

	}

}
