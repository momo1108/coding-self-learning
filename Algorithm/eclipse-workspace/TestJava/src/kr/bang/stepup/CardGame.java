package kr.bang.stepup;

import java.util.Arrays;
import java.util.Scanner;

public class CardGame {
	public static void main(String[] args) {
		// '1' = 49
		Scanner s = new Scanner(System.in);
		String[] card = new String[5];
		int Answer = 0;
		int[] numarr = new int[5];
		int[] samearr = new int[5];
		for(int i=0; i<5; i++) {
			card[i] = s.nextLine();
			numarr[i] = card[i].split(" ")[1].charAt(0)-48;
		}
		Arrays.sort(card);
		Arrays.sort(numarr);
		// 색깔이 모두 같은경우와 그렇지 않은 경우로 나누자.
		Answer = numarr[4] + 100;
		for(int i=0; i<5; i++) {
			if(i==4) {
				Answer = numarr[4] + 500;
				break;
			}
			if(numarr[i]+1==numarr[i+1]) continue;
			else {
				break;
			}
		}
		if(card[0].charAt(0)==card[1].charAt(0) && card[0].charAt(0)==card[2].charAt(0) && card[0].charAt(0)==card[3].charAt(0) && card[0].charAt(0)==card[4].charAt(0)) {
			Answer = (int)card[4].charAt(2)-48;
			int i=1;
			for(; i<5; i++) {
				if(card[i-1].charAt(2)+1==card[i].charAt(2)) continue;
				else {
					Answer += 600;
					break;
				}
			}
			if(i==5) Answer += 900;
		} else {
			int same=1;
			for(int i=0; i<5; i++) {
				if(i==4) {
					if(same==1) samearr[4] = 1;
					else samearr[4] = same;
					break;
				}
				if(numarr[i]==numarr[i+1]) same++;
				else {
					samearr[i] = same;
					same = 1;
				}
			}
		}
		for(int i=0; i<5; i++) {
			if(samearr[i]==2) {
				Answer = numarr[i] + 200;
				for(int j=i+1; j<5; j++) {
					if(samearr[j]==2) {
						Answer = (numarr[j]*10) + numarr[i] + 300;
					} else if(samearr[j]==3) {
						Answer = (numarr[j]*10) + numarr[i] + 700;
					}
				}
				break;
			} else if(samearr[i]==3) {
				Answer = numarr[i] + 400;
				if(i==2 && samearr[3]==0) {
					Answer = (numarr[i]*10) + numarr[4] + 700;
				}
			} else if(samearr[i]==4) {
				Answer = numarr[i] + 800;
			}
		}
		System.out.println(Answer);
	}
}
