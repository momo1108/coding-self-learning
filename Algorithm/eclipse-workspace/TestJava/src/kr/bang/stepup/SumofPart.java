package kr.bang.stepup;

import java.util.Scanner;

public class SumofPart {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr = new int[N];
		int sum, answer;
		answer = -101;
		for(int i=0; i<N; i++) {
			arr[i] = s.nextInt();
		}
		for(int e : arr) {
			if(e > answer) answer = e;
		}
		for(int i=1; i<N; i++) {
			for(int j=0; j<=N; j++) {
				if(j+i>=N) break;
				else {
					sum = 0;
					for(int k=j; k<=j+i; k++) {
						sum += arr[k]; 
					}
					if(sum > answer) answer = sum;
				}
			}
		}
		System.out.println(answer);
	}
}
