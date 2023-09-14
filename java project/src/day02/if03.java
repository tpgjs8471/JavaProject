package day02;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {
		/* 수를 입력받아서 2의 배수가 맞으면 2의배수 입니다.
		 * 3의 배수가 맞으면 3의 배수 입니다.
		 * 
		 * import 단축기 : crtl + shift + o
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		int num=scan.nextInt();
		
		if(num%2==0 && num % 3 ==0) {
			System.out.println("2와 3의 배수입니다.");
		}
		else if(num%2==0) {
			System.out.println("2의 배수입니다.");
		}
		else if(num%3 ==0) {
			System.out.println("3의 배수입니다");
		}
		else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
		
		scan.close();
	}

}
