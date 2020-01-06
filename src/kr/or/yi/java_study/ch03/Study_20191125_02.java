package kr.or.yi.java_study.ch03;

public class Study_20191125_02 {

	public static void main(String[] args) {
		// exam01();

		// ********** 10번 별찍기
		//별찍기01();



	}

	private static void 별찍기01() {
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void exam01() {
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum = sum + i; // 0+0, 0+1, 1+2, 3+3, 6+4, 10+5, 15+6, 21+7, 28+8, 37+9 , 46+10
		}
		System.out.println(sum);

		// 1부터 100까지 짝수합과 홀수합, 전체합을 구하는 반복문 작성

		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		// System.out.printf("d% d% d%, evenSum, oddSum, evenSum+oddSum);
	}

}
