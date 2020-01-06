package kr.or.yi.java_study.ch04;

import java.util.Scanner;

public class Student2 {

	public static void main(String[] args) {
		 public int studentNum;     // 학번
		    public int kor;            // 국어
		    public int eng;            // 영어
		    public int math;        // 수학
		    
		    public Student2(int stuNum){ // Student class 생성자
		        this.studentNum = stuNum;
		    }
		 
		    public void pointInsert(Scanner sc){ // 학생 성적을 입력 받는 메소드
		        
		        System.out.print(studentNum+" 번째 학생 국어 >>");
		        kor = Integer.parseInt(sc.nextLine());
		        
		        System.out.print(studentNum+" 번째 학생 영어 >>");
		        eng = Integer.parseInt(sc.nextLine());
		        
		        System.out.print(studentNum+" 번째 학생 수학 >>");
		        math = Integer.parseInt(sc.nextLine());
		        
		        System.out.println("-----------------------");
		        
		    }
		 
		    public void printsumAvr(){ // 총점과 평균을 구하고 총 결과 출력
		        
		        System.out.print(studentNum+"\t"+kor+"\t"+eng+"\t"+math+"\t");
		        System.out.print((kor+eng+math)+"\t"+(kor+eng+math)*100/3/100.0);
		        System.out.println();
		    }
		 
		}


		