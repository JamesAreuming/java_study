package kr.or.yi.java_study.ch03.array;

import java.util.Arrays;

public class Study_20191203_02 {

	public static void main(String[] args) {
		/*
		 * void_method(5);
		 * 
		 * int res = return_method(3,5);
		 * 
		 * System.out.println("res ="+res);
		 * 
		 * makeIntArray(5); //정수형배열
		 */		
		
		int a = 5;
		int b = 3;
		System.out.printf("변경 전 a= %d, b= %d %n",a,b); // a= 5, b= 3 
		swap(a,b);
		System.out.printf("변경 후 a= %d, b= %d %n",a,b); // a= 5, b= 3  
		
		int [] arr = {5,3};
		System.out.printf("변경 전 arr[0]= %d, arr[1]= %d %n",arr[0],arr[1]); // arr[0]= 5, arr[1]= 3
		swap(arr);
		System.out.printf("변경 후 arr[0]= %d, arr[1]= %d %n",arr[0],arr[1]); // arr[0]= 3, arr[1]= 5 heap영역에서 참조하기 때문에
	}

	private static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1]=temp;
	}

	private static void swap(int a, int b) { // int a, int b : 동명이인
		int temp = a;
		a=b;
		b=temp;
		System.out.printf("swap a= %d, b= %d %n",a,b); // swap a= 3, b= 5
	}

	private static void makeIntArray(int size) {
		int[] temp = new int[size];
		System.out.println(Arrays.toString(temp));
	}

	public static void void_method(int size) {
		System.out.println("size ="+size);
		return;
	}
	
	public static int return_method(int a,int b) {
		int c = a+b;
		return c;
	}
}
