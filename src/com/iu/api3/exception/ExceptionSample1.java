package src.com.iu.api3.exception;

import java.util.Random;

public class ExceptionSample1 {
	
   public void ex2() {
	   //2자리
	   int num1 = 65;
	   int num2 = 48;
	   int sum = num1+num2;
	   
   }	
   public void ex1() throws ArithmeticRxException, NullPointerException {
	   Random random = new Random();
	   int num = random.nextInt(2);
	   num = 10/num;
	   
	   System.out.println(num);
	   
   }
}
