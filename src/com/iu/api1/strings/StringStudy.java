package com.iu.api1.strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
 // 대소문자 구분없이 출력하는 구문 CASE_INSENSITIVE_ORDER
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abc");
		String str2 = "kabcsfsdfdskfsfa";
		
		System.out.println(str==str2);
		
		boolean check = str.equals(str2);
		System.out.println(check);
		
		char ch = str2.charAt(0);
		System.out.println("Char : "+ch);
		Scanner sc = new Scanner(System.in);
		//ch = sc.next().charAt(0);
		
		int num = str2.indexOf('k', 3);
		System.out.println("Num : "+num);

	}

}
