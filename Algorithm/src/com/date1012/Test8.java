package com.date1012;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Test8 t = new Test8();		
		//String s = "teachermpde";
		char target = 'e';
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char c = s.next().charAt(0);
		
		for(int x : t.Solution2(str,c)) {
			System.out.print(x+" ");
		}
		
		System.out.println();

	}

	public String Solution(String s, char target) {
		int tIndex = s.indexOf(target);
		String answer = "";
		for(int i=0;i<s.length();i++) {
			s.charAt(i);
			answer +=s.indexOf(s.charAt(i)) - tIndex;
		}
		
		
		return answer;
	}

	public int[] Solution2(String s, char t) {
		int[] answer = new int[s.length()];
		int p=1000;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==t) {
				p=0;
				answer[i]=p;
			}else {
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)==t) {
				p=0;
			}else {
				p++;				
				answer[i]=Math.min(answer[i], p);
			}
		}
		
		return answer;
	}
}
