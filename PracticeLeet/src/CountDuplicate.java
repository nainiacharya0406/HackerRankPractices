import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicate {
	static final int NO_OF_CHARS = 256;
	static void duplicatePrint(String s){
		int count[] = new int[NO_OF_CHARS]; 
		for (int i = 0; i < s.length();  i++) {
			count[s.charAt(i)]++;
		}
	          
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < NO_OF_CHARS; i++) { 
            if(count[i] == 2) 
            	System.out.printf("%c, ", i);
           
        } 
        
        
    }
    public static void main(String args[] ) throws Exception {
        String str = "machine learning";
        duplicatePrint(str);
}
}
