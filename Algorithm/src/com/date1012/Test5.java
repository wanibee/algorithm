package com.date1012;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		System.out.println(t.Solution(str));
		System.out.println(t.Solution2(str));
	}


	private String Solution(String str) {
		String answer="YES";
		str = str.toUpperCase();
		int len=str.length();
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1))return "NO";
		}
		
		return answer;
	}

	private String Solution2(String str) {
		String answer = "YES";
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(!str.equalsIgnoreCase(tmp)) return "NO";
		
		return answer;
	}
	
}
