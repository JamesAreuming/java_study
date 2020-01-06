package kr.or.yi.java_study.ch05;

public class A {
	private int a;

	public A() { // B가 디펄트 슈퍼 생성자 호출하는데 없으면 빨간줄뜸
		super();
	}

	public A(int a) {
		this.a = a;
	}

	public void prnA() {
		System.out.println("AAA");
	}

	@Override
	public String toString() {
		return String.format("A [a=%s]", a);
	}


}
