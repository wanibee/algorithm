package com.date1012;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Test9 t = new Test9();
		// KKHSSSSSSSE
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(t.Solution(str));
		
		

	}

	
	public String Solution2(String str) {
		String answer = "";
		str=str+" ";
		int cnt=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i+1)) cnt++;
			else {
				answer+=str.charAt(i);
				if(cnt>1) answer+=String.valueOf(cnt);
				cnt=1;
			}
		}
		return answer;
	}
	
	
	
	public String Solution(String str) {
		String answer = "";
		int p = 1;
		for(int i=0; i < str.length();i++) {
			if(i!=0) {
				if(str.charAt(i)==str.charAt(i-1)) {
					p++;
				}else {
					if(p!=1) {
						answer+=p;						
					}
					p=1;
					answer+=str.charAt(i);
				}
			}else {				
				answer+=str.charAt(i);
			}
		}
		return answer;
	}
	
	
}
