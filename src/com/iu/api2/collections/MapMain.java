package src.com.iu.api2.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain {
 public static void main(String[] args) {
	
	 HashMap< String,String> map = new HashMap< >();
	
	// 데이터 추가
	map.put("k1", "v1");
	map.put("k2", "v2");
	map.put("k3", "v3");
	map.put("k2", "v2Re");
	map.get("k3");
	
	//삭제

	
	//v = map.remove("k2");
	
   // 전체삭제
	boolean check = map.containsValue("k1");
	System.out.println(check);
	
	//반복문 
	// 1. key들의 정보를 알아야 함
	//    key들을 먼저 set으로 변환
    //    set을 iterator로 변환	
	Iterator<String> it = map.keySet().iterator();
	map.clear();
	
	while(it.hasNext()) {
	
	String key = it.next();
	System.out.println("key :"+key);
	String value = map.get(key);
	System.out.println("Value : "+value);

	}
	
	
	//데이터 조회 
	String v = map.get("k3");
	
	System.out.println(map);
	
	
}
}
