package src.com.iu.api4.network.ex.clients;

import java.util.ArrayList;
import java.util.Scanner;

import src.com.iu.api4.network.ex.servers.StudentDTO;

public class StudentController {
     private Scanner sc;
     private StudentDAO studentDAO;
     private StudentView studentView;
     private ArrayList<StudentDTO> ar;
     
     
     public StudentController() {
    	sc = new Scanner(System.in);
 		studentDAO = new StudentDAO(); //주입
 		studentView = new StudentView();//의존성주입(DI)
     }
     
     public void start() {
    	boolean check = true;
    	
	    while(check) {
	    	 System.out.println("1. 전체학생정보출력");
	    	 System.out.println("2. 학생정보검색출력");
	    	 System.out.println("3. 학생정보추가");
	    	 System.out.println("4. 학생정보삭제");
	    	 System.out.println("5. 종료");
	         int select = sc.nextInt();
	         
	         
	         
	         
	    }
     }
     
    
}