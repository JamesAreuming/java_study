package kr.or.yi.java_study.ch04;

public class ArrayPassingEx {

	public static void main(String[] args) {
		char [] c = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c); //원래 출력 : This is a pencil.
		repalcaSpace(c); // 공백 문자 --> ,로 바꾸기
		printCharArray(c); // 수정 출력 : This,is,a,pencil.
		
	}
	
	MethodSample a = new MethodSample();
	
	int i = a.getSum(1,2);

	private static void repalcaSpace(char[] a) { // 매개변수 a : 배열 c를 가리킴 //배열 a의 공백문자를 ','로 변경
		for(int i =0;i<a.length;i++) {
			if(a[i] == ' ') { //공백이라면
				a[i] =',';  // ,로 변경
			}
		}
	}

	private static void printCharArray(char[] a) { // 출력
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

}
