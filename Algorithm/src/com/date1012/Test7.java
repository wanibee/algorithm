package com.date1012;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Test7 t = new Test7();
		
		Scanner s = new Scanner(System.in);
		//tgr0a1h205er		
		System.out.println(t.Solution2(s.nextLine()));
	}

	public int Solution(String str) {
		int answer = 0;
		for(char x : str.toCharArray()) {
			if(x>=48 && x <57) answer=answer*10+(x-48);
		}
		
		return answer;
	}

	public int Solution2(String str) {
		str=str.replaceAll("[^0-9]", "");
		
		int tmp = Integer.parseInt(str);

		return tmp;
	}
}
