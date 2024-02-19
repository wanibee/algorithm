package com.date1012;

import java.util.Scanner;

public class Test4 {
	
	public String solution(String str) {
		char[] c = str.toCharArray();
		int lt=0, rt=str.length()-1;
		String answer = str;
		while(lt<rt) {
			for(int i = lt+1; i < rt; i++) {
				
			}
			
		}
		
		return null;
	}

	public static void main(String[] args) {
		Test4 t = new Test4();
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(t.solution(str));
		
	}

}
