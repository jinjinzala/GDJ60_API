package src.com.iu.api3.exception;

public class CustomException extends Exception{

	int num1 = 65;
	int num2 = 48;
//	int sum = num1+ num2;
	int sum = num2-num1;
	if(sum<0) {
		throw new CustomException("음수는 읽을 수 업성요");}
	}
	public CustomException() {
	super();	
	}
	
	public CustomException(String message) {
	super(message);	
	}
	
	void ex2() throws Exception{
	
	try {
	if(sum>99) {
		 throw new CustomException("몰라");
		
	}
	}
}
