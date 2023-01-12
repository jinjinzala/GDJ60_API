package src.com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exception 발생 가능성 있어 close() 쓰기 위해서 
	      //null로 초기화
	      Socket socket = null;
	      OutputStream os = null;
	      OutputStreamWriter ow = null;
	      BufferedWriter bw = null;
	      
	      InputStream is = null;
	      InputStreamReader ir = null;
	      BufferedReader br = null;
	      
	      Scanner sc = new Scanner(System.in);
	      
	      //자바:ip+port-> socket
	      //127.0.0.1 = localhost(자신의 ip)
	      //포트번호 0~65535
	      
	      try {
	         //객체 생성시 서버 접속 시도
	         socket = new Socket("192.168.1.95",8284);
	         System.out.println("Server 접속 성공");
	         
	         while(true) {
	         //0과 1을 처리
	         os = socket.getOutputStream();
	         //char
	         ow = new OutputStreamWriter(os);
	         //String
	         bw = new BufferedWriter(ow);
	         System.out.print("서버로 보낼 메세지를 입력하세요: ");
	         //메세지를 담아 보낸다
	         String msg = sc.next();
	         
	         bw.write(msg+"\r\n");
	         //버퍼가 강제로 비워지지 않을 때도 있으니
	         //강제로 비운다
	         bw.flush();
	         if(msg.toUpperCase().equals("Q")) {
	        	 break; 
	         }
	         
	         
	         is = socket.getInputStream();
	         ir = new InputStreamReader(is);
	         br = new BufferedReader(br);
	         
	         msg = br.readLine();
	         if(msg.toUpperCase().equals("Q")) {
	        	 break; 
	         }
	         
	         
	         
	         }
	         
	         
	         
	      }catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }   finally {
	    	        try {
			            br.close();
			            ir.close();
			            is.close();
			            bw.close();
			            ow.close();
			            os.close();
			            socket.close();
			            } 
	    	           catch(Exception e) {	
	                 	}
		  }
	   }

		
}
