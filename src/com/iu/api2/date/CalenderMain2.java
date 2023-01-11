package src.com.iu.api2.date;

import java.util.Calendar;

public class CalenderMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		// 칼랜더 메소드 만드는 법
		
		Calendar now = Calendar.getInstance();
        Calendar birth = Calendar.getInstance();
        Calendar sample = Calendar.getInstance();
        
                
        birth.set(1998,12,13);
        sample.set(Calendar.MINUTE,sample.get(Calendar.MINUTE)+1);
        
        
        
        //현재 시간을 밀리세컨즈로 변환
        long n = now.getTimeInMillis();
        long s = sample.getTimeInMillis();
        
        n = s-n;
        n = n/(1000*60*60*24);
        
        
        
        System.out.println("n : "+n);
        System.out.println("s : "+s);
        System.out.println(birth.getTime());
        System.out.println(sample.getTime());
        System.out.println(now.getTime());
		
	}

}
