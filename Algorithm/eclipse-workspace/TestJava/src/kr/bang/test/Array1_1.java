package kr.bang.test;

import java.util.Scanner;

public class Array1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char[] arr = new char[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.next().charAt(0);
			System.out.print(arr[i]);
		}
	}

}
