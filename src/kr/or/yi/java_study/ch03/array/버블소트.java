package kr.or.yi.java_study.ch03.array;

import java.util.Scanner;

public class 버블소트 {

   public static void main(String[] args) {
      int[] a = {5,4,3,2,1};
      int b;
      for(int i = 0 ; i < a.length ; i ++) {
         for(int j = 0 ; j < a.length -i -1 ; j ++) {
            if(a[j]>a[j+1]) {
               b = a[j];
               a[j] = a[j+1];
               a[j+1] = b;
            }
         }
      }
      
      for(int i = 0 ; i < a.length ; i ++) {
         System.out.print(a[i]);
      }
   }
}