package day07;

import java.util.Scanner;

public class method06 {

	public static void main(String[] args) {
		/*
		 * 구구단 출력
		 * 단 1개를 주고 구구단 출력 ===
		 */
		//2~9 까지 반복하여 모든 단을 출력
		
		Scanner scan=new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int num=scan.nextInt();
		mul(num);
		System.out.println("2~9단까지");
		for(int i=2;i<=9;i++) {
			mul(i);
			System.out.println();

		}
		System.out.println("-----------");

	}
	
	// 기능 : 단이 주어지면 그 단의 구구단을 출력 ( return X)
	// 2*8=16
	// 2*9=18
	
	public static void mul(int num){
		
		for(int i=1;i<=9;i++) {
			System.out.println(num+"X"+i+"="+(num*i));
		}
		
	}


}
