package kr.or.yi.java_study.ch04;

public class TestMain {

	public static void main(String[] args) {
		//prnTest();
		
		  TestMain t = new TestMain(); // 생성자만들고
		  
		  t.prnTest(); // "스태틱은 스태틱만 호출할 수 있으므로"
		  
		  //hahah();
		  //prn();
	}

	public static void prn() {
		System.out.println("ppp");
	}
	public void prnTest() {
		System.out.println("하하");
		
		TestMain.prn();
	}
	
	public void hahah() {
		System.out.println("aaaa");
	}
}
