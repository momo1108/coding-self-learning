package kr.bang.stepup;

import java.util.Scanner;

public class Melon {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int answer;
		int[] distance = new int[6];
		for(int i=0; i<6; i++) {
			s.nextInt();
			distance[i] = s.nextInt();
		}
		for(int i=0; i<6; i++) {
			if(distance[i]==distance[(i+2)%6]+distance[(i+4)%6] && distance[(i+1)%6]==distance[(i+3)%6]+distance[(i+5)%6]) {
				System.out.println((distance[i]*distance[(i+1)%6] - distance[(i+3)%6]*distance[(i+4)%6])*N);
				break;
			}
		}
	}
}
