package src.com.iu.api2.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderMain4 {

	public static void main(String[] args) {
	Calendar ca = Calendar.getInstance();
	//2023년 1월 11일 => format
	SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E");
	
	sd.format(ca.getTime());
	System.out.println(sd);

	sd.applyPattern("yyyy-mm-dd-E");
	String p =sd.format(ca.getTime());
	
	
	
	
//	String f  = year+"년";
	
	
	

	}

}
