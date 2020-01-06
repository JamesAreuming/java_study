package kr.or.yi.java_study.ch02;

import java.util.Scanner; // 패키지가 다를경우 명시

public class ScannerEx {

	public static void main(String[] args) {
		System.out.print("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요. >>");
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		
		/* System.out.println(sc.nextLine()); */ // 이거하면  아래가 수행이 안됨, 여기서 출력하고 끝이 남
		
		
		String name = sc.next(); // 이름 가져오기
		String city = sc.next(); // 도시
		int age = sc.nextInt(); // 나이
		double weight = sc.nextDouble(); // 체중
		boolean isSingle =  sc.hasNextBoolean(); // is : 불리언이라고 유추 가능 // 독신여부
		System.out.printf("이름%s 도시%s 나이%d 체중%.2f 독신여부%b %n", name, city, age, weight, isSingle);
		
		sc.close(); // 스캐너 객채 닫기
			
	}

}
