package com.array;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Test11 T=new Test11();
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int[][] arr=new int[n+1][6];
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<6;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		System.out.print(T.solution(n,arr));

	}
	
	public int solution(int n, int[][] arr) {
		int answer=0, max=Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {
			int cnt=0;
			for(int j=1;j<=n;j++) {
				for(int k=1;k<=5;k++) {
					if(arr[i][k]==arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max=cnt;
				answer=i;
			}
		}
		
		
		return answer;
	}

}
