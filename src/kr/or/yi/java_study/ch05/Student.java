package kr.or.yi.java_study.ch05;

class Student extends Person {
	public void set() {
		age = 30; //디폴트 생성자 = 같은 패키지안
		name = "홍길동"; // 퍼블릭
		height = 175; //프로텍티드
		//weight = 99;
		setWeight(99); // set을 통해 프라이벗 접근
	}
}
