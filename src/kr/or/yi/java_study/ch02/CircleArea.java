package kr.or.yi.java_study.ch02;

public class CircleArea {

	public static void main(String[] args) {
		final double PI = 3.14;
		
		double radius = 10.0;
		double circleArea = radius*radius*PI;
		
		System.out.println("원의 면적 = " + circleArea);
		System.out.printf("원의 면적 = %.2f %n", circleArea); // c언어 때문인가?
		
		int n = 300;
		byte b = (byte) n;  // 캐스팅
		System.out.println(b); // 값이 잘려져서 출력됨
	}

}
