package kr.or.yi.java_study.ch03;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("<<< [ 번호를 입력하세요 ]     1.for문      2.while    3.종료  >>>   ");
		int res = sc.nextInt();
		while(res<3) { //res:1,2
			if (res==1) {
				System.out.println(" ");
				System.out.println("================================================= [for문 함수] ===================================================");
				System.out.println(" ");
				ex_for(sc); //for문 함수
			}else {
				System.out.println(" ");
				System.out.println("========================================= [while문 함수] =========================================");
				System.out.println(" ");
				ex_while(sc);  //while문 함수
			}
			System.out.print("<<< [ 번호를 입력하세요 ]     1.for문      2.while    3.종료  >>>   ");
			res = sc.nextInt();
		}
		System.out.println(" ");
		System.out.println("======================= aaaa [프로그램을 종료합니다. 커 피 한 잔! 이제그만 하산해^^*] aaaa ======================="); //3번
		System.out.println(" ");
		
		sc.close();
	}

	private static void ex_while(Scanner sc) {  // while함수 스캔
		int res=2;
		int i=0;
		while(res!=7) {
		System.out.print("번호를 입력하세요     1.구구단      2.구구단(full)      3.팩토리얼(5!)     4.팩토리얼_역순(5!)     5.피보나치      6.피보나치_몇번째      7.종료     >>  ");
		res = sc.nextInt();
		switch(res) {
		case 1:while구구단(sc);
		   break;
		case 2:while구구단_full();
		   break;
		case 3:while팩토리얼(5);
		   break;
		case 4:while팩토리얼_역순(5);
			break;
		case 5:while피보나치(10);
		   break;
		case 6:while피보나치_몇번째(sc);
		   break;
		default :System.out.println("============================= wwww [while문 함수를 종료합니다.] wwww ============================");
		i++;
		}
	}
		//while문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}
	
	private static void while구구단(Scanner sc) {
		System.out.println(" ");
		System.out.print("구구단을 출력해볼까요?(숫자입력)  >>>");
		int dan=sc.nextInt();
		int i=1;
		while(i<10) {
			System.out.printf("%d X %d = %d %n",dan, i, dan*i);
			i++;
		}
	}
	
	private static void while구구단_full() {
		int i = 1;
		int j = 2;
		while(i<10) {
			while(j<10) {
				System.out.printf("   %d X %d = %d",j,i,j*i);
				j++;
			}
			System.out.println();
			i++;
			j=2;
		}
	}	
	
	private static void while팩토리얼(int fac) {
		System.out.printf("   < %d!구하기 >   ",fac);
		int sum = 1;
		int i = 1;
		while(i<6) {
			sum=sum*i;
			System.out.printf("%d%s",i,i==fac?"=":"X");
			i++;
		}
		System.out.printf("%d %n",sum);
	}

	private static void while팩토리얼_역순(int fac) {
		System.out.printf("   < %d!구하기 >   ",fac);
		int sum = 1;
		int i = 5;
		while(i>0) {  // 5 4 3 2 1
			sum = sum*i;
			System.out.printf("%d%s",i,i==fac-4?"=":"X");
			i--;
		}
		 System.out.printf("%d %n",sum);
	}

	
	private static void while피보나치(int num) {
		int f1 = 0;
		int f2 = 1;
		int sum = 0;
		System.out.print(sum+" ");
		int i = 1;
		while(i<num+1) {
			f1=sum;
			sum=f2;
			f2=sum+f1;
			System.out.print(sum+" ");
			i++;
		}
		System.out.println();
	}

	private static void while피보나치_몇번째(Scanner sc) {
		System.out.println(" ");
		System.out.print("피보나치 수열 몇번째까지 구해볼까요? >>> ");
		int num = sc.nextInt();
		
		int f1=0;
		int f2=1;
		int sum=0;
		System.out.print(sum+" ");
		int i = 1;
		while(i<num) {
			f1=sum;
			sum=f2;
			f2=sum+f1;
			System.out.print(sum+" ");
			i++;
		}
		System.out.println();
	}
	

	

	private static void ex_for(Scanner sc) {  // for함수 스캔
		int res=1;
		for(int i=0;res!=7;i++) {
			System.out.print("번호를 입력하세요     1.구구단      2.구구단(full)      3.팩토리얼(5!)     4.팩토리얼_역순(5!)     5.피보나치      6.피보나치_몇번째      7.종료     >>  ");
			res = sc.nextInt();
			switch(res) {
			case 1: for구구단(sc);
			   break;
			case 2: for구구단_full();
			   break;
			case 3: for팩토리얼(5);
			   break;
			case 4: for팩토리얼_역순(5);
			   break;
			case 5 : for피보나치(10);
			   break;
			case 6 : for피보나치_몇번째(sc);
			   break;
			default :System.out.println("============================= ffff [for문 함수를 종료합니다.] ffff =============================");
			}
		}
		//for문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	
	private static void for구구단(Scanner sc) {
		System.out.println(" ");
		System.out.print("구구단을 출력해볼까요?(숫자입력)  >>>");
		int dan=sc.nextInt();
		for(int i=1;i<10;i++) {
			System.out.printf("%d X %d = %d %n", dan, i, dan*i);
		}
	}
	
	private static void for구구단_full() {
		for(int i=1;i<10;i++) { //123456789
			for(int j=2;j<10;j++) { //23456789
				System.out.printf("   %d X %d = %d",j,i,j*i);
			}
			System.out.println();
		}
	}
	
	private static void for팩토리얼(int fac) {
		System.out.printf("   < %d!구하기 >  ", fac);
		int sum = 1;
		for(int i=1;i<6;i++) {
			sum=sum*i;
			System.out.printf("%d%s",i,i==fac?"=":"X");
		}
		System.out.println(sum);
	}
	
	private static void for팩토리얼_역순(int fac) {
		System.out.printf("   < %d!구하기 >  ",fac);
		int sum = 1;
		for(int i=5;i>0;i--) { //5,4,3,2,1   -- 5
			sum=sum*i;
			System.out.printf("%d%s",i,i==fac-4?"=":"X");
		}
		System.out.printf("%d %n",sum);
	}
	
	private static void for피보나치(int num) { //int num = 10; 55까지 출력되게 만드세요
		int f1 = 0;
		int f2 = 1;
		int sum = 0;
		System.out.print(sum+" ");
		for(int i=1;i<num+1;i++) {
			f1=sum;
			sum=f2;
			f2=sum+f1;
			System.out.print(sum+" ");
		}
		System.out.println();
	}
	
	private static void for피보나치_몇번째(Scanner sc) {
		System.out.println(" ");
		System.out.print("피보나치 수열 몇번째 까지 결과를 보여드릴까요? >>> ");
		int num = sc.nextInt();
		
		int f1 = 0;
		int f2 = 1;
		int sum = 0;
		System.out.print(sum+" ");
		for(int i=1;i<num;i++) {
			f1 = sum;
			sum = f2;
			f2 = sum+f1;
			System.out.print(sum+" ");
		}
		System.out.println();
	}

}