package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* un / down 게임
		 * 1~50 사이에 랜덤 수를 생성하여 맞추는 게임
		 * 
		 * ex) 컴퓨터가 랜덤 수 생성 : 35
		 * 입력> 10
		 * up
		 * 입력> 20
		 * up
		 * 입력> 40
		 * down
		 * 입력> 35
		 * 정답입니다.
		 */
		
		int A=(int)(Math.random()*50)+1;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1~50사이의 정수를 입력하시오");
		
		int num=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("입력>");
			System.out.println("기회는 5번");
			num=scan.nextInt();
			if(num==A) {
				System.out.println("정답입니다.");
				break;
			}
			else if(num<A) {
				System.out.println("UP"+i+"번 실행");
			}
			else {
				System.out.println("DOWN"+i+"번 실행");
				
			}
		}
		System.out.println("기회 소진");
//	a:	for(;;) {
//			
//			System.out.println("입력");
//			int B=scan.nextInt();
//			
//			for(;;) {
//			if(A==B) {
//				System.out.println("정답입니다");
//				break a;
//			}
//			if(A>B) {
//				System.out.println("UP 다시 입략");
//
//				break;
//				
//			}
//			if(A<B) {
//				System.out.println("DOWN 다시 입력");
//
//				break;
//			}
//		}
//	}
		
		
		
}
}
