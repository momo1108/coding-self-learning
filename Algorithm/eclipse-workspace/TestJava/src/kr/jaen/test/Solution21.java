package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution21 {
	static long Answer;
	static int N, S;
	public static void hop(int[] arr, int[][] lake, int index) {
		// [x][y] ��ġ�� count + ���ش�.
		// [x][y] ��ġ count�� 2���� Ȯ�� - 2�� ��� ��� �� ����, �ƴ� ��� ����
		// ���� ���⿡ ���� x + 3, x + 5, x + 6, y + 3, y + 5, y + 6 ���� ���� �� return;
		// ��ġ�� N���� ũ�ų� ���� ��� return;
		lake[arr[0]][arr[1]]++;
		// System.out.printf("x : %d, y : %d, lake : %d\n",arr[0],arr[1],lake[arr[0]][arr[1]]);
		if(lake[arr[0]][arr[1]]==2) {
			Answer = index+1;
			return;
		}
		if(arr[2]==1) {
			if(arr[0]+3<N) {
				lake[arr[0]+3][arr[1]]++;
				if(lake[arr[0]+3][arr[1]]==2) {
					Answer = index+1;
					return;
				} 
			}
			if(arr[0]+5<N) {
				lake[arr[0]+5][arr[1]]++;
				if(lake[arr[0]+5][arr[1]]==2) {
					Answer = index+1;
					return;
				}
			}
			if(arr[0]+6<N) {
				lake[arr[0]+6][arr[1]]++;
				if(lake[arr[0]+6][arr[1]]==2) {
					Answer = index+1;
					return;
				}
			}
		} else {
			if(arr[1]+3<N) {
				lake[arr[0]][arr[1]+3]++;
				if(lake[arr[0]][arr[1]+3]==2) {
					Answer = index+1;
					return;
				} 
			}
			if(arr[1]+5<N) {
				lake[arr[0]][arr[1]+5]++;
				if(lake[arr[0]][arr[1]+5]==2) {
					Answer = index+1;
					return;
				} 
			}
			if(arr[1]+6<N) {
				lake[arr[0]][arr[1]+6]++;
				if(lake[arr[0]][arr[1]+6]==2) {
					Answer = index+1;
					return;
				}
			}
		}
		return;
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("Solution21.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();//�׽�Ʈ ���̽� ��  
		for(int test_case=1; test_case<=T; test_case++){
			Answer=-1;
			N=sc.nextInt(); //�迭�� ũ�� NxN
			int[][] lake=new int[N][N];
			
			S=sc.nextInt();//�ұ�����(Strider)��
			int[][] strider=new int[S][3];
			for(int k=0; k<S; k++){
				strider[k][0]=sc.nextInt();//����ġ
				strider[k][1]=sc.nextInt();//����ġ
				strider[k][2]=sc.nextInt();//����(1:��,2:��)
			}
			//////////////////////////////
			//( �� �κп� �˰����� ������ �Ѵ�. )//
			//////////////////////////////
			int index = 0;
			for(int[] arr : strider) {
				hop(arr, lake, index);
				if(Answer!=-1) break;
				index++;
			}
			if(Answer==-1) Answer=0;
			
			System.out.println("#"+test_case+" "+Answer);
		}
	}
}