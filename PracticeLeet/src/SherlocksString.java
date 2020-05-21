import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlocksString {

	static String isValid(String s) {
		String result = "YES";
        int min = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);                
            }else {
                map.put(s.charAt(i), 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();        
        int count=0;
            for(Map.Entry<Character, Integer> temp : map.entrySet()) {
            	list.add(temp.getValue());
            }
            for(int i=0; i<list.size(); i++) {
            	if(list.get(i)-min > 1) {
            		
            	}
            }
            System.out.println(count);
            if(count > 1) {
                result = "NO";
            }
        return result;


    }
	
	public static void main(String[] args) {
		String s = "abcdefghhgfedecba";
		String result = isValid(s);
		System.out.println(result);
		
	}

}
