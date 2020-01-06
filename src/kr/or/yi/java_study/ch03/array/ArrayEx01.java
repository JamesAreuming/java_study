package kr.or.yi.java_study.ch03.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		//array01();
		
		//array02();
		
		//array03();
		
		Scanner sc = new Scanner(System.in);
		
		array04(sc);
		sc.close();
		


		
	}

	private static void array04(Scanner sc) {
		int intArray[] = new int[5]; // 배열주소 : 0 1 2 3 4
		
		int max=Integer.MIN_VALUE; // 가장 큰수
		int min=Integer.MAX_VALUE;
		System.out.printf("정수형(int)범위%d ~%d %n",Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		System.out.print("양수 5개를 입력하세요 >>> ");  // 1 39 78 100 99
		for(int i=0;i<5;i++) {    // 0 1 2 3 4
			intArray[i] = sc.nextInt(); 
			
			if(intArray[i]>max) {   
				max = intArray[i];
			}
			if(intArray[i]<min) {   
				min = intArray[i];
			}
		}
		System.out.printf("가장 큰 수는 %d 입니다 %n",max);
		System.out.printf("가장 작은 수는 %d 입니다 %n",min);
		

		//intArray에 searchKey가 존재하면 위치하고 있는 인덱스를 출력하고 찾지 못하면 -1을 출력하도록 작성
		
		// intArray[]
		
		//  ex) intArray[]={1 39 78 100 99}
		//  intArray[0] = 1;
		//  1을 입력 -> 0이 출력되어야함
		//  그외 다른 수를 입력시 -1이 출력
		
		System.out.println("찾고자하는 정수 값을 입력하세요 >>>");
		int searchKey = sc.nextInt();
		
		
//		for(int i=0;i<intArray.length;i++) {
//			if(searchKey==intArray[i]) {
//				System.out.println(i);
//			}else if(i==4){
//				System.out.println(-1);
//			}
//		}
		
		int findIndex = -1;
		for(int i=0;i<intArray.length;i++) {
			if(searchKey==intArray[i]) {
			findIndex =i;
			break;
		}
		}
		System.out.printf("%d %d",searchKey,findIndex);
		

//		System.out.println(i);
		

	}

	private static void array03() {
		char[] chArr = new char[26];
		
		char ch = 'a';
		for(int i=0;i<chArr.length;i++) {
//			System.out.printf("%c",chArr[i]);
			chArr[i] = ch++; 
		}
		System.out.println();
		
		for(int i=0;i<chArr.length;i++) {
			System.out.printf("%c",chArr[i]);
		}
	}

	private static void array02() {
		//선언과 동시에 초기화
		
		int[] intArray = {5,4,3,2,1};
		
		for(int i=0;i<intArray.length;i++) {
			System.out.printf("%d",intArray[i]);
		}
		System.out.println();
		
		intArray[2] =10;
		//System.out.println(Arrays.toString(intArray));
		int[] myArray = intArray;
		for(int i=1;i<myArray.length;i++) {
			System.out.printf("%d",myArray[i]);
		}
	}

	private static void array01() {
		int[] intArray01 = null; // 정수형 배열 배열명이 intArray01 선언
		
		System.out.println(intArray01); // 지역변수는 초기화해야함
		
		intArray01 = new int[5];
		System.out.println(intArray01); //[I@15db9742 : 주소값
		
		System.out.println(intArray01[0]); //0
		System.out.println(intArray01[1]); //0
		System.out.println(intArray01[2]); //0
		System.out.println(intArray01[3]); //0
		System.out.println(intArray01[4]); //0
		System.out.println("배열의 크기"+intArray01.length); // 배열의 크기 5
		
		
		for(int i=0;i<5;i++) {
			System.out.printf("%d", intArray01[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<intArray01.length;i++) {
			System.out.printf("%d", intArray01[i]);
		}
	}

}
