package kr.or.yi.java_study.ch04;

import java.util.Scanner;

public class Manage {
	String[] sub = {"학번","국어","영어","수학","총점","평균"};
    String ver;
 
    public Manage(){ // Manage 생성자 ver 초기화
        ver = "3.0.0";
    }
    
    public static void main(String[] args) {
        
        Manage manager = new Manage();
        manager.title();    // title을 불러 온다.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("총 학생의 수: ");
        int num = Integer.parseInt(sc.nextLine());    // 관리할 학생 수를 입력 받는다.
        
        Student[] stu  = new Student2[num];            // 입력 받은 학생 수 만큼 Student 객체를 stu 이름으로 배열 생성
        
        for(int i = 0; i < num; i++){ // 학번 부여
            stu[i] = new Student2(i+1);
//            System.out.println(stu[i].studentNum); // 학생 수 출력 확인
        }
        
        for(int i = 0; i < stu.length; i++){ // 점수 입력
            stu[i].pointInsert(sc);
        }
        
        for(int i = 0; i < manager.sub.length; i++){ // 점수 입력
            System.out.print(manager.sub[i]+"\t");
        }
 
        System.out.println();
        
        for(int i = 0; i < stu.length; i++){ // 점수 입력
            stu[i].printsumAvr();
        }
        
 
 
    } // main end
    
    public void title(){
        System.out.println("-------------------------");
        System.out.println("학생성적관리(V"+ver+")");
        System.out.println("-------------------------");
    } // title end
 
} // class end

