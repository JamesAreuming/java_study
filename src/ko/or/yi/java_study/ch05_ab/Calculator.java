package ko.or.yi.java_study.ch05_ab;

abstract class Calculator { // 추상클래스
	public abstract int add(int a, int b); // 합 : a+b
	public abstract int subtract(int a, int b); // 차 : a-b
	public abstract double average(int[] a); // 평균 - 배열에 저장된 정수의 평균 리턴
}
