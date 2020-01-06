package kr.or.yi.java_study.ch01;

/*public class Test{      →  public은 파일이름과 동일한 소유 클래스만 붙일 수 있다.
	
}*/

public class HelloJava {  // 하나의 파일당 하나의 클래스만!, 소유클래스만 public을 붙일 수 있음 / 변수선언O

	public static void main(String[] args) { // 메인 메서드 / 변수선언O

//		함수내에서 선언된 변수는 지역변수    : 주석 (Ctrl+/)

		String name = "이상원"; // String : 문자열을 저장할 수 있는 클래스

		System.out.print("Hello Java"); // 프로그래밍 언어에서는 대소문자 구분 (데이터베이스 - 구분X)
		System.out.print("음 프로그래머 다 됬군!"); // out: 컴퓨터로 출력해줄게, ln: 줄바꿈 (= \n)
		System.out.print("음 프로시저 박사 다 됬구먼 \n");

		/* 문자열 + 변수 => 문자열+문자열 => 하나의 문자열 */ // 블럭주석 : ctrl + shift + / , 해제: ctrl+shift+\
		System.out.println("프로시저박사" + "=" + name);
		System.out.println("프로그래머" + "=" + name);
		// ctrl + shift + f : 자동 들여쓰기
		
		char lee = '\uc774';
		char sang = '\uc0c1';
		char won = '\uc6d0';
		
		System.out.println(lee);
		System.out.println(sang);
		System.out.println(won);

	}

}
