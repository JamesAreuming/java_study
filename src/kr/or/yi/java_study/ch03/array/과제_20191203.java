package kr.or.yi.java_study.ch03.array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class 과제_20191203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random(1234567);
		//문제2();
		//문제3(sc);
		//문제4(sc);
		//문제5(sc);
		//문제6(sc);
		//문제7(rnd);
		//문제8(sc);
		//문제8_1(sc);
		//문제9(rnd);
		 //문제10(rnd); // 로또번호 생성
		 //문제10_1();
		
		 //문제14(sc);
		
		 //문제15(sc);

		문제16(sc);
		
		//문제16_1(sc);

		
		 
		
		
		
		sc.close();

	}

	public static void 문제16_1(Scanner sc) {
		String [] com = {"가위","바위","보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다 >>> ");
		String res;
		int comResIdx;
		do {
			System.out.print("가위 바위 보! >> ");
			res = sc.nextLine();
			if(res.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}
			comResIdx=(int)(Math.random()*3);
			System.out.printf("사용자 : %s 컴퓨터 : %s%n",res,com[comResIdx]);
			resultWinOrLose(res,com[comResIdx]);
		}while(true);
	}

	private static void resultWinOrLose(String user, String com) {
		if(user.equals("가위")) {
			if(com.equals("가위")) {
				System.out.println("비김");
			}else if(com.equals("바위")) {
				System.out.println("컴퓨터가 이겼음");
			}else {
				System.out.println("사용자가 이겼음");
			}
		}else if(user.equals("바위")) {
			if(com.equals("가위")) {
				System.out.println("사용자가 이겼음");
			}else if(com.equals("바위")) {
				System.out.println("비김");
			}else {
				System.out.println("컴퓨터가 이겼음");
			}
		}else {
			if(com.equals("가위")) {
				System.out.println("컴퓨터가 이겼음");
			}else if(com.equals("바위")) {
				System.out.println("사용자가 이겼음");
			}else {
				System.out.println("비김");
			}
		}
	}

	public static void 문제16(Scanner sc) {
		String [] str = {"가위", "바위", "보"};
		
		String user; // 사용자
		String com; // 컴퓨터
		
		int comP; //컴퓨터가 내는 것
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		do {
			System.out.print("가위 바위 보! >>> ");
			user = sc.next(); // 사용자가 입력
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			comP = (int)(Math.random()*3);
			
			com=str[comP];
			
			if(user.equals("가위")) {
				if(str[comP].equals("가위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
					continue;
				}
				else if(str[comP].equals("바위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 졌습니다.");
					continue;
				}
				else if(str[comP].equals("보")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 이겼습니다.");
					continue;
				}
			}
			else if(user.equals("바위")) {
				if(str[comP].equals("가위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 이겼습니다.");
					continue;
				}
				else if(str[comP].equals("바위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
					continue;
				}
				else if(str[comP].equals("보")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 졌습니다.");
					continue;
				}
			}
			else if(user.equals("보")) {
				if(str[comP].equals("가위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 졌습니다.");
					continue;
				}
				else if(str[comP].equals("바위")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 이겼습니다.");
					continue;
				}
				else if(str[comP].equals("보")) {
					System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
					continue;
				}
			}
			System.out.print("사용자 = "+user+" , 컴퓨터 = "+com+" ");
		}while(true);
		System.out.println("========== 프로그램이 종료 되었습니다 ===========");
	}

	public static void 문제15(Scanner sc) {
		while(true) {
             System.out.print("곱하고자 하는 두 수 입력 >> ");
             try {
               int n = sc.nextInt();
               int m = sc.nextInt();
                System.out.print(n + "x" + m + "=" + n*m);
                break;
             }catch(InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다.");
                sc.nextLine(); // 포인트!
             }
          }
	}

	public static void 문제14(Scanner sc) {
		String [] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"}; // 0 1 2 3 4
		int [] score  = {95, 88, 76, 62, 55}; // 0 1 2 3 4
		
		String name;
		int i =0;

		while(true) {
			System.out.print("과목 이름 >> ");
			name = sc.next();
			if(name.equals("그만")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			for(i=0;i<course.length; i++) { //5
				if(course[i].equals(name)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;
				}
			}
			if(i == course.length) { // 5
				System.out.println("없는 과목입니다.");
			}
		}
	}

	public static void 문제8_1(Scanner sc) {
		System.out.print("정수 몇개?");
		int n = sc.nextInt();
		if(n<=0||n>100) {
			System.out.println("1~100사이로 입력");
			sc.close();
			return;
		}
		
		int [] intArray = new int[n];
		int r;
		for(int i=0;i<intArray.length;i++) {
			r = (int)((Math.random()*100)+1);
			if(isDuplicate(r,intArray,i)) {
				i--;
				continue;
			}
//			for(int j=i-1;j>-1;j--) { //중복을 검사
//				if(intArray[j]==r) {
//					i--;
//					continue;
//				}
			intArray[i] = r;
		}
		
		Arrays.sort(intArray);
		for(int e : intArray) {
			System.out.print(e+" ");
		}
		}


	private static boolean isDuplicate(int key, int[] intArray, int i) {
		for(int start = i;start>-1;start--) {
			if(intArray[start]==key) {
				return true;
			}
		}
		return true;
		
	}

	private static void 문제10_1() {
		int[][] intArray = new int[4][4];
		 Random rnd1 = new Random(1234567);
		 int row;
		 int col;
		 int count = 0;
		 for(int i=0;count<10;i++) {
			 row = rnd1.nextInt(4);
			 col = rnd1.nextInt(4);
			 if(intArray[row][col] !=0) {
				 continue;
			 }else {
				 intArray[row][col] = rnd1.nextInt(10)+1;
				 count++;
			 }
		 }
		 System.out.println(count);
		 System.out.println(Arrays.deepToString(intArray));
	}

	private static void 문제10(Random rnd) {
		//rnd.setSeed(0);
		int [][] arr = new int[4][4];
		//System.out.println(Arrays.deepToString(arr));
		for(int j =0;j<arr.length;j++) { // 행
			for(int i=0;i<arr[0].length;i++) {  //열
				arr[j][i] = rnd.nextInt(10)+1;
				if((j*i)>0 && (j*i)<4) {
					arr[j][i] =0;
				}
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		

	}

	private static void 문제9(Random rnd) {
		int [][] arr = new int[4][4];
		//rnd.setSeed(0);
		//System.out.println(Arrays.deepToString(arr));
		
		for(int j=0;j<arr.length;j++) {
			for(int i=0;i<arr[0].length;i++) {
				arr[j][i] = rnd.nextInt(10)+1;
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		//System.out.println(Arrays.deepToString(arr));
	}

	private static void 문제8(Scanner sc) { //searchKey
		Random rnd = new Random();
		rnd.setSeed(0); //중복X
		
		System.out.print("정수 몇개? >>> ");
		int input = sc.nextInt();
		
		int [] arr = new int[input];
		//System.out.println(Arrays.toString(arr));
		 for(int i=0;i<arr.length;i++) {
			arr[i] = rnd.nextInt(100)+1; // 1~100까지 범위 정수
			System.out.print(arr[i]+" ");
		}
		 
		 
		//System.out.println(Arrays.toString(arr));
	}

	private static void 문제7(Random rnd) {
		//rnd.setSeed(0); 
		int [] a = new int[10];
		//System.out.println(Arrays.toString(a));
		int sum = 0;
		double avg = 0;
		for(int i=0;i<a.length;i++) {
			a[i] = rnd.nextInt(11); // 0~10까지 랜덤한 숫자 넣기
			sum = sum + a[i];
			avg = (double)sum/a.length;
			//System.out.print(a[i]+" ");	
		}
		System.out.println("랜덤한 정수들 : "+Arrays.toString(a));
		System.out.printf("합계 : %d / 평균 : %.1f",sum,avg);
	}

	private static void 문제6(Scanner sc) {
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		//System.out.println(Arrays.toString(unit));
		
		System.out.print("금액을 입력하세요 >>> ");
		int won = sc.nextInt();
		
		/*for(int i=0;i<unit.length;i++) { //01234567
			System.out.println(unit[i]+"원짜리 : "+won/unit[i]+"개");
			 won = won%unit[i];  // L.V = R.V
		}*/
		
		for(int i=0;i<unit.length;i++) {
			int res = won/unit[i];
			if(res>0) {
				System.out.println(unit[i]+"원 짜리 : "+res+"개");
				won = won%unit[i];
			}
		}
	}


	private static void 문제2() {
		int [][] n = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		//System.out.println(Arrays.deepToString(n));
		
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}


	private static void 문제5(Scanner sc) {
		int [] intArray = new int[10];
		
		System.out.print("양의 정수 10개를 입력하세요 >>> ");
		
		
		for(int i=0;i<9;i++) {
			intArray[i] = sc.nextInt();
			if(i==0) {
				System.out.print("3의 배수는");
			}
			if(intArray[i]%3==0) {
				System.out.print(intArray[i]+" ");
			}
		}

	}


	private static void 문제4(Scanner sc) {
		System.out.print("소문자 알파벳 e를 입력하세요 >>> ");
		
		char alpha = sc.nextLine().charAt(0); // char(인수), 0번째 문자를 읽어
		
		for(int j=96;j<alpha;j++) {
			for(int i=97;i<(alpha-j)+97;i++) {
				System.out.print((char)i);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------");
		
		/*System.out.print("소문자 알파벳 하나만 입력 >>>");
		
		String s = sc.next();
		
		if(s.length() !=1) {
			System.out.println("알파벳 하나만 입려하세요.");
			sc.close();
			return;
		}
		
		char ch = s.charAt(0);
		if(ch<'a' || ch >'z') {
			System.out.println("알파벳 소문자만 입력하에요.");
			sc.close();
			return;
		}
		for(char i =ch;i>='a';i--) {
			for(char j='a';j<=i;j++)
			System.out.println(j);
		}
		System.out.println();*/
	}


	private static void 문제3(Scanner sc) {
		System.out.print("5를 입력하세요 >>> ");
		
		int a = sc.nextInt();
		
		for(int j=0;j<a;j++) {  // j<5
			 for(int i=0;i<a-j;i++){  //i<5-j
				 System.out.print("*");
				 //System.out.print(i);
			}
			System.out.println();
		  }
	}

}
