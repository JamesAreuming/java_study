package kr.or.yi.java_study.ch03.array;

import java.util.Arrays;

public class Study_20191203_01 {

	public static void main(String[] args) {
		int [][] intArray = new int[4][]; 
		
		create_array(intArray); // 배열 생성
		
		init_array(intArray); // 배열 값 초기화
		
		prn_array(intArray); // 배열 출력
		
	} // 메인


	private static void create_array(int[][] intArray) { // intArray : 서로 공간이 다른 변수
		System.out.println(Arrays.deepToString(intArray)); //[null, null, null, null]  / *2차원 배열 찍을때는  Arrays.deepToString
		
		intArray[0] = new int[3]; // 0 1 2
		System.out.println(Arrays.deepToString(intArray)); //[[0, 0, 0], null, null, null]
		intArray[1] = new int[2]; // 0 1
		System.out.println(Arrays.deepToString(intArray)); 	//	[[0, 0, 0], [0, 0], null, null]
		intArray[2] = new int[3]; // 0 1 2
		System.out.println(Arrays.deepToString(intArray)); // [[0, 0, 0], [0, 0], [0, 0, 0], null]
		intArray[3] = new int[2]; // 0 1
		System.out.println(Arrays.deepToString(intArray)); // [[0, 0, 0], [0, 0], [0, 0, 0], [0, 0]]
	}
	
	private static void init_array(int[][] intArray) {  // 배열 값 초기화
		for(int i=0;i<intArray.length;i++) {   // intArray.length : 4
			for(int j=0;j<intArray[i].length;j++) {
				intArray[i][j]=(i+1)*10+j; // 값을 초기화(입력)
			} // 서브 for
		} // 외부 for
	}
	
	private static void prn_array(int[][] intArray) {
		for(int i=0;i<intArray.length;i++) { //출력
			for(int j=0;j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+" ");  //출력하면서 사이값 띄어주기
			}
			System.out.println();
		}
	}

} // 클래스
