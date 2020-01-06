package kr.or.yi.java_study.ch05;

class Person1{
	
}

class Student1 extends Person1{
	
}

class Researcher extends Person1{
	
}

class Professor extends Researcher{
	
}

public class InstanceOfEx1 {
	static void print(Person1 p) {
		if(p instanceof Professor) {
			System.out.print("교수");
		}else if(p instanceof Researcher) {
			System.out.print("연구원");
		}else if(p instanceof Student1) {
			System.out.print("학생");
		}else if(p instanceof Person1) {
			System.out.print("사람");
		}
	}
	
	public static void main(String[] args) {
		//print(new Student());
		print(new Researcher());
		System.out.println();
		print(new Professor());
	}

}
