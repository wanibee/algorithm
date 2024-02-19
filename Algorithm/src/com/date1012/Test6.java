package com.date1012;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		System.out.println(t.Solution(str));
	}

	private String Solution(String str) {
		String answer = "YES";
		str=str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp=new StringBuilder(str).reverse().toString();
		if(!str.equals(tmp))return "No";
				
		
		return answer;
	}

}
