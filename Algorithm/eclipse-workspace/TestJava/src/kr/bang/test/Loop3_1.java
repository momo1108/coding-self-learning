package kr.bang.test;

import java.util.Scanner;

public class Loop3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int check;
		while(true) {
			check = i*i;
			if(check>=n) {
				System.out.println(i+" "+check);
				break;
			}
			i++;
		}
	}

}