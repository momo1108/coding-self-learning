package kr.bang.stepup;

import java.util.Scanner;

public class Ricecake {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int day = s.nextInt();
		int after = s.nextInt();
		int count;
		int before, temp;
		boolean correct;
		
		for(int i=(after/2)+1; i<after; i++) {
			int aftercopy = after;
			correct = true;
			count = 2;
			before = i;
			// System.out.printf("day : %d   after : %d, before : %d   count : %d\n",day,aftercopy,before,count);
			// System.out.print(correct);
			while(correct) {
				if(count==day) {
					System.out.println(before);
					System.out.println(aftercopy);
					break;
				}
				temp = aftercopy - before;
				aftercopy = before;
				before = temp;
				if(before>=aftercopy) {
					correct = false;
				} else count++;
			}
			// System.out.println(" to "+correct);
			if(correct) break;
		}
	}
}
