package kr.or.yi.java_study.ch03.array;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] intArr = {5,4,3,2,1}; // 0~5 : 6
		
		prnArray(intArr); // 5,4,3,2,1 출력
		
		sort(intArr); // 정렬수행
		prnArray(intArr); // 1,2,3,4,5   -- 중첩루프
		
		//swap , 버블소트
		
		// i    0 1
		// 0    5 4 3 2 1 
		// 1    4 5 3 2 1
		// 2    4 3 5 2 1
		// 3    4 3 2 1 5
	}

	private static void sort(int[] intArr) {
		int b;
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr.length-i-1;j++) {
				if(intArr[j]>intArr[j+1]) {
					b=intArr[j];
					intArr[j]=intArr[j+1];
					intArr[j+1]=b;
				}
			}
		}
		
	}

	private static void prnArray(int[] intArr) {
		for(int i=0;i<intArr.length;i++) { // 0<1 1<2 2<3 3<4 5<6
			System.out.printf(" %d",intArr[i]);
	    }
		System.out.println();

}
}