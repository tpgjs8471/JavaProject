package day02;

import java.util.Scanner;

public class 입력 {

	public static void main(String[] args) {
		/* 콘솔에 입력 : 콘솔에서 값을 입력받는 것을 의미
		 * scanner 클래스 => 콘솔에서 값을 입력받을 수 있게 해주는 클래스
		 */
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자(정수)를 입력하시오");
//		int num = scan.nextInt();
//		System.out.println("내가 입력한 수 : "+num);
//		
//		//콘솔에서 숫자를 하나 입력받은 수가 찍수 인지 홀수인지 출력
//		
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다");
//		}
//		else {
//			System.out.println("홀수입니다");
//		}
//		
//		scan.close(); 
		
		//숫자를 입력받아 양수인지 음수인지 0인지 판별하여 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력하시오");
		int num = scan.nextInt();
		System.out.println("내가 입력한 수 : "+num);
		
		
		if(num>0) {
			System.out.println("양수입니다");
		}
		else if(num == 0) {
				System.out.println("0입니다");			}
		
		else {
			System.out.println("음수입니다");
		}
		
		System.out.println("-------------");
		System.out.println("실수 입력 > ");
		double num3 = scan.nextDouble();
		System.out.println("실수 입력 > "+num3);
		
		System.out.println("한글잡 입력 > ");
		// next() : 문자열 / charAt() : 문자열 증 index 번지 한글자 추출
		//index 번지는 0부터 시작
		 char ch = scan.next().charAt(0); // 문자열 입력받는 형태
		 System.out.println("한글자 > "+ ch);
		 
		 //문자열 입력 next()는 공백을 포함하지 않음
		 
		 System.out.println("문자열 입력 > ");
		 String s = scan.next();
		 System.out.println("문자열 > "+ s);
		 
		 scan.nextLine(); // enter 처리용
		
		// 여러문자 입력 : nextline()는 공백을 포함함
		System.out.println("여러문자 입력 > ");
		String str= scan.nextLine();
		System.out.println("여러문자 > "+str);
		
		
		scan.close();
	}

}
