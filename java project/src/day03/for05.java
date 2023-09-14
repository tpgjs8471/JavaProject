package day03;

import java.util.Scanner;

public class for05 {

	public static void main(String[] args) {
		/* 최소 공배수
		 * 공배수 : 공통된 배수
		 * 
		 * 10 ; 10 20 30 40 50 60
		 * 30 : 30 60 90 120 
		 * 공배수 : 30 60 90 ----
		 * 
		 * 최소 공배수 : 30
		 */

		
		
		int num1=2;
		int num2=9;
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("num1를 입력하시오");
//		int num1=scan.nextInt();
//		System.out.println("num2를 입력하시오");
//		int num2=scan.nextInt();
		
		//for(int i=1;;i++) {
		for(int i=num1 ;; i+=num1) {
			int a=num1*i;
			int b=num2*i;
			
			//if(a%num1==0 && b%num1==0) {
			if(i%num1==0 && i%num2==0) {
				System.out.println("최소 공배수 : "+i);
				break;
			}
		}
		
		
	}

}
