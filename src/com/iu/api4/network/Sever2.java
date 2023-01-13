package src.com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Sever2 {
	public static void main(String[] args) {	
	
	// Client 접속 대기
	// 1.점심 메뉴 중에서 하나를 랜덤하게 골라서 전송해준다
	// 2.저녁 메뉴 중에서 하나를 랜덤하게 골라서 전송해준다
	// 3.종료 
		String [] lunch = {"라면","햄버거","짜장면","짬뽕","다이어트"};
		String [] dinner = {"삼겹살","갈비","순두부","김밥","바나나"};
		boolean check = true;
		ServerSocket ss =null;
		
		InputStream is = null;
		InputStreamReader ir =null;
		BufferedReader br =null;
		
		OutputStream os =null;
		OutputStreamWriter ow =null;
		BufferedWriter bw =null;
		
		while(check) {
			Calendar ca = Calendar.getInstance();
			Random random = new Random(ca.getTimeInMillis());
	
			
			int select = 1; 	
		    String menu = null;
			switch (select) {
			case 1: 
				select = random.nextInt(100)%5;
				menu = lunch[select];
				break;
			case 2: 
				select = random.nextInt(100)%5;
				menu = dinner[select];
				break;
			default:
				System.out.println("서버 프로그램을 종료합니다.");
				check = false;
				if(check) {
					bw.write(menu+"\r\n");
					bw.flush();
					
				}
			}
		}
		
		try {
			  ss = new ServerSocket(8284);
			  Socket socket = ss.accept();
			  
			  is = socket.getInputStream();
			  ir = new InputStreamReader(is);
			  br = new BufferedReader(ir);
			  
			  os = socket.getOutputStream();
			  ow = new OutputStreamWriter(os);
			  bw = new BufferedWriter(ow);
		          
			  String data = br.readLine();
			  
			  int s = Integer.parseInt(data);
			  
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
		
		
	   
	    
	Scanner scanner = new Scanner(System.in);
	ServerSocket ss = null;
	Socket sc = null;
	InputStream is = null;
	BufferedReader br = null;
	
	OutputStream os = null;
	OutputStreamWriter ow = null;
	BufferedWriter bw =null;
	
	
	
	
	
	
 
	

	
	
	
	
	
		
		
	}
}
