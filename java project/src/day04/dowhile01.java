package day04;

import java.util.Scanner;

public class dowhile01 {

	public static void main(String[] args) {
		/* do~while : 반복문 중 하나
		 * 
		 * do{
		 * 실행문;
		 * }
		 * while(조건식);
		 * 
		 * for , while문은 조건식이 처음부터 false면 한번도 실행이 안될 수 있음
		 * do~while은 실행문을 먼저 실행하고 나서 조건식을 비교하녀 반복 여부를 결정
		 * 조선식이 false 더라도 무조건 1번은 실행함.
		 * 
		 * 메뉴 생성시 많이 사용
		 */
		
		
		Scanner scan=new Scanner(System.in);
		/* 1. 저장하기
		 * 2. 새로만들기
		 * 3. 종료하기
		 */
		
		int menu =0;
		
		do {
			System.out.println("-menu-");
			System.out.println("1.저장하기");
			System.out.println("2.새로만들기");
			System.out.println("3.종료하기");
			System.out.println("메뉴입력");
			
			menu=scan.nextInt();
			
			switch(menu) {
			case 1: System.out.println("저장합니다");
			break;
			case 2: System.out.println("새로만듭니다");
			break;
			case 3: System.out.println("종료합니다");
			break;
			case 4: System.out.println("메뉴입력");
			break; 
			}
			
			
			
		}while(menu != 3); // true면 반복
		

	}

}
