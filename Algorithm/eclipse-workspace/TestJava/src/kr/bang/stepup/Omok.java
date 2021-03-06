package kr.bang.stepup;

import java.util.Scanner;

public class Omok {
	static int count1, count2, count3, count4, X, Y;
	public static void recursion1(int x, int y, int[][] pan) {
		X = x;
		Y = y;
		if(pan[x-1][y]==pan[x][y]) {
			count1++;
			recursion1(x-1, y, pan);
		} else {
			return;
		}
	}
	public static void recursion2(int x, int y, int[][] pan) {
		if(pan[x-1][y+1]==pan[x][y]) {
			count2++;
			recursion2(x-1, y+1, pan);
		} else {
			return;
		}
	}
	public static void recursion3(int x, int y, int[][] pan) {
		if(pan[x][y+1]==pan[x][y]) {
			count3++;
			recursion3(x, y+1, pan);
		} else {
			return;
		}
	}
	public static void recursion4(int x, int y, int[][] pan) {
		if(pan[x+1][y+1]==pan[x][y]) {
			count4++;
			recursion4(x+1, y+1, pan);
		} else {
			return;
		}
	}
	public static void recursion5(int x, int y, int[][] pan) {
		if(pan[x+1][y]==pan[x][y]) {
			count1++;
			recursion5(x+1, y, pan);
		} else {
			return;
		}
	}
	public static void recursion6(int x, int y, int[][] pan) {
		X = x;
		Y = y;
		if(pan[x+1][y-1]==pan[x][y]) {
			count2++;
			recursion6(x+1, y-1, pan);
		} else {
			return;
		}
	}
	public static void recursion7(int x, int y, int[][] pan) {
		X = x;
		Y = y;
		if(pan[x][y-1]==pan[x][y]) {
			count3++;
			recursion7(x, y-1, pan);
		} else {
			return;
		}
	}
	public static void recursion8(int x, int y, int[][] pan) {
		X = x;
		Y = y;
		if(pan[x-1][y-1]==pan[x][y]) {
			count4++;
			recursion8(x-1, y-1, pan);
		} else {
			return;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] pan = new int[21][21];
		for(int i=1; i<20; i++) {
			for(int j=1; j<20; j++) {
				pan[i][j] = s.nextInt();
			}
		}
		// 체크방향 팔방, 1은 위쪽 ~ 8은 왼쪽(시계방향)
		for(int i=1; i<20; i++) {
			for(int j=1; j<20; j++) {
				count1 = 1;
				count2 = 1;
				count3 = 1;
				count4 = 1;
				if(pan[i][j]!=0) {
					recursion1(i, j, pan);
					recursion2(i, j, pan);
					recursion3(i, j, pan);
					recursion4(i, j, pan);
					recursion5(i, j, pan);
					recursion6(i, j, pan);
					recursion7(i, j, pan);
					recursion8(i, j, pan);
					// System.out.printf("%d %d %d %d\n",count1,count2,count3,count4);
					if(count1==5) {
						recursion1(i, j, pan);
						count1=5;
						System.out.println(pan[i][j]);
						System.out.printf("%d %d",X,Y);
						break;
					}else if(count2==5) {
						recursion6(i, j, pan);
						count2=5;
						System.out.println(pan[i][j]);
						System.out.printf("%d %d",X,Y);
						break;
					}else if(count3==5) {
						recursion7(i, j, pan);
						count3=5;
						System.out.println(pan[i][j]);
						System.out.printf("%d %d",X,Y);
						break;
					}else if(count4==5) {
						recursion8(i, j, pan);
						count4=5;
						System.out.println(pan[i][j]);
						System.out.printf("%d %d",X,Y);
						break;
					}
				}
				if(i==19 && j==19) System.out.println(0);
			}
			if(count1 == 5 || count2 == 5  || count3 == 5  || count4 == 5) break;
		}
		
	}
}