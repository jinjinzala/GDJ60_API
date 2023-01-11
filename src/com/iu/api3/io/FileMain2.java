package src.com.iu.api3.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         File file = new File("c:\\fileTest","text.txt");
         System.out.println(file.exists());
         
         //파일에 내용을 작성
         
         String name = "suji";
         try {
			FileWriter fw = new FileWriter(file,true);
			fw.write(name+"\r\n");
			fw.flush(); //강제버퍼밀어내기
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         
	
	}

}
