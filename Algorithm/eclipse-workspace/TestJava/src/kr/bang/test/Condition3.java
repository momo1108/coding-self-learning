package kr.bang.test;

import java.util.Scanner;

public class Condition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner s = new Scanner(System.in);
		age = s.nextInt();
		if(age>=20) System.out.println("adult");
		else System.out.println(20-age+" years later");
	}

}
