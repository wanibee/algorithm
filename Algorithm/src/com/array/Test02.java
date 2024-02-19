package com.array;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		Test02 T = new Test02();
		
		Scanner s = new Scanner(System.in);
		//8
		//130 135 148 140 145 150 150 153
		int n=s.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.print(T.solution(n, arr));
		
	}
	
	public int solution(int n, int[] arr) {
		int answer=1, max=arr[0];
		for(int i=1; i<n;i++) {
			if(arr[i]>max) {
				answer++;
				max=arr[i];
			}
		}
		return answer;
	}

}
