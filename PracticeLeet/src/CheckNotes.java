import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CheckNotes {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
    	int count = 0;
    	ArrayList<String> list = new ArrayList<String>();
    	for(int i=0; i<magazine.length; i++) {
    		list.add(magazine[i]);
    	}
    	int j=0;
    	while(j < note.length) {
    		if(list.contains(note[j])) {
    			list.remove(note[j]);
    			count++;
    			j++;
    		}
    		else {
    			break;
    		}
    	}
    	
		/*
		 * for(int j=0; j<note.length; j++) { if(list.contains(note[j])) {
		 * list.remove(note[j]); count++; } }
		 */
		/*
		 * HashMap<String, Integer> map = new HashMap<String, Integer>(); for(int i=0;
		 * i<magazine.length; i++) { if(map.containsKey(magazine[i])) {
		 * map.put(magazine[i], map.get(magazine[i])+1); } else { map.put(magazine[i],
		 * 1); } } int i=0; for(Map.Entry<String, Integer> entry: map.entrySet()) {
		 * if(entry.getKey() == note[i] && entry.getValue() > 0) {
		 * entry.setValue(entry.getValue()-1); count++; i++; } }
		 */
    	if(count == note.length) {
    		System.out.println("Yes");
    	}
    	else {
    		System.out.println("No");
    	}
		/*
		 * for(Map.Entry<String, Integer> entry: map.entrySet()) {
		 * System.out.println(entry.getKey() +" "+entry.getValue()); }
		 */
    	
    }

    public static void main(String[] args) {

        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};

        checkMagazine(magazine, note);

    }
}
