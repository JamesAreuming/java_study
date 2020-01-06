package kr.or.yi.java_study.ch04;

import java.util.Random;
import java.util.Scanner;

public class 반복문과제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		//문제1_1(sc);

		//문제1_2(sc);

		//문제1_3(sc);

		//문제2(sc);

		문제3(sc);
		
		//문제3_1(sc);

		//문제4();




		sc.close();
	}

	public static void 문제3_1(Scanner sc) {
		int correct = (int)(Math.random()*100)+1; // 미리결정된 정답
		int count = 0; //시도 횟수
		System.out.println("정답 : "+correct);
		int res;
		do {
			System.out.print("1-100사이의 정수를 입력하시오 >>> ");
			res = sc.nextInt();
			count++;
			if(res>correct) {
				System.out.println("낮음");
			}else if(res == correct) {
				System.out.println("정답");
				break;
			}else {
				System.out.println("높음");
			}
			res = sc.nextInt();
		}while(res>0);
		System.out.println(count);
	}

	public static void 문제1_3(Scanner sc) {
		System.out.print("입력값 ... 입력값 0 >>> ");

		int iValue;
		int sum = 0;
		do {
			iValue = sc.nextInt();
			sum = sum +iValue;
		}while(iValue!=0);
		System.out.println(sum);
	}

	public static void 문제1_2(Scanner sc) {
		System.out.print("입력값의 개수, 입력값1, 입력값2 .... >>> ");
		int cnt = sc.nextInt();

		int sum = 0;
		int iValue;
		for(int i=0;i<cnt;i++) {
			iValue = sc.nextInt();
			sum = sum +iValue;
			System.out.printf("%d %s",iValue,i==cnt-1?"=":"+");
		}
		System.out.println(sum);
	}

	public static void 문제1_1(Scanner sc) {
		System.out.print("시작값 종료값을 입력 >>> ");

		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0;

		for(int i=start;i<end+1;i++) {
			sum = sum+i;
		}
		System.out.printf("%d 에서 %d까지의 합은 %d %n",start,end,sum);
	}


	public static void 문제3(Scanner sc) {
		while(true) {
			Random rnd = new Random();
			int num = rnd.nextInt(100)+1; 
			System.out.println("(1-100)까지 숫자 맞추어보세요");
			
			int i = 1;
			
			while(true) { 

				System.out.println(i + ">>");
				int input = sc .nextInt(); 

				while(input != num) { 
					if(input<num)
						System.out.println("더 크게");
					else if(input>num) 
						System.out.println("더 작게");
					i++;
					break; 
				}

				if(input==num) {
					System.out.println("맞았습니다.");
					System.out.println("다시하시겠습니까? (y/n) >>");

					if(sc.next().equals("n")) {
						System.out.println("숫자 맞추기를 종료합니다.");
						System.exit(0);
					}
					else 
						break;
				}
			}
		}

	}

	public static void 문제2(Scanner sc) {
		System.out.print("숫자를 입력하세요 >>> "); // 1206
		int num=sc.nextInt();

		int result=0;

		do {
			result= result * 10 + num % 10;
			num = num / 10;

		}while(num!=0);
		System.out.println(result); // 바뀐숫자   6021 


		System.out.println("-----------------------------------------");

		System.out.print("숫자를 입력하세요 >>> ");

		int res = sc.nextInt();

		do {
			System.out.print(res % 10);
			res = res/10;
		}while(res>0);

	}

	public static void 문제4() {
		//별4-1
		for(int i=0;i<=7;i++) {
			for(int j =0;j<=7;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------------------------");

		//별4-2
		for(int i=0;i<=7;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------------------------------");

		//별4-3
		for(int i=0;i<=7;i++) {
			for(int j=0;j<=7-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
