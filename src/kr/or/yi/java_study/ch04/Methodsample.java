package kr.or.yi.java_study.ch04;

public class Methodsample {

	public int getSum(int i,int j) {
		return i+j;
	}
	
	public int getSum(int i,int j,int k) {
		return i+j+k;
	}
	
	public double getSum(double i, double j) {
		return i+j;
	}
	
	public static void main(String[] args) {
		Methodsample a = new Methodsample();
		
		int i = a.getSum(i, j);
		
		int j = a.getSum(i, j);
		
		double k = a.getSum(i, j);
	}
}
