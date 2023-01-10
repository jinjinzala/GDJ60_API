package ex1;

import java.util.Scanner;

public class StudentController {
     
	private Scanner sc;
	private StudentDAO studentDAO;
	private StudentView studentView;
	private ArrayList<StudentDTO> ar;
	
	
	
	public StudentController() {
		sc = new Scanner(System.in);
	    studentDAO = new StudentDAO(); //주입
	    studentView = new StudentView(); // 의존성 주입 (DI)
	}
	
	
	public void start() {
		boolean check = true;
		
		while (check) {

			System.out.println("1. 학생정보초기화");
			System.out.println("2. 학생정보전체조회");
			System.out.println("3. 학생정보검색조회");
			System.out.println("4. 학생정보추가");
			System.out.println("4. 프로그램 종료");
			System.out.println("5. 학생정보삭제");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1 : 
				ar = studentDAO.init();
				break;
			case 2 :
				studentView.view(ar);	
			 break;
			case 3 :
				studentDTO studentDTO = studentDAO.findByName(ar);
				if(studentDTO != null){
					studentView.view(StudentDTO);
				}else {
					StudentView.view("찾는 학생이 없다")
				}
				
				break;
			case 4 :
				studentDAO.addStudent(ar);
				break;
			case 5 :	
				select = studentDAO.removeStudent(ar);
				if(select==1) {
 					studentView.view("삭제");
				}else {
					studentView.view("삭제실패");
				}
			default :
				
				
				
			}
		}
		  
    }
}
