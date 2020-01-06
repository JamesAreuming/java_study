package ko.or.yi.java_study.ch05_inter;

interface PhoneInterface {
	// 상수, 추상메서드, 디펄트메서드만 선언 가능하다.
	// public static final int TIMEOUT = 1000; // 상수
	int TIMEOUT = 1000; // public static final 생략해도 가능

	// public abstract void sendCall(); //추상메서드
	void sendCall();

	void receiveCall();

	public default void printLogo() { // 디펄트 메서드
		System.out.println("Phone");
	}
	
	//ctrl + shift +f
}
