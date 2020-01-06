package kr.or.yi.java_study.ch03.array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class 과제_20191205_로또 {

	public static void main(String[] args) {
		System.out.println("  ");
		System.out.print("==========aaaaaa 행운의 lotto 추첨 aaaaaa==========");
		System.out.println("  ");
		System.out.println("  ");

		int[] lotto = lotto_1st(); //(1등) 로또번호 생성

		Scanner sc = new Scanner(System.in);

		mylotto(lotto, sc); // 로또번호 입력, 등수&개수 가리기

		sc.close();

	}

	private static void mylotto(int[] lotto, Scanner sc) {
		while(true) { 	
			//Scanner sc = new Scanner(System.in);
			try {
				int [] mylotto = new int[6]; // 내 로또 번호 생성하기

				System.out.print("로또번호를 6자리를 입력하세요  >>> "); // 로또번호 입력받기

				/*
				 * 1등 : 16 29 38 34 45 5 (6개)
				 * 2등 : 16 29 38 34 45 0 (5개)
				 * 3등 : 0  29 38 34 45 5 (5개)
				 * 4등 : 0  0  38 34 45 5 (4개)
				 * 5등 : 0  0  0  34 45 5 (3개)
				 * 탈락 : 0  0  0  0  0  0 (0개)
				 */


				for(int j=0;j<mylotto.length;j++) { // 로또번호 생성
					mylotto[j] = sc.nextInt();
					//System.out.print(mylotto[j]+" ");
				}

				// System.out.println(Arrays.toString(mylotto));

				int count = 0; // 맞춘개수
				for(int i =0;i<lotto.length;i++) {	
					for(int j=0;j<mylotto.length;j++) {
						if(lotto[i]==mylotto[j]) {
							count++;
						}
					}

					//System.out.print(mylotto[i]+" ");
				}

				System.out.println("========= 번 호 =========  ===등   수===  =맞 춘 개 수=");
				System.out.print(Arrays.toString(mylotto));

				int num = 0; // 등수
				switch(count) {
				case 6:
					num = 1;
					break;
				case 5:
					if(lotto[5]!=mylotto[5]) {
						num = 2;
					}else {
						num = 3;
					}
					break;
				case 4:
					num = 4;
					break;
				case 3:
					num = 5;
					break;
				default :
					System.out.println(" ▶▶▶ (One More Time) 다시 도전해 주세요!!! ");
					System.out.println(" ");
					continue;	
				}

				System.out.println("  <축> "+num+"등당첨            "+count+"개");
				System.out.println("=============================================");

			}catch(InputMismatchException e) {
				System.out.println(" ");
				System.out.println("========== <경> 정확히 다시 입력하세요 <고> ==========");
				System.out.println(" ");
				sc.nextLine(); // 해결함!
				//break;
			}

		}

	}

	private static int[] lotto_1st() {
		int [] lotto = new int[6]; // 1등당첨 로또번호 생성하기 16 29 38 34 45 5 <보너스번호> 5
		Random rnd = new Random(1);

		System.out.print("<1등 로또번호> ");
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=rnd.nextInt(45)+1;
			System.out.print(lotto[i]+" ");
		}

		System.out.println("<보너스번호> "+lotto[5]); // 보너스번호:5
		System.out.println("  ");

		//System.out.println(Arrays.toString(lotto));
		return lotto;
	}


}
