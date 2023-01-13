package src.com.iu.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ServerMain {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
      // 프로그램의 시작 테스트의 용도
	  //  
		
	 public ArrayList<StudentDTO> init() throws Exception {
		    ArrayList<StudentDTO>
		 
		 
		 File file = new File("C;\\fileTest",".txt");
	     FileReader fr = new FileReader(file);
	     
	     FileReader fr = new FileReader(file);
	     BufferedReader br = new BufferedReader(fr);
	     boolean check = true;
	     
	     while(check) {
	    	 String s = br.readLine();
	    	 if(s==null) {
	    		 break;
	    	 }
	    	 StringTokenizer st = new StringTokenizer(s,"-");
	    	 StudentDTO studentDTO = new StudentDTO();
	    	 studentDTO.setName(st.nextToken());
	    	 StudentDTO.setNum(st.nextToken());
	    	 studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath() );
			 studentDTO.setAvg(studentDTO.getTotal()/3.0);
	    	 st.nextToken();
	    	 ar.add(studentDTO);
	     }
	     
	     return ar;
	     
	 
	 }
		
		
	}

}
