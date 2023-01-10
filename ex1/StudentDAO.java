package ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {

 private StringBuffer sb;
 private Scanner sc;
 
	private void addStudent() {
		
		
		System.out.println("학생의 정보를 추가합니다.");
		

		
	public void StudentDAO() {
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70");
		sb.append("winter-2-90-60-70");
		sb.append("iu-3-90-60-70");
		sb.append("iu-4-90-60-70");
	    // 학생 정보를 추가 
	    
		// 학생 정보 삭제
		public int removeStudent(ArrayList<StudentDTO>ar) {
			System.out.println("삭제할 이름 입력");
			String name = sc.next();
		int result = 0;
			//ar.remove(인텍스번호)
		//ar.remove(Object)
	
//		 for(int i=0; i<ar.size(); i++) {
//			 if(name.equals(ar.get(i).getName())) {
//				 ar.remove(i);
//				 break;
//			 }
//		 }
       for(StudentDTO studentDTO:ar) {}
       if(name.equals(studentDTO).getName())) {
    	   ar.remove(studentDTO);
    	   result=1;
    	   break;
       }
        return result;
        
       
		}
		
		public void addStudent(ArrayList<StudentDTO> ar) {
			StudentDTO studentDTO = new StudentDTO();
			System.out.println("이름을 입력");
			String name = sc.next();
			studentDTO.setName(sc.next());
			System.out.println("번호를 입력");
			studentDTO.setNum(sc.nextInt());
			System.out.println("국어 점수를 입력 ");
			studentDTO.setKor(sc.nextInt());
			System.out.println("영어 점수를 입력 ");
			studentDTO.setEng(sc.nextInt());
			System.out.println("수학 점수를 입력 ");
			studentDTO.setEng(sc.nextInt());
			studentDTO.setAvg(studentDTO.);
			
		}
		
	}
		
		//학생정보검색
	public void findByName(ArrayList<StudentDTO>ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름을 입력");
		String name = sc.next();
		
		StudentDTO st = null;
		
		
		for(StudentDTO studentDTO:ar ) {
		 if(name.equals(studentDTO.getName())) {
			 st = studentDTO;
			 break;
		}
	}	
	
		return st;
		
		
	public ArrayList<StudentDTO> init() {
		String data = this.sb.toString();
		data=data.replace(" ", "-")
		data = data.replace(",", "");
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		
		System.out.println(data);
		StringTokenizer st = new StringTokenizer(data,"-");
	    while(st.hasMoreTokens()) {
            StudentDTO studentDTO = new StusentDTO();
            studentDTO.setName(st.nextToken());
            studentDTO.setNum(Integer.parseInt(st.nextToken());
            studentDTO.setKor(Integer.parseInt(st.nextToken());
	    	studentDTO.setEng(Integer.parseInt(st.nextToken());
	    	studentDTO.setMath(Integer.parseInt(st.nextToken());
	    	studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng())
	    	studentDTO.setAvg(studentDTO.getTotal()/3.0);
	    
	    	ar.add(studentDTO);
	    	
	    }
	    return ar;
	}		
		System.out.println(st.nextToken());
    	System.out.println(st.nextToken());
    	System.out.println(st.nextToken());
    	System.out.println(st.nextToken());
    	System.out.println(st.nextToken());
    	System.out.println("============");
   

	
	}	
	}
	
	
	
}
