package kr.or.yi.java_study.ch02;

public class 사람 {
	private int age;
	private String name;
	
	public 사람(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return String.format("사람 [age=%s, name=%s]", age, name);
	}


	public static void main(String[] args) {
		사람 lsw = new 사람(30, "이상원");
		System.out.println(lsw);
		System.out.println("음~"+lsw+"씨 프로그래머 다 됬네");
		
		사람 bjw = new 사람(40, "배진우");
		System.out.println(bjw);
		
		사람 jar = new 사람(20, "정아름");
		System.out.println(jar);
		
		사람 kms = new 사람(45, "김민수");
		System.out.println("민수옹:"+"이상원"+"("+lsw+")"+"씨 "+"프로그래머"+"다됬네");
		
		System.out.println();
		
		
				
	}
}
