import java.util.ArrayList;

public class Demo {
 
	    static int fib(int n) {
	    	ArrayList<Integer> list = new  ArrayList<Integer>();
	    	list.add(0);
	    	list.add(1);
	    	for(int i=2; i<=n; i++) {
	    		list.add(list.get(i-2)+ list.get(i-1));
	    	}
	    	return list.get(n);
	    	
	    	
	    
	    } 
	       
	    public static void main (String args[]) 
	    { 
	    int n = 9; 
	    System.out.println(fib(n)); 
	    } 
	

}
