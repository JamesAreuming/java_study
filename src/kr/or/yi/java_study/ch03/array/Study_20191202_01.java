package kr.or.yi.java_study.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class Study_20191202_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random(1234567); //7
		
		int[] arr = new int[6]; //0~5
		System.out.println(Arrays.toString(arr)); // 배열을 문자열로 찍어주기 : [0, 0, 0, 0, 0, 0]
		
		inint_lotto(rnd, arr); // 로또번호 생성
		
		//간단한 배열 출력
		System.out.println(Arrays.toString(arr)); // [15, 43, 36, 33, 17, 27]
		
		bubble_sort(arr); // 버블소트
		
		System.out.println(Arrays.toString(arr)); // 15, 17, 27, 33, 36, 43
		
		int searchKey = 36;
		int findIdx = findSearch(arr, searchKey);
		System.out.printf("%s 배열에서 %d 의 위치는 %d 입니다. %n",Arrays.toString(arr),searchKey,findIdx);
		
		findIdx = binarySearch(arr,searchKey);
		System.out.printf("%s 배열에서 %d 의 위치는 %d 입니다. %n",Arrays.toString(arr),searchKey,findIdx);
	}

	private static int binarySearch(int[] arr, int searchKey) {
		int left = 0;
		int right = arr.length-1; // 6
		int mid;                  //mid를 선언, mid = (left+right)/2;  // 2
		
		//System.out.println(mid);
		
		for(int i=0;i<arr.length;i++) {  // 0<6
			mid = (left+right)/2;        //mid 계속 변해야 하므로
			
			if(arr[mid]==searchKey) {
				return mid;
			}else if(arr[mid]<searchKey) {
				left = mid+1;
			}else {
				right = mid-1;
			}
			
			System.out.printf("%d %d %d %n",left, right, mid);
			
//			if(arr[mid]==searchKey) {
//				return mid;
//			}
//			if(arr[mid]<searchKey) {
//				left = mid+1;
//			}
//			if(arr[mid]>searchKey) {
//				right = mid-1;
//			}
			
			

//			if(arr[mid]<searchKey) {   //  arr[2] = 27 < 36
//				left = mid+1;          //  2+1 = 3
//			}else if(arr[mid]>searchKey) {
//				right = mid-1;
//			}
//			else if(arr[mid]==searchKey) {
//				return mid;
//			}
		}
		return -1;
	}

	private static int findSearch(int[] arr, int searchKey) { // 선형탐색(선형검색)   ----> 이분검색(반을 나누어 검색 / 전제조건:배열이 정렬)
		//arr배열에서 searchKey가 존재하면 존재하는 위치(index) 리턴, 만약 존재하지 않을 경우 -1을 리턴
		  int findIdx = -1;
		  for(int i=0;i<arr.length;i++) {
			  if(searchKey==arr[i]) { // 36 = arr[4]
				  return i;    //
			  }
		  }
		 
		return -1;
	}

	private static void bubble_sort(int[] arr) {
		int b;
		for(int j=0;j<arr.length-1;j++) {  // 5번반복 : 0<5  0,1,2,3,4,  *arr.length-1
			for(int i=0;i<arr.length-(j+1);i++) { // 0 < 5-0-1 = 4 / 1 < 5-1-1 = 3    *arr.length-1  *arr.length-j-1  // 2<5-2-1 = 2/ 5-3-1 = 1/ 5-4-1 = 0
 				if(arr[i]>arr[i+1]) {  // arr[0]>arr[0+1] : 15>43 / arr[1]>arr[1+1] 43>36
					b=arr[i];               // b = 43[1]
					arr[i] = arr[i+1];      // arr[1] = arr[2]
					arr[i+1] = b;           //arr[2] =43

				}
			}
			System.out.println((j+1) + "회 >>>"+Arrays.toString(arr));
		}
	}

	private static void inint_lotto(Random rnd, int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=rnd.nextInt(46)+1;
		}
	}

	private static void generate_number() {
		Random rnd = new Random(); // Random함수 ctrl+shift+o
		
		rnd.setSeed(1234); // 동일한 값
		for(int i=0;i<6;i++) {
			System.out.print(rnd.nextInt(45)+1+" "); //  0<= rnd.nextInt(45)<45    / 46넣으면 : 0~45까지 생성
		}
	}

}
