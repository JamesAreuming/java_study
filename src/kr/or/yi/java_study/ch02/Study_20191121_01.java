package kr.or.yi.java_study.ch02;

import java.util.Scanner;

public class Study_20191121_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* getHourMinuteSecond(sc); */
		/* getPayCount(sc); */
		
		
		//postfix(); // alt + shift +m : 함수로 만들기
		//prefix();
		/* return; */ // 생략되어 있음		
		getPayCount(sc);
		sc.close();
	}

	private static void prefix() {
		int a = 10;
		int b = ++a; // 전위 증감 연산 (11로 바뀐 값을 b에 넣어라)
		System.out.printf("a = %d b = %d %n", a,b); // a= 11, b = 11
		/* return; */ // 생략되어 있음
	}

	private static void postfix() {
		int a =10;
		int b = a++; // 후위 증감 연산 (a값 10을 먼저 b에 넣고 a값을 증감)
		System.out.printf("a = %d b = %d %n", a,b); // a= 11, b = 10
		/* return; */ // 생략되어 있음
	}

	private static void getPayCount(Scanner sc) {
		System.out.println("금액을 입력하세요");
		int pay = sc.nextInt(); // 97870 (5만원 1, 만원 4, 오천원 1, 천원 2, 오백원 1, 백원 3, 오십원 1, 십원 2)
		int 오만원 = pay/50000;
		int 만원 = (pay % 50000) / 10000; // 4만원
		int 오천원 = ((pay % 50000) % 10000)/5000;
		int 천원 = (((pay % 50000) % 10000)%5000) / 1000;
		int 오백원 = ((((pay % 50000) % 10000)%5000) % 1000)/500;
		int 백원 = (((((pay % 50000) % 10000)%5000) % 1000)%500)/100;
		int 오십원 = ((((((pay % 50000) % 10000)%5000) % 1000)%500)%100)/50;
		int 십원 = (((((((pay % 50000) % 10000)%5000) % 1000)%500)%100)%50)/10;
		
		System.out.printf("%d %d %d %d %d %d %d %d %n", 오만원, 만원, 오천원, 천원, 오백원, 백원, 오십원, 십원);
		
		System.out.println(오만원);
		System.out.println(만원);
		System.out.println(오천원);
		System.out.println(천원);
		System.out.println(오백원);
		System.out.println(백원);
		System.out.println(오십원);
		System.out.println(십원);
		
	}

	/*
	 * private static void getHourMinuteSecond(Scanner sc) {
	 * System.out.println("정수를 입력하세요"); int time = sc.nextInt(); int second = time %
	 * 60; int minute = (time/60)%60; int hour = (time/60)/60;
	 * 
	 * System.out.println(time); System.out.println(hour);
	 * System.out.println(minute); System.out.println(second);
	 * 
	 * System.out.printf("%d 초는 %d시간 %d분 %d초 입니다 %n", time, hour, minute, second);
	 * sc.close();
	 * 
	 * }
	 */

}
