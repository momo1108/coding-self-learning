package kr.bang.stepup;

import java.util.Scanner;

public class TestFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ű����κ��� ���ڸ� �Է¹޾� �׵��� ���� ���ϼ���
		Scanner s=new Scanner(System.in);
		// Ű����κ��� ������ �Է� �޴´�.
		int n=s.nextInt();
		int[] numarr=new int[n]; // n���� ������ ���� �� �ִ� �޸�(�迭 ����)�Ҵ� �ڵ����� 0���� ä���� - �Ȱ��� type�� data�� ������ ���� �� ���
		int total=0;
		for(int i=0; i<n; i++) {
			numarr[i]=s.nextInt();
		}
		for(int i=0; i<n; i++) {
			total+=numarr[i];
		}
		System.out.println(total);
		int total2=0;
		for(int numele : numarr) { // for ~ each �հ� ���ϱ�. �̰� ��ó�� �迭 ��ġ�� ���� �о���� �ͺ��� for������ ������ �о���� �ӵ��� ������.
			total2+=numele;
		}
		System.out.println(total2);
	}

}