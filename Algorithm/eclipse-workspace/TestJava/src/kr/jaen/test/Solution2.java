package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Solution2.txt"));
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int direction;
		// 0~행 길이, 0~열 길이 까지 위치따라 정렬된 구분선으로 칸을 나눠준다.
		int line = s.nextInt();
		for(int a=0; a<line*2; a++){
			direction = s.nextInt();
			
		}
	}

}
