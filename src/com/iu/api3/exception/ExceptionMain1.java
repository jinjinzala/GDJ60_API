package src.com.iu.api3.exception;

import java.util.Random;

public class ExceptionMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String num = null;
     Random random = new Random();
     int n = random.nextInt(2);
     if(n==0){
    	 num = "test";
     }
     try{
     int a = 10;
     System.out.println(3/n);
     // throw new ArithmeticException();
     System.out.println(num.charAt(0));
     // throw new NullPointerException();
     }catch(ArithmeticException e){
    	 //예외가 어디서 나왔는지 알려줌 
    	 e.printStackTrace();
    	 System.out.println("예외 발생");
         int a = 100;
     }catch(RuntimeException e){
    	 e.printStackTrace();
     }catch(Exception e) {
    	 
     }catch(Throwable e) {
    	 
     }
     
     System.out.println("a");
     System.out.println("종료합니다");
	}

}
