package ko.or.yi.java_study.ch05_ab;

public class MethodOverridingEx2 {

	public static void main(String[] args) {
		array();  // --> line, Rect만 구현
		
//		Shape start;
//		Shape last;
//		Shape obj;
//		
//		start = new Line();
//		last = start;
//		
//		obj = new Rect();
//		last.next = obj; //Shape next
//		last = obj;
//		
//		obj = new Line();
//		last.next = obj;
//		last = obj;
//		
//		obj = new Circle();
//		last.next = obj;
//		
//		Shape p  = start;
//		while(p!=null) {
//			p.draw();
//			p = p.next;
		}
	

	public static void array() {
		Line line = new Line();
		
		Shape[] s = { new Line(), new Rect(), new Circle()};		
		for(Shape e : s) {
			paint2(e);
		}
		
//		Line line = new Line(); 
//		paint2(line); 
//		paint2(new Shape()); 
//		paint2(new Line()); 
//		paint2(new Rect()); 
//		paint2(new Circle());
	}

	private static void paint2(Shape p) {
		p.draw();
	}

}
