package kr.or.yi.java_study.ch03.array;

	import java.util.Scanner;

	public class 과제_20191205_2진수 {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      Jinsu(sc);
	      sc.close();
	   }

	   private static void Jinsu(Scanner sc) {
	      int ya=sc.nextInt();
	      String sum="";
	      int sum2=0;
	      int sum3=ya;
	      for(int i=0;i<sum3;i++) {
	         sum=(ya%2)+sum;
	         sum2=ya/2;
	         ya=sum2;
	         if(ya==1) {
	            break;
	         }
	      }
	      if(ya==1) {
	         System.out.println(ya+sum);
	      }
	      else {
	         System.out.println(ya+sum);
	      }
	   }
	}