package kr.or.yi.java_study.ch04;

public class Circle extends Object{//extends Object [생략]
	public int radius; //멤버변수
	public String name; //멤버변수

	public Circle() { //생성자
		super(); // 부모를 의미,부모 생성자 호출     //super(); [생략]
	} 


	public Circle(String name) { // name만 받는거고, super();는 생략,   생성자오버로딩 
		this.name = name;
	}


	public Circle(int radius, String name) {//int radius, String name : 지역변수
		//super(); 생략가능O

		this.radius = radius; // this : 나자신을 의미/ 내가 정의한 필드의 radius에 값을 저장하라
		this.name = name;
	}


	public Circle(int radius) {
		this.radius = radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getArea() {
		return 3.14*radius*radius;
	}

	@Override // Object 클래스에 있는 toString 재정의
	public String toString() {
		return String.format("Circle [%s, %s, 면적 : %s]", radius, name, getArea());
	}


}
