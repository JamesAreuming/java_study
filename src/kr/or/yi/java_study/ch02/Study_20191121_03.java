package kr.or.yi.java_study.ch02;

import java.util.Scanner;

public class Study_20191121_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		multipletree(sc); // 입력받기 때문에 항상 안에 sc넣기
//		ternaryTree(sc);
//		grade(sc);
//		nestedIf(sc);
		
		nestedIfTeachter(sc);
		
		sc.close();
	}

	private static void nestedIfTeachter(Scanner sc) {
		/*
		 * 1. 점수와 학년을 입력받기
		 * 2. 점수가 60점 이상이면 합격
		 * 3. 점수가 60점 미만이변 불합격
		 * 4. (합격자 중에서)4학년일 경우 70점 이상이면 합격
		 */
		
		System.out.printf("<점 수>와    <학 년(1~4학년까지)>을 입력하세요");
		
		int jumsu = sc.nextInt();
		int year = sc.nextInt();
		
		if(jumsu>=60) {
			if(year==4) {
				if(jumsu>=70)
				System.out.println("4학년:합격입니다");
			    else 
				System.out.println("4학년 불합격입니다");
				}
			else 
				System.out.println("합격입니다");
		}
		else 
			System.out.println("불합격입니다");
	
		//System.out.println(jumsu+":"+year);
		
		
	}

	private static void nestedIf(Scanner sc) {
		System.out.println("점수를 입력하세요 -->");
		int score = sc.nextInt();
		System.out.println("학년을 입력하세요(1~4학년까지) -->");
		int year = sc.nextInt();
		
		if(score>=60) {                             
			if(year!=4) {                           
				System.out.println("합격"); // 1~3학년
			}
			else if(score>=70){                      
				System.out.println("합격!");
			}
			else {
				System.out.println("불합격!");
			}
		}
		else {                                     
			System.out.println("불합격");
		}
	}

	private static void grade(Scanner sc) {
		System.out.print("점수를 입력하세요 -->");
		
		char grade;
		
		int score = sc.nextInt();
		
		if(score>=90) {
			grade='A';
		}
		else if(score>=80) {
			grade='B';
		}
		else if(score>=70) {
			grade='C';
		}
		else if(score>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println("학점은"+grade+"입니다.");
	}

	private static void ternaryTree(Scanner sc) { //3항 연산자를 이용하여 같은 결과 출력되도록 하세요
		System.out.print("수를 입력하세요 -->");
		int number = sc.nextInt();
		// String res = number%3==0?"3의배수입니다":"3의배수가 아닙니다";
		System.out.println((number%3==0)?("3의배수입니다"):("3의배수가 아닙니다"));
	}

	private static void multipletree(Scanner sc) {
		System.out.print("수를 입력하세요 -->");
		
		int number = sc.nextInt();
		
		if (number%3 ==0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의배수가 아닙니다");
		}		
	}

}
