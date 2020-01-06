package kr.or.yi.java_study.ch03.array;

import java.awt.print.PrinterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Study_20191204_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//exam01();
		exam02(sc);
		//exam03();
		
		String [] stringNumber = {"23","12","3.141592","998"};
		
		int i=0;
		
		try {
			for(i=0;i<stringNumber.length;i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("정수로 변환된 값은"+j);
			}
		}catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다");
		}
		
		
//		catch(Exception e) {
//			System.out.println("위의 예외를 제외한 나머지 예외");
//			e.printStackTrace();
//		}
		
		sc.close();
	}

	private static void exam03() {
		try {
			System.out.println(5/0);
			int [] intArr = new int[5];
			//int a  = sc.nextInt();
			int c = Integer.parseInt("a"); // 문자10
			//intArr[5]=10;
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열인덱스범위넘어남");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
		}
		catch(InputMismatchException e) {
			System.out.println("숫자만 가능");
		}
		catch(NumberFormatException e) {
			System.out.println("문자화된 숫자만 가능하다");
		}
	}

	private static void exam02(Scanner sc) {
		while(true) {
			System.out.print("나뉨수를 입력하시오 : ");
			int dividend = sc.nextInt();
			System.out.print("나눗수를 입력하시오 : ");
			int divisor = sc.nextInt();
			
			try {
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다", dividend, divisor, dividend/divisor);
				break; // 수행되면 반복문 빠져 나가기
			}
			catch(ArithmeticException e){
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요!");
			}

		}
	}

	private static void exam01() {
		int dividend = 5; // 나뉨수
		int divisor =1;  // 나눔수
		
//		System.out.print("나뉨수를 입력하시오:");
//		dividend = sc.nextInt();
//		System.out.print("나눗수를 입력하시오:");
//		divisor = sc.nextInt();
		
//		System.out.printf("%d를 %d로 나누면 몫은 %d 입니다 %n", dividend, divisor, dividend/divisor);
//		System.out.println("계산 완료");
		
		// try-catch 문장
		try {
			System.out.printf("%d를 %d로 나누면 몫은 %d 입니다 %n", dividend, divisor, dividend/divisor);
			System.out.println("계산 완료");
		}
		catch(ArithmeticException e) { //예외처리
			System.out.printf("%d /%d 예외 발생 0으로 나눌수 없음 %n",dividend, divisor);
		}
		System.out.println("main() 수행 완료~!!!");
	}

}
