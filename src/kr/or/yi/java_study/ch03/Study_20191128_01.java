package kr.or.yi.java_study.ch03;

import java.util.Scanner;

public class Study_20191128_01 {

	public static void main(String[] args) {
		
//		int i = 0;    // 초기식
//		while(i<10) { // 조건식
//			System.out.print(i);  // 참일경우 수행할 문장
//			i++;   // 증감식
//		}
		
		
//		for(int i=0;i<10;i++) {   // 초기식;조건식;증감식
//			System.out.print(i);  // 참일경우 수행할 문장
//		}
		
//		for(int a = 2;a<10;a++) {
//			for(int b=1;b<10;b++) {
//				System.out.println(a+"X"+b+"="+a*b);
//			}

	   Scanner sc = new Scanner(System.in);
		
		//exam3_while(sc);
		//exam3_for(sc);
		
	   //for구구단(2);
	   //while구구단(2);
	  
	   
	   //for팩토리(5);
	   //while팩토리(5);
	   
	  // for피보나치();   
	  //while피보나치();
	   
	  //for구구단_full();
	  //while구구단_full();
	   
	   
	   
		sc.close();
}


	private static void while구구단_full() {
		   int i=1;
		   int j=2;
		   while(i<10) { //1 2 3 4 5 6 7 8 9
			   while(j<10) { //2 3 4 5 6 7 8 9 
				   System.out.printf("    %d X %d = %d",j,i,j*i);
				   j++;
			   }
			  System.out.println();
			  i++;
			  j=2; //다시 2단으로 가야 하므로 다시 초기화
		   }
	}

	private static void for구구단_full() {
		for(int i=1;i<10;i++) {
			   for(int j=2;j<10;j++) {
				   System.out.printf("   %d X %d = %d",j,i,j*i);
			   }
			   System.out.println();
		   }
	}

	private static void while피보나치() {
		int f1 = 0;
		   int f2 = 1;
		   int sum = 0;
		   
		   System.out.print(sum);
		   int i = 1;
		   while(i<101) {
			   f1=sum;
			   sum=f2;
			   f2=sum+f1;
			   System.out.print(sum);
			   i++;
		   }
	}

	private static void for피보나치() {
		   int f1 = 0;
		   int f2 = 1;
		   int sum = 0;
		   
		   System.out.print(sum);
		   for(int i=1;i<101;i++) {
			   f1 = sum;
			   sum = f2;
			   f2 = f1+sum;
			   System.out.print(sum);
		   }
	}

	private static void while팩토리(int fac) {
		System.out.printf("< %d!구하기 >",fac);
		   int sum = 1;
		   int i = 1;
		   while(i<6) {
			   sum = sum*i;
			   System.out.printf("%d%s",i,i==fac?"=":"X");
			   i++;
		   }
		   System.out.print(sum);
	}

	private static void for팩토리(int fac) {
		int sum = 1;
		   System.out.printf(" <%d!구하기> ",fac);
		   for(int i=1;i<6;i++) {
			   sum=sum*i;
			   System.out.printf("%d%s",i,i==fac?"=":"X");
		   }
		   System.out.println(sum);
	}

	private static void while구구단(int dan) {
		int i = 1;
		   while(i<10) {
			   System.out.printf("%d X %d = %d %n",dan, i, dan*i);
			   i++;
		   }
	}

	private static void for구구단(int dan) {
		for(int i=1;i<10;i++) {
			   System.out.printf("%d X %d = %d %n", dan,i,dan*i);
		   }
	}

	private static void exam3_for(Scanner sc) {
		System.out.print("정수를 입력하시오 >>>");
		
		int n = sc.nextInt();
	
		
		int sum = 0;
		int count=0;
		
		for(int i=0;n!=-1;i++) {  // i:몇번 반복 의미
			sum = sum + n;
			count++;
			n=sc.nextInt();
		}
		System.out.println("몇번반복 : "+count);
		System.out.printf("%d번 반복 %n",count);
		System.out.println("====================");
		System.out.println("평균"+(double)sum/count);
		System.out.printf("평균 : %f %n",(double)sum/count);
		
		
//		int sum = 0;
//		int count;
//		for(count=0;n!=-1;count++) {
//			sum=sum+n;
//			n=sc.nextInt();
//		}
	}

	private static void exam3_while(Scanner sc) {
		System.out.print("정수를 입력하시오 >>> ");  // 10 20 30 40
		
		int n = sc.nextInt();
		
		int count=0;
		int sum=0;
		
		while(n!=-1) {
			sum=sum+n;
			count++;
			
			n=sc.nextInt();
		}
		System.out.println("개수"+count);    // 4
		System.out.print("평균"+(double)sum/count);  // 25
	}
}
