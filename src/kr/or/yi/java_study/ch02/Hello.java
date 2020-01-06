package kr.or.yi.java_study.ch02;

/**
 * 소스파일 : Hello.java
 * 작성일 : 2019.11.20
 * 아래 클래스에 대한 설명을 적음
 * (alt + shift + j : 문서화 주석)
 */
public class Hello {
	public static void main(String[] args) { // main -> ctrl + 스페이스 + 엔터
		// 지역변수(함수내 선언된 변수)
		
		final double PI = 3.14;
		
		int i = 20; // 선언과 동시에 초기화 / = : 같다는 의미가 아니라 / 할당연산자  or 배정연산자 / L-value(저장소-수행순서1) = R-value(값-수행순서1)
		int s;    // 정수형 변수 선언만
		char a;   // 믄지향 변수 선언만
		
		s = sum(i,10); // sum : The method sum(int, int) is undefined for the type Hello / sum 메서드 만들어줄까
		a='?'; // 이클립스에서 힌트를 줌 
		
		System.out.println(a+"Hello"+s); 
		// '?' + "Hello" + 30
		// "?" + "Hello" + 30
		// "?Hello"+30
		//"?Hello"+"30"
		// ?Hello30
		System.out.println(a+"Hello"+s+10);
		// "?Hello30"+"10"
		// ?Hello3010
		System.out.println(a+"Hello"+(s+10));
		// 괄호가 우선연산 : "?Hello" + (40)
		// "?Hello40
		System.out.printf("%c %10s %d %5.2f %n", a,"Hello",s, 5/3.0); 
		// c : 캐릭터 / s : 스트링, 문자열 / d : 10 진수 / f: 실수 / 2f : 소수점이하 2개  / 10,5 : 자리수를 의미, 공간확보 , -를 붙이면 좌측정렬 / %n: 줄바꿈
		
		/* System.out.printf("n = %d, m=%d %n" n, m); */ // n, m는  아래 sum함수에서만 유용 , 사용 범위가 틀림/ 자바에서는 전역변수(ex. 프린터)X 비슷한게 클래스변수, 스태틱 변수 
			
	}

	private static int sum(int n, int m) { // n : 20 / m : 10  // 지역변수 : 그 지역에서만 유용? // 블럭지정후 alt + shift + r : 동시바뀜 
		return n+m; // 30이 리턴
	}
}
