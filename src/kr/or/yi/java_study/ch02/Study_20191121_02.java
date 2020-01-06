package kr.or.yi.java_study.ch02;

public class Study_20191121_02 {
	public static void main(String[] args) {
		/* assignmentIcnDec(); */
		/* logicalOperator(); */
		/* ternaryOperator(); */
		
		 System.out.printf("%x %n",10);
		 System.out.printf("%4x %n",10);
		 System.out.printf("%04x %n",10);
	}

	private static void ternaryOperator() {
		int a = 3;
		int b = 5;
		
		int res = a>b ? a-b : b-a;

		
		System.out.printf("두수의 차는 %d다 %n", res);
		System.out.println("두수의 차는"+ ((a>b)?(a-b):(b-a)));
		
		
	}

	private static void logicalOperator() {
		System.out.println('a'>'b');
		System.out.println(3>=2);
		System.out.println(-1<0);
		System.out.println(3.45<=2);
		System.out.println(3==2);
		System.out.println(3!=2);
		System.out.println(!(3!=2));
		
		System.out.println((3>2)&&(3>4)); // t&&f -->false   (t&&t --> true)
		System.out.println((3!=2)||(-1>0)); // t||f --> true  (t||t --> true)     // (f||f --> false)
		System.out.println((3!=2)^(-1>0)); // t^f --> true
	}

	private static void assignmentIcnDec() {
		int a = 3;
		int b = 3;
		int c = 3;
		
		a+=3;
		b*=3;
		c%=2;
		
		System.out.println("a="+a+"b="+b+"c="+c);
		System.out.printf("a는 %d b는 %d c는 %d %n", a, b, c);
		
		int d = 3;
		
		a = d++;
		System.out.printf("a는 %d d는%d %n",a, d);
		
		a= ++d;
		System.out.printf("a는 %d d는%d %n",a, d);
		
		a= d--;
		System.out.printf("a는 %d d는%d %n",a, d);
		
		a= --d;
		System.out.printf("a는 %d d는%d %n",a, d);
	}
}
