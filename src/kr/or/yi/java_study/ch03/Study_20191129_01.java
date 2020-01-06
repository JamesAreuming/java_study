package kr.or.yi.java_study.ch03;

import java.util.Scanner;

public class Study_20191129_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		char c = 'a';
		do {
			System.out.print(c);
			c=(char)(c+1);
			
		}while(c<='z');
		
		System.out.println();
		
		char b = 'A';
		do {
			System.out.print(b);
			b=(char)(b+1);
		}while(b<='Z');
		
		System.out.println();
		
		int a = 0;
		do {
			System.out.print(a);
			a++;
		}while(a<11);
		
		System.out.println();
		
		System.out.println("=======================================================================================");			
		/* (1) 5단 없애서 출력시키기 */
		int dan = 2;
		for(int i=1;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.printf("%d X %d = %d %n",dan,i,dan*i);
		}
		System.out.println("=======================================================================================");		
		/* (2) 5단 없애서 출력시키기 */
		for(int i=1;i<10;i++) {
			 if(i==5) {
				 continue;
			 }
			for(int j=2;j<10;j++) {
				if(j==5) {
					continue;
				}
				System.out.printf("   %d X %d =%2d",j,i,j*i);
			}
			System.out.println();
		}
		
		System.out.println("=======================================================================================");
		
		/* 5단까지만 출력 */
		for(int i=1;i<10;i++) {
			if(i==6) {
				break;
			}
			for(int j=2;j<10;j++) {
				if(j==6) {
					break;
				}
				System.out.printf("   %d X %d =%2d",j,i,j*i);
			}
			System.out.println();
		}
		System.out.println("=======================================================================================");		
		/* 1-100까지 합 / 1-100까지 짝수합 / 1-100까지 홀수합 / 1-100까지 3의 배수 합*/
        
		int sum = 0;
         
        for(int i=1; i <= 100; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    	
	
        
	    int 짝수 =0;
	    int 홀수 =0;
	    int 삼삼 =0;
	    for(int i=1;i<101;i++) {
	    	if(i%2==0) {
	    		짝수=짝수+i;
			} /*
				 * else if(i%3==0) { 삼삼=삼삼+i; }
				 */else{
	    		홀수=홀수+i;
	    	}
	    }
	    	System.out.println(짝수);
	    	System.out.println(삼삼);
	    	System.out.println(홀수);
	    	
	    
	    }
	
	  

	    
}
