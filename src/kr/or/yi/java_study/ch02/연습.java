package kr.or.yi.java_study.ch02;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		/*
		 * int total = 0; int i = 1;
		 * 
		 * while(i<=100) { total = total + i; // 0+1 , 1+2, i++;
		 * 
		 * } System.out.println(total); // 1~100까지 합 : 5050
		 * 
		 * 
		 * int age = 30;
		 * 
		 * while(age == 30) {
		 * 
		 * System.out.println("이상원씨의 나이는"+age+"입니다."); }
		 * 
		 * 
		 * int a = 1;
		 * 
		 * do { System.out.println("음 프로그래머 다 됬네"); }while(a<100);
		 */
		
		/*
		 * int a = -5; // -5 int b = +a; // -5 int c = -a; // 5
		 * 
		 * System.out.println(a); System.out.println(b); System.out.println(c);
		 * 
		 * int d = ++c; // 6 System.out.println(d);
		 * 
		 * int e = c++; System.out.println(e);
		 */
		int firstNum = 0;
		int secondNum = 1;
		long resultValue;

			//n값을 입력 받아 해당 번째의 피보나치 수열 값을 구하는 메서드
			//단, 재귀함수를 써보자.
			//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
			
			Scanner input = new Scanner(System.in);
			System.out.println("몇 번째까지 결과를 출력 할래? : ");
			int number = input.nextInt();
			for (int i = 1; i<=number; i++){
			System.out.println("\n====================");
			System.out.println( i +" 번째 : " + pibo(i) );
			System.out.println("====================\n");
			}
			input = null;
		}
		
		public static  long pibo(int N){

			if(N == 1 || N == 2){
				return 1;
			}else{
				System.out.println(N + " : 재귀 호출로 인한 N값의 변화");
				return pibo(N-1) + pibo(N-2);
			}
		}
		
		
		Scanner sc = new Scanner(System.in);
		//coffeeSangwon(sc);

	

	private static void coffeeSangwon(Scanner sc) {
		/*
		 * 에스프레소,카푸치노,카페라떼 3500 / 아메리카노 2000 / 그외 없는메뉴
		 */
		
		System.out.print("메뉴를 골라주세요");
		String order=sc.next();
		
		
		
	}

}
