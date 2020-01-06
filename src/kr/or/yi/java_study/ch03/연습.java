package kr.or.yi.java_study.ch03;

import java.util.Arrays;

public class 연습 {

	public static void main(String[] args) {
		int [] i = new int[10];
		System.out.println(Arrays.toString(i));
		int [] a = {2,2,2,2,2,2,2,2,2,2};
		System.out.println(Arrays.toString(a));
		
		int sum = 0;
		for(int n = 0;n<10;n++) {
			sum = sum + a[n];
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int n =1;n<11;n++) {
			sum2 = sum2+n;
		}
		System.out.println(sum2);
		
		int [] t;
		
		t = new int [5];
		System.out.println(Arrays.toString(t));
		
		int [] c = {1,2,3};
		System.out.println(Arrays.toString(c));
	}

}
