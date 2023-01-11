package src.com.iu.api3.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IoMain1 {

	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
  
	// 1. 키보드 연결 
	// 표준입력 : 키보드 ,마우스 ,스캐너
	// 표준출력 : 모니터 
	Scanner sc = new Scanner(System.in);
	
	// byte,0,1	
	InputStream  is = System.in;
	//char
	InputStreamReader ir = new InputStreamReader(is);
	//string
	BufferedReader br = new BufferedReader(ir);
	
	
	try {
		System.out.println("입력");
		String msg = br.readLine();
		System.out.println(msg);
	} catch(IOException e) {
		e.printStackTrace();
	}finally {
		//역순을 닫는다
		br.close(); 
		ir.close();
		is.close();
		
	}
	
	
	}

}
