package kr.or.yi.java_study.ch03;

public class 별찍기 {

	public static void main(String[] args) {
		//별찍기_기본();
		//별찍기01();
		//별찍기02();	
		//별찍기03();
		//별찍기04();
		별찍기05();
		//별찍기06();
		
	}

	private static void 별찍기06() {
		for(int j=1;j<6;j++) { 
			 for(int i=1;i<7-j;i++){ // i에 올수있는 숫자 : 12345, 1234, 123, 12, 1
				 System.out.print(i);
				 //System.out.print(i);
			}
			System.out.println(j);
		  }
	}

	private static void 별찍기05() {
		for(int j=1;j<5;j++) {
			for(int i=0;i<j;i++) {
				System.out.print(i);
			}
			for(int i=1;i<6-j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void 별찍기04() {
		for(int j=1;j<6;j++) {
			for(int i=1;i<7-j;i++) {
				System.out.print(i);
			}
			for(int i=0;i<j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void 별찍기03() {
		for(int j=1;j<6;j++) { 
		 for(int i=1;i<7-j;i++){ // i에 올수있는 숫자 : 12345, 1234, 123, 12, 1
			 System.out.print("*");
			 //System.out.print(i);
		}
		System.out.println();
	  }
	}

	private static void 별찍기02() {
		for(int j=2;j<7;j++) { // 5번 반복 : 2 3 4 5 6 
			 for(int i=1;i<j;i++) { // i에 올수있는 숫자 : 1, 12, 123, 1234, 12345
			  System.out.print("*");
			//System.out.print(i);
		  } 
		   System.out.println(); 
		 }
	}


	private static void 별찍기01() {
		/* 5번반복   >> 별5개찍기
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		for(int j=1;j<6;j++) { // 5번반복 : 1<6 : 반복1 / 2<6 : 반복2 / 3<6 : 반복3 / 4<6 : 반복4 / 5<6 : 반복5
			for(int i=1;i<6;i++) {  // *  >> 5번 찍기
				System.out.print("*");
				//System.out.print(i); //12345
			}
			System.out.println(); //줄바꿈
		}
	}
	
	private static void 별찍기_기본() {
		/* *  >> 5번 찍기
		 * *****
		 */
		for(int i=1;i<6;i++) {
			System.out.print("*");
			//System.out.print(i); // 12345
		}
	}

}
