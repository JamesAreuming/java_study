package ko.or.yi.java_study.ch05_overriding;

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw(); //p가 가리키는 객체 내에 오버라이딩 된 draw() 호출, 동적 바인딩
	}
	public static void main(String[] args) {
		Line line = new Line(); 
		
		paint(line); // Line line = new Line(); --> Line
		paint(new Shape()); //Shape p = new Shape  --> Shape
		paint(new Line()); // Shape p = new Line --> Line
		paint(new Rect()); // Shape p = new Rect --> Rect
		paint(new Circle()); // Shape p = new Circle --> Circle
	}

}
