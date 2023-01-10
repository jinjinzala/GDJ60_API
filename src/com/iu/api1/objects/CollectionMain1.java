package src.com.iu.api1.objects;

import java.util.ArrayList;

public class CollectionMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		ArrayList<ArrayList<Integer>> ars = new ArrayList<>();
		
		ars.add(ar1);
		ars.add(ar2);
		
		ars.get(0).get(0);

		
		
	}

}
