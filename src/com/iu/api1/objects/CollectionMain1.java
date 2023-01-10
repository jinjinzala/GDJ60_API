package src.com.iu.api1.objects;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		ArrayList<ArrayList<Integer>> ars = new ArrayList<>();
		
		ars.add(ar1);
		ars.add(ar2);
		
		ars.get(0).get(0);
        
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
	    
		map.put("ar1", ar1);
		map.put("ar2", ar2);
		
	}

}
