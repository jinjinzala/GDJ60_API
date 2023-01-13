package src.com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
    // 전체 학생정보출력 
    // 학생정보검색출력 
	
	Socket socket = null;
	OutputStream os = null;
	OutputStreamWriter ow = null;
	BufferedWriter bw = null;
	      
	InputStream is = null;
	InputStreamReader ir = null;
	BufferedReader br = null;
	Scanner sc = new Scanner(System.in);	
	boolean check = true;
	
	
	try {//객체 생성시 서버 접속 시도
	      socket = new Socket("192.168.1.95",8282);
	      
	      while(true) {
	    	  os = socket.getOutputStream();
		         //char
		      ow = new OutputStreamWriter(os);
		         //String
		      bw = new BufferedWriter(ow);
		      
		      System.out.println("1. 전체학생정보출력");
		      System.out.println("2. 학생정보검색출력");
		      System.out.println("3. 학생정보추가");
		      System.out.println("4. 학생정보삭제");
		      System.out.println("5. 종료");
		      String msg = sc.next();
		      String num = msg;
		      // 메세지 보내기 
		      bw.write(msg+"\r\n");
		      //버퍼가 강제로 비워지지 않을 때도 있으니
		      //강제로 비운다
		      bw.flush();   
	
		      if(num.equals("1")||num.equals("2")) {
		    	  is = socket.getInputStream();
			      ir = new InputStreamReader(is);
			      br = new BufferedReader(ir);
			      msg = br.readLine();
			    
			      if(num.equals("1")) {
			    	  String [] result = msg.split("-");
			    	  for(int i=0;i<result.length;i++) {
							System.out.println(result[i].trim().toLowerCase());	
			    	  }
			       }
			      if(num.equals("2")) {
			    	  String [] result = msg.split("-");
			    	  for(int i=0;i<result.length;i++) {
							System.out.println(result[i].trim().toLowerCase());
					   }
			        }
			      }
			      if(num.equals("3")) {
			    	System.out.println("추가할정보를 입력해주세요 ");
			    	msg = sc.next();
			    	String [] result = msg.split("-");
			    	
			    	
			    	
			
			    	
			    	
			       }
			      if(num.equals("4")) {
			    	  
			       }
			      if(num.equals("5")) {
			    	check =false;
			       }
	       }


	  }catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	  }finally {
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
