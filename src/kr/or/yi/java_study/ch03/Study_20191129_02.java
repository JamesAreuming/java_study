package kr.or.yi.java_study.ch03;

public class Study_20191129_02 {

	public static void main(String[] args) {
		int [] array1 = new int[4];
		array1[0] =10;
		
		int n = array1[0];
		
		System.out.println(n);
		
		int [] array2 = {1,2,3,4,5};
		
		int a = array2[0];
		System.out.println(a);
		
		int [] array3 = array2;
		
		int b = array3[3];
		System.out.println(b);
	}

}
