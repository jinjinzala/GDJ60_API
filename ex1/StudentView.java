package ex1;

public class StudentView {
	
	
	public void view(Srting msg) {
		System.out.println();
	}
	
	public void view(ArrayList<StudentDTO> ar) {
		for(StudentDTO studentDTO :ar) {
			this.view(studentDTO);
		}
		
	}
	
	public void view(StudentDTO studentDTO) {
		
		System.out.println("Name :"+studentDTO.getName());
		System.out.println("Num :"+studentDTO.getNum());
		System.out.println("Num :"+studentDTO.getKor());
		System.out.println("Num :"+studentDTO.getEng());
		System.out.println("Num :"+studentDTO.getMath());
		System.out.println("Num :"+studentDTO.getTotal());
		System.out.println("Num :"+studentDTO.getAvg());
	} 
	
}
