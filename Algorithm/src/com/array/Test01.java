package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int x : t.solution(n,arr)) {
			System.out.print(x + " ");			
		}
		
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i=1; i<n; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		
		return answer;
	}
}
