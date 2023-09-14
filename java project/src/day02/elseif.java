package day02;

public class elseif {

	public static void main(String[] args) {
		/* 조건문 : 조건식이 참일경우 실행문을 실행하는것
		 * if문, switch문
		 * if(조건문) { 실행문; }
		 * 실행문이 한줄일 경우 {} 생략가능
		 * 조건식은 참일 때 실행문을 실행
		 */

		
		int num = 0;
		//num가 0보다 크면 양수
		
		if(num > 0) {
			System.out.println("양수");
		}
		if(num > 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		//num가 0보다 크면 양수 / 아니면 음수
		if(num>0) {
			System.out.println("양수");
		} else if (num==0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		//num가 0보다 크면 양수 (10보다 크면 10보다큽니다) / 아니면 음수 / 0이면 0입니다.
		
		if(num >= 10) {
			System.out.println("양수");
			if (num>10 ) {
				System.out.println("10보다 큽니다");
		}
		}else if(num < 0) {
			System.out.println("음수입니다");
		}else {
			System.out.println("0 입니다");
		}
		
		// num2 값을 지정하고 num2가 짝수인지 홀수인지 출력
		// num2 %2 == 0 
		int num2 = 15;
	
		if(num2%2==0) {
			System.out.println(num2+ ": 짝수");
		}
		else {
			System.out.println(num2+ ": 홀수");
		}
		
		
		
	}
}