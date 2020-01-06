package kr.or.yi.java_study.ch02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.print("두 정수를 입력하시오. 공백으로 분리>>");
		Scanner sc = new Scanner(System.in); // ctrl + shift + O : 자동 import
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
	    // a=5, b=2 : 7(5+2),3(5-2),10(5*2),2.5(5/2)
		int res1;
		float res2;
		
		res1 = sum(a,b); // 두수의 합        --> sum함수 만들기
		System.out.printf("두 수 (%d %d) 의 합은 %d %n", a, b, res1);
		System.out.println("두수의 합은"+a+"+"+b+"="+res1);
		
		res1 = sub(a,b); // 두수의 차      --> sub함수 만들기
		System.out.printf("두 수 (%d %d) 의 차은 %d %n", a, b, res1);
		System.out.println("두수의 차는"+a+"-"+b+"="+res1);
		
		res1 = mul(a,b); // 두수의 곱  --> mul함수 만들기
		System.out.printf("두 수 (%d %d) 의 곱은 %d %n", a, b, res1);
		System.out.println("두수의 곱은"+a+"x"+b+"="+res1);
		
	    res2 = div(a,b); // 두수의 몫   --> div함수 만들
		System.out.printf("두 수 (%d %d) 의 몫은 %.1f %n", a, b, res2);
		System.out.println("두수의 몫은"+a+"/"+b+"="+div(a,b));
		
		sc.close();
	}



	private static float div(float a, float b) {
		return a/b;
	}

	private static int mul(int a, int b) { //곱
		return a*b;
	}

	private static int sub(int a, int b) { //차
		return a-b;
	}

	private static int sum(int a, int b) { // 합
		return a+b;
	}

}
