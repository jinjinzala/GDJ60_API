package src.com.iu.api2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

import src.com.iu.api2.sample.Parent;

public class RandomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Random random = new Random();
		 // 1000원 로또 구매 1~45 번호 6개를 랜덤한 숫자로 추출
		 
		 //2. 중복을 걸러내주는 HashSet 라이브러리 
		 HashSet<Integer> hs = new HashSet<>();
		 
		 while(hs.size()<6) {
			 hs.add(random.nextInt(45)+1);
		 }
		 
		 System.out.println(hs);
		 
		 //3.ArrayList 방법
		 ArrayList<Integer> ar = new ArrayList<>();
		 while(ar.size()<6){
		      int n = random.nextInt(45)+1;
		      boolean check =true;
		      
		   for(int i=0; i<ar.size();i++) {
			   if(n !=ar.get(i)) {
				  check=false;
				  break;
			 }
		   }
		   
		   if(check) {
			   ar.add(n);
		   }
		 }
		 
		 

		 
		//1.배열선언 
		 int [] nums = new int [6];
	     // for문 
		 for(int i=0; i<nums.length;i++) {	    	 
	    	 nums[i] = random.nextInt(45)+1;
	    	 for(int j=0;j<i;j++) {
	    		 if(nums[i]==nums[j]) {
	    			 i--;
	    			 break;
	    		 }
	    	 }
	     }
		 
		 for(int i=0; i<nums.length;i++) {	    	 
			 System.out.println(nums[i]);
		 }
		 

	}

}
