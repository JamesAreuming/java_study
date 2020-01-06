package kr.or.yi.java_study.ch04;

import java.util.Arrays;

public class Ch04Main02 {

	public static void main(String[] args) {
		//Circle[] circleArr = new Circle[5]; // ex. int[] intArray = new int[5];
		Circle[] circleArr = {new Circle(1, "자바"), new Circle(2,"피자"), new Circle(3,"고르곤"),null,null};
		System.out.println(Arrays.toString(circleArr)); // [null, null, null, null, null] 호출

		circleArr[0] = new Circle(1,"자바피자");

		
		int idx = 2;
		//prnArr(circleArr); // 출력함수
		//System.out.println(Arrays.toString(circleArr));
		
		//추가
		System.out.println("==============추가============");
		circleArr[++idx] = new Circle(5,"빅피자");
		prnArr(circleArr);
		
		//삭제
		System.out.println("==============삭제============");
		int delNum =1;
		circleArr[delNum] = null;
		for(int i = delNum;i<circleArr.length-1;i++) {
			circleArr[i] = circleArr[i+1];
		}
		prnArr(circleArr);
		
		//수정
		System.out.println("============수정==============");
		//0번지에 있는거 수정
		//radius = 4, name = "치즈피자" index = 0
		circleArr[0].setRadius(4);
		circleArr[0].setName("치즈피자");
		prnArr(circleArr);
	}

	private static void prnArr(Circle[] circleArr) {
		for(Circle c : circleArr) { // for문빼서 원소5(0~4)만큼 값 출력 [3.14,null,null,null,null]
			try {
				System.out.printf("%s %.2f %n",c.name,c.getArea());
			}catch(NullPointerException e) { // NullPointerException : null레퍼런스 참조할때 발생
				System.out.print("null");
			}
		}//for문 닫는괄호

	}
}
