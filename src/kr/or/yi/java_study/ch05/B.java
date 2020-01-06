package kr.or.yi.java_study.ch05;

public class B extends A {

	private int b;

	public B(int b) {
		this.b = b;
	}

	public void prnB() {
		System.out.println("BBB");
	}
	
	public static void main(String[] args) {
//	A a = new A();                                  //엄마꺼
//	B b = (B)a; // 다운 캐스팅 실패 : B객체가 존재하지 않는다           //자식이 엄마꺼 X
	
		
	/*실제 성공한 다운 캐스팅*/	
	B bb = new B(1); //언니꺼
	A ab = bb; // 엄마가 언니꺼
	B bbb = (B) ab; // 내가 내꺼
	
	/*업캐스팅*/
	A a = new B(1);
	}
}
