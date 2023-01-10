package src.com.iu.api2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import src.com.iu.api2.sample.Parent;

public class RandomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Random random = new Random();
		 // 1000원 로또 구매 1~45 번호 6개를 랜덤한 숫자로 추출
		 int num = random.nextInt(45)+1;
		 ArrayList<Integer> ar = new ArrayList<>();
		 
		 private int random(int )
		 
		 
		 ar.add(random.nextInt(45)+1);
		 ar.add(random.nextInt(45)+1);
		 ar.add(random.nextInt(45)+1);
		 ar.add(random.nextInt(45)+1);
		 ar.add(random.nextInt(45)+1);
		 ar.add(random.nextInt(45)+1);
		 
		 Collections.shuffle(ar);
		 System.out.println(ar);
		 
		
		 
	
//		 if(ar == ar) {
//		 ar.add(random.nextInt(45)+1);
//		 ar.add(random.nextInt(45)+1);
//		 ar.add(random.nextInt(45)+1);
//		 ar.add(random.nextInt(45)+1);
//		 ar.add(random.nextInt(45)+1);
//		 ar.add(random.nextInt(45)+1);
//		 
//		 }else {
//		 System.out.println(ar);
//		 }
	}

}
