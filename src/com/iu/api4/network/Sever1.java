package src.com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.naming.ldap.SortKey;

public class Sever1 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	   ServerSocket ss = null;
    	      Socket sc = null;
    	      InputStream is = null;
    	      InputStreamReader ir = null;
    	      BufferedReader br = null;
    	      
    	      OutputStream os =null;
    	      OutputStreamWriter ow =null;
    	      BufferedWriter bw =null;
    	      
    	      
    	      try {
    	         //객체를 만들면 8282포트를 열어놓고
    	         //클라이언트가 접속할 때까지 기다림
    	         ss = new ServerSocket(8284);
    	         System.out.println("Client 접속을 기다리는 중");
    	      
    	         //클라이언트의 응답을 받아 연결 성공
    	         sc = ss.accept();
    	         System.out.println("Client와 연결 성공");
    	         //0과 1을 처리
    	        
    	         while(true){is = sc.getInputStream();
    	         //char
    	         ir = new InputStreamReader(is);
    	         //String
    	         br = new BufferedReader(ir);
    	         //메세지를 읽어들인다
    	         
    	         String msg = br.readLine();
    	         if(msg.toUpperCase().equals("Q")) {
    	        	 break;
    	         }
    	     
				 System.out.println("Client: "+msg);
				 System.out.println("클라이언트로 보낼 메시지 입력");
	    	     // 스페이스바를 만날때 까지 가지고 온다
				 msg = scanner.nextLine();	        
    	         os = sc.getOutputStream();
    	         ow = new OutputStreamWriter(os);
    	         bw = new BufferedWriter(ow);
    	         
    	         bw.write(msg + "\r \n");
    	         bw.flush();
    	         
    	         if(msg.toUpperCase().equals("Q")) {
    	        	 break;
    	         }
    	      }
    	         
    	      } catch (IOException e) {
    	         // TODO Auto-generated catch block
    	         e.printStackTrace();
    	      } finally { try {
    				br.close();
    				ir.close();
    				is.close();
    				bw.close();
    				ow.close();
    				os.close();
    				ss.close();} 
    		    	catch(Exception e) {
    		 
    		   	 }
    	      
    }
    }
    }
