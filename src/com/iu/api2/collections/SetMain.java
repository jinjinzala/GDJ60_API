package src.com.iu.api2.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(11);
		hs.add(11);
		hs.add(2);
		//1이라는 데이터를 지우겠다
		hs.remove(1);
		
		System.out.println(hs.toString());
		System.out.println(hs.size());
		
		//Set의 데이터들을 Iterator 형식으로 변경 
		//변수 선언 
		//반복형
		
	    Iterator<Integer> is = hs.iterator(); 

	    while(is.hasNext()) {
	    	Integer num = is.next();
	    	System.out.println(num);
	    }
	    
	    
	    
	}

}
