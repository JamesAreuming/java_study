package kr.or.yi.java_study.ch03;

public class Study_20191127_01 {

	public static void main(String[] args) {
		 
		 //5!
		//5*4*3*2*1 = 120
	    //1*2*3*4*5
		
		//1*1 1*2 2*3 6*4 24*5 120
		
		  //fac01();
		  //fac02();
		  
		int fac1 = 5;
		  fac03(5);
		  fac04(5);
		  
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		/* 피보나치 수열 */
		// 0 1 1 2 3 5 8 13 /
		
		//
		
		int a = 0;  // 피보나치1 : 0
		int b = 1;  // 피보나치2 : 1
		int sum = 0; //출력될 값
		
		for(int i=1;i<11;i++) {  // 10번반복하자 : 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			a = sum;  //    a =     0        1        1       2       3         5         8           13         21
			sum = b;  // ★  sum =    1        1        2       3       5         8         13          21         34
			b= a+sum;	//  b = 0+1[1]   1+1[2]   1+2[3]  2+3[5]  3+5[8]   5+8[13]   8+13[21]   13+21[34]  21+34[55]
			System.out.print("("+i+"번) "+sum+" / "); // 1,1,2,3,5,8,13,21,34,55
		}
		
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		
		
		int c = 0;  // 
		int d = 1;  // 
		int tot = 0; //출력될 값
		
		System.out.print(tot); // 먼저 tot값 찍고 -- 0
		
		for(int i=1;i<11;i++) {  // 10번반복하자 : 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			c = tot;  //    c =     0        1        1       2       3         5         8           13         21
			tot = d;  // ★  tot =    1        1        2       3       5         8         13          21         34
			d= c+tot;	//  b = 0+1[1]   1+1[2]   1+2[3]  2+3[5]  3+5[8]   5+8[13]   8+13[21]   13+21[34]  21+34[55]
			System.out.print(tot); // 1,1,2,3,5,8,13,21,34,55
		}
		
	}



	private static void fac04(int fac1) {
		int tot4 = 1;
		System.out.printf("(팩토리 구하기) %d! ", fac1);
		for(int i=5;i>0;i--) { // 5,4,3,2,1
			tot4=tot4*i;       // 1*5  5*4  20*3  60*2  120*1
			System.out.printf("%d%s",i,i==fac1-4?"=":"X");    // 5 = 5, 4 = 5, 3 = 5, 2 = 5, 1 =5
		}
		System.out.println(tot4);
	}



	private static void fac03(int fac1) {
		int tot3 = 1;
		System.out.printf("(팩토리 구하기) %d! ", fac1);
		for(int i=1;i<6;i++) { // 1, 2, 3, 4, 5
			tot3=tot3*i;       //    1*1  1*2  2*3  6*4  24*5
			System.out.printf("%d%s", i, i==fac1?"=":"X");   //%s -- 문자          
		}
		System.out.println(tot3);
	}
	

	
	private static void fac02() {   // int fac ?
		int tot2 = 1;
		for(int i=1;i<6;i++) { // 1,2,3,4,5
			tot2=tot2*i;  //  1*1 1*2 2*3 6*4 24*5 
			System.out.print(i+"x");  //  
		}
		System.out.println("="+tot2);
	}

	private static void fac01() {
		int tot1 = 1;
		  for(int i=5;i>0;i--) { // 5,4,3,2,1 // tot = i*tot; // 5 = 5*1 / 4
			tot1=tot1*i;    // 5 4 3 2 1 
		    System.out.print(i+"x"); //
		  }
		  System.out.println("="+tot1);
	}

}
