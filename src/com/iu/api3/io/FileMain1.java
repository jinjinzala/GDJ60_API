package src.com.iu.api3.io;

import java.io.File;

public class FileMain1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
    // 1. file클래스
	// hdd에 파일과 폴더의 정보를 담을려고하는 클래스
	File file = new File("C:\\fileTest\\ex3\\t1");

	System.out.println(file.isDirectory());
	System.out.println(file.isFile());
	System.out.println(file.length());
	System.out.println(file.exists());
	
	if(!file.exists()) {
		file.mkdirs();
	}
	String [] files = file.list();
	for(String name:files) {
		System.out.println(name);
		//절대 경로 
		File f = new File(file,name);
		System.out.println(f.isDirectory());
		
	}
	
	File [] fs = file.listFiles();
	
	// file.delete();
	
	
	}

}
