package src.com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	public static void main(String[] args) {
	//1. 서버 접속 시도
	//2. 1.점심 2.저녁 3.종료
    //3. 1,2,3 고르기
	// 1번 : 서버에서 점심메뉴중 하나를 보내줌,출력 
	// 2번 : 서버에서 저녁메뉴중 하나를 보내줌,출력
	// 3번 : 종료 
	Scanner sc = new Scanner(System.in);
	InputStream is = null;
	InputStreamReader ir =null;
	BufferedReader br =null;
	
	OutputStream os =null;
	OutputStreamWriter ow =null;
	BufferedWriter bw =null;

	Socket socket = null;
	
		try {
			 socket = new Socket("192.168.1.95",8284);
	        
	         while(true){
	         System.out.print("1.아침, 2.점심, 3.저녁");
	         int select = sc.nextInt();
	         bw.write(select+"\r\n");
	         //버퍼가 강제로 비워지지 않을 때도 있으니
	         //강제로 비운다
	         
	         bw.flush();
	         if(select==3) {
	        	 System.out.println("프로그램 종료");
	        	 break;
	         }
	         String menu = br.readLine();
	         System.out.println("오늘 메뉴는 : "+menu);
	         
	         
		}
	}
	         
//	         if(msg.toUpperCase().equals("3")) {
//	        	 break; 
//	         }
//	         
//	         is = socket.getInputStream();
//	         ir = new InputStreamReader(is);
//	         br = new BufferedReader(br);
//	      
//	         msg = br.readLine();
//	         
//	       catch (Exception e) {
//		// TODO: handle exception
//			 e.printStackTrace();
//		}finally {
//			try {
//	            br.close();
//	            ir.close();
//	            is.close();
//	            bw.close();
//	            ow.close();
//	            os.close();
//	            socket.close();
//	            } 
//	           catch(Exception e) {	
//             	}
//		
//				}
//	         }
//		
//	
//	
//		
//	
//	
