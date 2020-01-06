package kr.or.yi.java_study.ch04;

public class Rectangle {
	int width;
	int height;


	public Rectangle() { // 생성자
	}


	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}


	public int getArea() {
		return width*height;
	}
}
