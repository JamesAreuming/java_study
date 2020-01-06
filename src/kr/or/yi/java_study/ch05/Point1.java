package kr.or.yi.java_study.ch05;

class Point1 {
	private int x;
	private int y;
	
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint1() {
		System.out.printf("( %d , %d )%n",x,y);
	}
}
