package day07;

import java.util.Scanner;

public class method07 {

	public static void main(String[] args) {
		/*
		 * 숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드
		 * 
		 * ex) 3 , * = ***
		 * 5, o = ooooo
		 * 7, ☆ =☆☆☆☆☆☆☆
		 * 
		 * main에서 숫자와 기호를 입력받아 메서드호출로 출력
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력");
		int num=scan.nextInt();
		System.out.println("기호를 입력");
		String str=scan.next();
		kor(num,str);
		

	}
	
	public static void kor(int num,String str) {
		
		for(int i=1;i<=num;i++) {
			System.out.print(str);
		}
		
	}
	
	
	

}
