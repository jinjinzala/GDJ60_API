package src.com.iu.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // GregorianCalender
		Calendar ca = new GregorianCalendar();
		// 현재 날짜와 시간으로 객체가 만들어짐 
		ca = Calendar.getInstance();
		System.out.println(ca);
		
		ca.set(Calendar.YEAR,2032);
		ca.set(Calendar.MONTH,11);
		
		
		
		//year
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH);
		int date = ca.get(Calendar.DATE);
		int day = ca.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("Year : "+year);
		System.out.println("Month : "+(month+1));
		System.out.println("Date : "+date);
		System.out.println("Day : "+day);
		
		//시 분 초
		int hour = ca.get(Calendar.HOUR);
		int minute = ca.get(Calendar.MINUTE);
		int second = ca.get(Calendar.SECOND);
		
		System.out.println("hour : "+hour);
		System.out.println("minute :"+minute);
		System.out.println("second :"+second);
		
		
		
	}

}
