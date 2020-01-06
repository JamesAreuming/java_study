package kr.or.yi.java_study.ch05;

class Point {
	private int x;
	private int y;
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.printf("( %d , %d )%n",x,y);
	}
}
