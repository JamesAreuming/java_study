package kr.or.yi.java_study.ch03.array;

public class 과제_WhileTest {

	public static void main(String[] args) {
		
		/* (1) 0~100까지 짝수 더하기 / 2450
		 * 
		 */
		int sum = 0;
		int i = 0;
		while(i<100) {
			sum = sum + i;
			i=i+2;
		}
		System.out.println(sum);
		
		for문();
		do_while문();
	}
	
	private static void for문() {
		int sum = 0;
		for(int i=0;i<100; ) { //for(int i=0;i<100;i=i+2)
			sum = sum + i;
			i = i + 2;
		}
		System.out.println(sum);
	}

	private static void do_while문() {
		int sum = 0;
		int i = 0;
		do {
			sum = sum + i;
			i = i+2;
		}while(i<100);
		
		System.out.println(sum);
	}



}
