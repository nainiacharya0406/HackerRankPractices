import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQuery {
	public static List<Integer> freqQuery(List<List<Integer>> queries){
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i<queries.size(); i++) {
			if(queries.get(i).get(i) == 1 && map.containsKey(queries.get(i))) {
				
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int q = 3;

        List<List<Integer>> queries = new ArrayList<>();
        List<Integer> ans = freqQuery(queries);

	}

}
