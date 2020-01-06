package kr.or.yi.java_study.ch02;

import java.util.Scanner;

public class Study_20191121_04 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		gradeSwitch(sc);
		coffeePrice(sc);
		
		sc.close();
	}

	private static void coffeePrice(Scanner sc) {
		System.out.print("무슨 커피 드릴까요(에스프레소/카푸치노/카페라떼/아메리카노) -->");
		String order = sc.next();
		
		int price = 0;
		
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴가 없습니다!!!!");
		}
		if(price !=0) {
			System.out.printf("주문한 음료는(%s) 이고 가격은 (%d) 입니다. %n", order, price);
		}
	}

	private static void gradeSwitch(Scanner sc) {
		char grade;
		System.out.print("점수를 입력하세요(0~100) -->");
		
		int score = sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("학점은"+grade+"입니다");
		System.out.printf("학점은 (%s) 입니다 %n",grade);

	}

}
