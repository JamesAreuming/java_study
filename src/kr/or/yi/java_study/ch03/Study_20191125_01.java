package kr.or.yi.java_study.ch03;

public class Study_20191125_01 {

	public static void main(String[] args) {
		/*for문*/

		//hard();
		
		//for_loop01();
		
		/* 2*1=2 */
		
		//int dan = 2;
		
		/*
		 * for(int dan = 2; dan<10;dan++) { System.out.println("====" + dan + "====");
		 * gugudan(dan); }
		 */
		
		/*
		 * for(int num=2;num<10;num++) { //2 3 4 5 6 7 8 9 System.out.println("aaaaa" +
		 * num + "aaaaa"); for(int i=1;i<10;i++) { //1 2 3 4 5 6 7 8 9
		 * System.out.printf("%d X %d = %d %n",num,i,num*i); } }
		 */
		
/*		for(int i=1;i<10;i++) {
			for(int a=2;a<10;a++) {
				System.out.print(a+"X"+i+"="+a*i+"  ");
				//System.out.printf("%d X %d = %2d", a,i,a*i);
			}
			System.out.println();
		}*/
		
		//1~100 : 짝수만 출력
		
		//i%2=0 //짝수
	    //i%2=1 //홀수
	
		for(int i=1;i<11;i++) {
			if(i % 2 == 0) {
			System.out.print(i);
		 }
		}
		
		System.out.println(" >>> 뛰어쓰기");
		
		for(int b=1;b<11;b++) {
			if(b%2 ==1) {
				System.out.print(b);
			}
		}
		System.out.println(" >>> 뛰어쓰기");
		
	 for(int a=2;a<11;a=a+2) {
		 System.out.print("★"+a);
	 }
		
	 System.out.println(" >>> 뛰어쓰기");	
	 
	 for(int a=2;a<11;a=a+2,System.out.print("☆"+a)); // 돌아가나 쓰지마라, 가독성이 떨어진다
		
	 System.out.println(" >>> 뛰어쓰기");
	 
	 for(int c=1;c<10;c++) {
		 int sum=+1;
		 System.out.println(sum+c);
	 }
	 
		}
	
	

	private static void gugudan(int dan) {
		for(int i=1; i<10; i++) {  //i<=9
			System.out.printf("%d X %d = %d %n",dan, i, dan*i);
		}
	}

	private static void for_loop01() {
		for(int i = 0; i<10; i++) { //0,1,2,3,4,5,6,7,8,9
			System.out.println("Hello Java!"+i+"번째");
		}
		System.out.println("끝~");
	}

	private static void hard() {
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
	}

}
