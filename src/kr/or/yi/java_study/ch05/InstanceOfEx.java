package kr.or.yi.java_study.ch05;

class A1{
	void prnA1() {
		System.out.println("a");
	}
}

class B1 extends A1{
	void prnB1() {
		System.out.println("b");
	}	
}

class C1 extends B1{
	void prnC1() {
		System.out.println("c");
	}	

}
public class InstanceOfEx {

	public static void main(String[] args) {
		//		instanceofEx01();

		A1 a = new A1();
		B1 b = new B1();
		C1 c = new C1();

		prnObj(a); //부모 A1으로 다 받기
		prnObj(b);
		prnObj(c);
	}

	private static void prnObj(A1 a) {
		if(a instanceof C1) {
			C1 cc = (C1) a; //타입캐스트
			cc.prnC1();
		}else if(a instanceof B1) {
			B1 bb = (B1) a;
			bb.prnB1();
		}else if(a instanceof A1) {
			a.prnA1();
		}
	}


	public static void instanceofEx01() {
		A1 a = new C1(); // 업캐스팅
		//		A1 a = new B1();

		//		A1 a = new A1();
		/* 부모는 자식을 참조 할 수 있으나, 자식은 부모를 참조할 수 없다 */
		if(a instanceof A1) {
			System.out.println("a는 A1의 객체를 가지고 있음");
		}
		if(a instanceof B1) {
			System.out.println("a는 B1의 객체를 가지고 있음");
		}
		if(a instanceof C1) {
			System.out.println("a는 C1의 객체를 가지고 있음");
		}

		//		if(a instanceof C1) { //하위부터 적어줘야 다 나온다
		//			System.out.println("a는 C1의 객체를 가지고 있음");
		//		}else if(a instanceof B1) {
		//			System.out.println("a는 B1의 객체를 가지고 있음");
		//		}else if(a instanceof A1) {
		//			System.out.println("a는 A1의 객체를 가지고 있음");
		//		}
	}

}
