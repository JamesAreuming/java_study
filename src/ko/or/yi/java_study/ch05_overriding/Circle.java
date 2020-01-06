package ko.or.yi.java_study.ch05_overriding;

public class Circle extends Shape {

	@Override //메소드 오버라이딩
	public void draw() {
		System.out.println("Circle");
	}
	
}
