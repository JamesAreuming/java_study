package kr.or.yi.java_study.ch03.array;

public class Study_20191203_03 {

	public static void main(String[] args) {
		int [] intArray;
		
		intArray = makeArray();
		
		prnArray(intArray);
	}

	private static void prnArray(int[] intArray) {
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}
	}

	private static int[] makeArray() {
		int [] temp = new int[4];
		for(int i=0;i<temp.length;i++) { // int [] temp = {0,1,2,3} 
			temp[i] = i;
		}
		return temp; // 배열을 통째고 넘겨주는게 아니고, 배열의 주소값을 넘겨줌
	}

}
