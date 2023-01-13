package src.com.iu.api4.network.ex.clients;

import java.util.ArrayList;
import java.util.Scanner;

import src.com.iu.api4.network.ex.servers.StudentDTO;

public class StudentDAO {
	private StringBuffer sb;
	private Scanner sc;
	
	public StudentDAO() {
		this.sc=new Scanner(System.in);
		this.sb=new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
	}
		//학생정보삭제
		public int removeStudent(ArrayList<StudentDTO> ar) {
		//삭제확인용 변수
		//0이면 삭제 실패, 1 이면 삭제 성공
		int result=0;
		System.out.println("삭제할 이름 입력");
		String name = sc.next();
		
			for(StudentDTO studentDTO:ar) {
				if(name.equals(studentDTO.getName())) {
					ar.remove(studentDTO);
					result=1;
					break;
				}
			}
			
			return result;
			
		}
		
		//학생정보추가
		public void addStudent(ArrayList<StudentDTO> ar) {
			StudentDTO studentDTO = new StudentDTO();
			System.out.println("이름을 입력");
			studentDTO.setName(sc.next());
			System.out.println("번호를 입력");
			studentDTO.setNum(sc.nextInt());
			System.out.println("국어점수를 입력");
			studentDTO.setKor(sc.nextInt());
			System.out.println("영어점수를 입력");
			studentDTO.setEng(sc.nextInt());
			System.out.println("수학점수를 입력");
			studentDTO.setMath(sc.nextInt());
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath() );
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
			
			
		}
		
		//학생정보검색
		public StudentDTO findByName(ArrayList<StudentDTO> ar) {
			System.out.println("검색할 이름 입력");
			String name = sc.next();
			
			StudentDTO st=null;
			
			for(StudentDTO studentDTO:ar) {
				if(name.equals(studentDTO.getName())) {
					st = studentDTO;
					break;
				}
			}
			
			return st;
		}
		
}
