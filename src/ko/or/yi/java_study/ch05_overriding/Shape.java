package ko.or.yi.java_study.ch05_overriding;

public class Shape { //슈퍼 클래스
	public Shape next;
	
	public Shape() {
		next = null;
	}
	
	public void draw() {
		System.out.println("Shape");
	}
}
