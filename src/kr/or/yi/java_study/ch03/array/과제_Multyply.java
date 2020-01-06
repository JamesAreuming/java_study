package kr.or.yi.java_study.ch03.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 과제_Multyply {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		문제15(sc);
		
		sc.close();
	}

	private static void 문제15(Scanner sc) {
			System.out.print("곱하고자 하는 두 수 입력 >>> ");

			try {
				int n = sc.nextInt();
				int m = sc.nextInt();

				System.out.print(n+"X"+m+"="+n*m);
				System.out.println(" ");
			}catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다!");
			}
	}

}
