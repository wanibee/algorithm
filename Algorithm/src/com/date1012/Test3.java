package com.date1012;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
	public String solution(String str){
		ArrayList<String> answer = new ArrayList<String>();
			char[] s = str.toCharArray();
			int lt = 0;
			int rt = str.length() - 1;
			while(lt < rt) {
				if(!Character.isAlphabetic(s[lt])) {
					lt++;
				} else if(!Character.isAlphabetic(s[rt])) {
					rt--;
				}else {
					char temp=s[lt];
					s[lt]=s[rt];
					s[rt]=temp;
					lt++;
					rt--;
				}
			}
			String tmp=String.valueOf(s);
		return tmp;
	}
	
	public static void main(String[] args) {
		// 입력 예시 a#b!GE*T@S
		Test3 T = new Test3();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
