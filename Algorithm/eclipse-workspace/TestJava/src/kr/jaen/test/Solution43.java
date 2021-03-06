package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution43 {
	static int N, Si, Sj, P, D;
	static boolean out;
	static int Answer;
	public static void travel(int[] move, int[][] map) {
		System.out.printf("방향: %d, 거리: %d\n",move[0],move[1]);
		for(int i=1; i<=move[1]; i++) {
			Answer++;
			System.out.printf("현재 위치 : %d, %d\n",Si,Sj);
			switch(move[0]) {
				case 1:
					if(Si-1<1) {
						Answer--;
						out = true;
						return;
					} else {
						Si--;
					}
					break;
				case 2:
					if(Si-1<1 || Sj+1>N) {
						Answer--;
						out = true;
						return;
					} else {
						Si--;
						Sj++;
					}
					break;
				case 3:
					if(Sj+1>N) {
						Answer--;
						out = true;
						return;
					} else {
						Sj++;
					}
					break;
				case 4:
					if(Si+1>N || Sj+1>N) {
						Answer--;
						out = true;
						return;
					} else {
						Si++;
						Sj++;
					}
					break;
				case 5:
					if(Si+1>N) {
						Answer--;
						out = true;
						return;
					} else {
						Si++;
					}
					break;
				case 6:
					if(Si+1>N || Sj-1<1) {
						Answer--;
						out = true;
						return;
					} else {
						Si++;
						Sj--;
					}
					break;
				case 7:
					if(Sj-1<1) {
						Answer--;
						out = true;
						return;
					} else {
						Sj--;
					}
					break;
				case 8:
					if(Si-1<1 || Sj-1<1) {
						Answer--;
						out = true;
						return;
					} else {
						Si--;
						Sj--;
					}
					break;
			}
		}
		System.out.printf("Answer: %d\n",Answer);
		return;
	}
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Solution43.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			Si = sc.nextInt(); //출발점의 i좌표
			Sj = sc.nextInt(); //출발점의 j좌표
			P = sc.nextInt();
			int[][] map = new int[N+1][N+1];
			
//			int Pi[] = new int[P];  // 함정의 i좌표의 모음
//			int Pj[] = new int[P];  // 함정의 j좌표의 모음
			int[][] trap = new int[P][2];
			
			for(int[] a : trap) {
				a[0] = sc.nextInt();
				a[1] = sc.nextInt();
				map[a[0]][a[1]]++;
			}
			
			D = sc.nextInt();
//			int Dd[] = new int[D];  // 방향 모음
//			int Da[] = new int[D];  // 이동 칸수 모음
			int[][] move = new int[D][2];
			for(int[] a : move) {
				a[0] = sc.nextInt();
				a[1] = sc.nextInt();
			}
			//////////////////////////////
			//( 이 부분에 알고리즘 구현을 한다. )//
			//////////////////////////////
			Answer = 0;
			out = false;
			for(int[] a : move) {
				travel(a, map);
				// System.out.println(out);
				if(out) break;
			}
			
			
			System.out.println("#"+test_case+" "+Answer);
		}
	}
}