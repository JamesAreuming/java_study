package kr.or.yi.java_study.ch03.array;

public class ArrayEx02 {

	public static void main(String[] args) {
		char[] chArr = new char[26]; // char타입의 chArr이라는 "0~25개 공간"을 가진 배열을 만듬
		
		prnArray(chArr); //   (1)처음 출력하면 빈공간
		makeArray(chArr); //  (2)zyxwvutsrqponmlkjihgfedcba 만들어 주기
		prnArray(chArr); //   (3)찍어주면 "zyxwvutsrqponmlkjihgfedcba" 출력
		
		//위치교환(swap)
		prnArray(chArr);  //zyxwvutsrqponmlkjihgfedcba
		                  //yzxwvutsrqponmlkjihgfedcba
		
		char temp = chArr[0];
		chArr[0] = chArr[1];
		chArr[1] = temp;
		
		prnArray(chArr); 
	}

	private static void prnArray(char[] arr) { // 출력 / arr로 참조
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%c",arr[i]);
		}
		System.out.println();
		
		//char ch = 'z';
	
//		for(int i=0;i<arr.length;i++) {
//			if(i==0) {
//				arr[i] = 'y';
//				break;
//			}
//			 if(i==1) {
//				 arr[i] ='z';
//				 break;
//				 }
//			System.out.printf("%c",arr[i]);
//		}
	}

	private static void makeArray(char[] arr) { // 만들어주기
		char ch ='z';
		for(int i=0;i<arr.length;i++) { // i<0~25
			arr[i] = ch--; // arr[0] = 'z'
		}
	}

}
