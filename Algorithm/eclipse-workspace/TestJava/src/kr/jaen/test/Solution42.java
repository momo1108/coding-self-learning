package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution42 {
	static int N, Si, Sj, P, D;
	static int Ai, Aj;
	public static void path(int[] a, int[][] maze) {
		//System.out.printf("before : [%d,%d]\n",Ai,Aj);
		switch(a[0]) {
			case 1:
				if(Ai-a[1]<1) {
					Ai = 0;
					Aj = 0;
				} else {
					for(int i=1; i<=a[1]; i++) {
						if(maze[Ai-i][Aj]>0) {
							Ai = 0;
							Aj = 0;
							return;
						}
					}
					Ai -= a[1];
				}
				break;
			case 2:
				if(Aj+a[1]>N) {
					Ai = 0;
					Aj = 0;
				} else {
					for(int i=1; i<=a[1]; i++) {
						if(maze[Ai][Aj+i]>0) {
							Ai = 0;
							Aj = 0;
							return;
						}
					}
					Aj += a[1];
				}
				break;
			case 3:
				if(Ai+a[1]>N) {
					Ai = 0;
					Aj = 0;
				} else {
					for(int i=1; i<=a[1]; i++) {
						if(maze[Ai+i][Aj]>0) {
							Ai = 0;
							Aj = 0;
							return;
						}
					}
					Ai += a[1];
				}
				break;
			case 4:
				if(Aj-a[1]<1) {
					Ai = 0;
					Aj = 0;
				} else {
					for(int i=1; i<=a[1]; i++) {
						if(maze[Ai][Aj-i]>0) {
							Ai = 0;
							Aj = 0;
							return;
						}
					}
					Aj -= a[1];
				}
				break;
		}
		//System.out.printf("after : [%d,%d]\n",Ai,Aj);
		return;
	}
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Solution42.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			Si = sc.nextInt(); //출발점의 i좌표
			Sj = sc.nextInt(); //출발점의 j좌표
			P = sc.nextInt();
			int[][] maze = new int[N+1][N+1];
			
//			int Pi[] = new int[P];  // 함정의 i좌표의 모음
//			int Pj[] = new int[P];  // 함정의 j좌표의 모음
			int[][] trap = new int[P][2];
			
			for(int[] a : trap) {
				a[0] = sc.nextInt();
				a[1] = sc.nextInt();
				maze[a[0]][a[1]]++;
			}
			
			D = sc.nextInt();
			
			int[][] move = new int[D][2];
//			int Dd[] = new int[D];  // 방향 모음
//			int Da[] = new int[D];  // 이동 칸수 모음
			
			//////////////////////////////
			//( 이 부분에 알고리즘 구현을 한다. )//
			//////////////////////////////
			Ai = Si;
			Aj = Sj;
			for(int[] a : move) {
				a[0] = sc.nextInt();
				a[1] = sc.nextInt();
				path(a, maze);
				if(Ai==0) break;
			}
			
			System.out.println("#"+test_case+" "+Ai+" "+Aj);
		}
	}
}
























