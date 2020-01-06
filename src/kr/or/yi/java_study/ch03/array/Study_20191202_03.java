package kr.or.yi.java_study.ch03.array;

import java.util.Random;

public class Study_20191202_03 {

	public static void main(String[] args) {
		//1. 12명의 국어, 영어, 수학 점수를 담는 2차원 배열 선언
		//2. 12명의 이름을 담은 배열선언
		//3. 61~100 사이의 램덤한 값을 국어, 영어, 수학
		//4. 이름 국어 영어 수학 총점 평균을 각각 출력
		//5. 과목별 평균을 출력하시오
		 /*
		  * 이름    국어  영어  수학  총점     평균
		  * ===================================
		  * 정아름  90 90  90 270 90.00
		  * 
		  * ===================================
		  * 전체 60.00 60.00 60.00 180.00 60.00
		  * 
		  */
		
		//scoreAverage();
		Random rnd = new Random(); //랜덤 함수 : import java.util.Random;
		
		int [][] score = new int[12][3]; // 12행1열, 각 1행3열이 포함된 2차원 배열 만들기
		
		String [] name = {"정아름","권수진","황태원","장현서","배진우","현재승","박인선","이상원","권태헌","유경진","이동주","황하나"}; // 1행12열
		

		rnd.setSeed(123); 
		
		int kor =0; //국어
		int eng = 0; //영어
		int mat = 0; //수학
		
		int sum; //총점
		double avg; //평균
		
		int stSum = 0; // 과목 총 합계
		double stAvg = 0; // 총 학생들 평균
		
		/* int n = score.length; // 12명
		   int m = score[0].length; // 3과목 */
		
		
		System.out.println("=============================");
		System.out.println("이  름    국어    영어    수학      총점     평   균");
		System.out.println("=============================");
		for(int j=0;j<score.length;j++) { // 2차원배열                                                                                                             --> 행(12행)
			System.out.print(name[j]+"  ");
			sum=0;
			avg=0;
			for(int i=0;i<score[j].length;i++) {   //                                               --> 열(3열) / 
				score[j][i] = rnd.nextInt(40)+60; // 0<= nextInt(40) <40 / 60<= nextInt(40)+60 <100  랜덤점수 부여
				System.out.print(" "+score[j][i]+"  ");
				sum = sum+score[j][i];
				avg = sum/score[j].length;
				if(i==0) {
				kor = kor+score[j][0];
				}
				if(i==1) {
				eng = eng+score[j][1];
				}
				if(i==2) {
				mat = mat+score[j][2];
				}
			}
			stSum = kor+eng+mat;
			stAvg = stAvg+avg;
			System.out.printf("%d",sum); // 각 학생별 : 총점
			System.out.printf("  %.1f",avg); // 각 학생별 : 평균
			System.out.println();
		}
		System.out.println("=============================");
		System.out.printf("총합계  %d %d  %d |%d|  %n",kor,eng,mat, stSum);
		System.out.println("=============================");
		System.out.printf("총평균  %.1f %.1f %.1f    |%.1f|%n",(double)kor/12,(double)eng/12,(double)mat/12, stAvg/12);
		System.out.println("=============================");


		
	}

	private static void scoreAverage() {
		double score[][] = {{3.3,3.4},
				            {3.5,3.6},
				            {3.7,4.0},
				            {4.1,4.2}};
		
		double sum = 0;
		double yearSum = 0;
		
		for(int year =0;year<score.length;year++) { // year = 학년  , score.length = 4(0123)
			System.out.print(year+1+"학년");
			yearSum=0;
			for(int term =0;term<score[year].length;term++) { // term = 학기  , score[year].length = 2(0,1)
				System.out.print(score[year][term]+" ");
				sum = sum + score[year][term]; // 전체 평점 합
				yearSum = yearSum+score[year][term];	
			}
			System.out.printf("%.2f %n",yearSum/2.0);
		}
		
		//System.out.println(sum); // 29.8
		
		
		int n = score.length;  // 4(4학년)
		int m = score[0].length; // 2(1,2학기)    --> n*m : 4*2 = 8학기
		//System.out.printf("<%d학년>" 평점평균 : %.1f",);
		//System.out.printf("<%d학년> 평점평균 : %.1f ",n,sum/(n*m)); // 3.725
		
//		double a score[0][0];
//		System.out.println(a);
	}

}
