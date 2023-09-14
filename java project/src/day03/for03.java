package day03;

import java.util.Scanner;

public class for03 {

	public static void main(String[] args) {
		/* 구구단을 입력받아서 입력받은 구구단을 출력
		 * ex) 2 =>
		 * 2*1 =2
		 * 2*2 =4
		 * -----
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num=scan.nextInt();
		
		
		for(int i=1; i<=9; i++) {
			System.out.println(num+"X"+i+"="+(num*i));
		}
		
		scan.close();
	}

}

