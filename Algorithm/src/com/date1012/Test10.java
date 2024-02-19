package com.date1012;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test10 t = new Test10();
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		String str = s.next();
		
		System.out.println(t.Solution(n, str));
	}
	
	public String Solution(int n,String str) {
		String answer = "";
		for(int i=0;i < n; i++) {
			String tmp=str.substring(0,7).replace('#', '1').replace('*', '0');
			int num =Integer.parseInt(tmp, 2);
			System.out.println(tmp+' '+ num);
			answer+=(char)num;
			str=str.substring(7);
		}
		
		return null;
	}

}
