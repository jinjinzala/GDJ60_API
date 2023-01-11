package src.com.iu.api3.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
	
		ExceptionSample1 e1 = new ExceptionSample1();
		ExceptionSample1 e2 = new ExceptionSample2();
		
		try {
		e2.ex2();
		}catch(Exception e){	
		 e.printStackTrece();
		 e.getMessge();
		}
		try {
		e1.ex1();
		}catch(Exception e)
		{e.printStackTrace();}
	  
	
	}

}
