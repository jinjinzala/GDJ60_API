package src.com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
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
  
	Scanner scanner = new Scanner(System.in);
	ServerSocket ss = null;
	Socket sc = null;
	InputStream is = null;
	BufferedReader br = null;
	
	OutputStream os = null;
	OutputStreamWriter ow = null;
	BufferedWriter bw =null;
	
	Calendar ca = Calendar.getInstance();
	Random random = new Random(ca.getTimeInMillis());
	
	String [] lunch = {"라면","햄버거","짜장면","짬뽕","다이어트"};
	int idx = random.nextInt(100)%5;
	
	String menu = lunch[idx];  
	
	try {
		  ss = new ServerSocket(8284);
	      System.out.println("Client 접속을 기다리는 중");
	      sc = ss.accept();
	      System.out.println("Client와 연결 성공");
	      
	      String msg = br.readLine();
	      System.out.println("Client: "+msg);
	      
	      
	      
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		
	}
	
	
	
		
		
	}
}
