package kr.or.yi.java_study.ch04;

import java.util.Arrays;
import java.util.Random;

public class Exam02 {

	public static void main(String[] args) {

		Student[] stdArr = new Student[11];
		System.out.println(Arrays.toString(stdArr)); // [numm .....]
		initArr(stdArr); // 정보넣고
		System.out.println(Arrays.toString(stdArr)); //[1 권수진 ....]

		Student findStd = new Student(); //

		findStd.setStdNo(3); //3번친구를 찾아라 : 장현서(배열인덱스 : 2번)
		int idx;
		idx = indexOf(stdArr, findStd);
//		int idx = indexOf(stdArr, findStd);
		System.out.println(stdArr[idx]); //장현서
		
		
		findStd.setStdNo(2); //3번친구를 찾아라 : 정아름(배열인덱스 : 1번)
		idx = indexOf(stdArr, findStd);
		System.out.println(stdArr[idx]); //정아름
		
		findStd.setStdNo(15); //15번친구 찾아라
		idx = indexOf(stdArr,findStd); // 존재하지 않는 학생이므로 -1
		//System.out.println(stdArr[idx]);

		if(idx == -1) {
			System.out.println("해당학생이 존재하지 않음");
		}
		//int idx = indexOf(stdArr,new Student(3)); // 3번 친구를 찾아달라
	}

	private static int indexOf(Student[] arr, Student find) { // idx
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getStdNo() == find.getStdNo()) { //arr[2].3 ==3
				return i;
			}
		}
		return -1;
	}

	private static void initArr(Student[] arr) { //랜덤 넣기
		Random rnd = new Random();
		String[] names = {"권수진","정아름","장현서","황태원","배진우","현재승","이동주","황하나","유경진","이상원","박인선"};
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Student(i+1, names[i], rnd.nextInt(60)+41, rnd.nextInt(60)+41, rnd.nextInt(60)+41);
		}
	}

}
