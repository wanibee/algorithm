package com.date1012;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<String>();
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = x.length() - 1;
			while(lt < rt) {
				char temp=s[lt];
				s[lt]=s[rt];
				s[rt]=temp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Test2 T = new Test2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
		
	}

}
