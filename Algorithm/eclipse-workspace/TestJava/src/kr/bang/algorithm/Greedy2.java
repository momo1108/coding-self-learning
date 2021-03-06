package kr.bang.algorithm;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Greedy2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Greedy2.txt"));
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[][] conference = new int[N][3];
		for(int i=0; i<N; i++) {
			conference[i][0] = s.nextInt();
			conference[i][1] = s.nextInt();
			conference[i][2] = s.nextInt();
		}
		Arrays.sort(conference, new Comparator<int[]>() {
            // Override된 compare 함수를 어떻게 정의하냐에 따라서 다양한 정렬이 가능해집니다
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
		int[] index = new int[500];
		int number = 1;
		int endtime = conference[0][2];
		index[0] = conference[0][0];
		for(int i=1; i<N; i++) {
			if(conference[i][1]>=endtime) {
				index[number] = conference[i][0];
				endtime = conference[i][2];
				number++;
			}
		}
		System.out.println(number);
		for(int e : index) {
			if(e==0) break;
			System.out.print(e+" ");
		}
	}

}
