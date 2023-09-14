package day02;

import java.util.Scanner;

public class if02 {

	public static void main(String[] args) {
		/* 국어 영어 수학 점수를 입력받아서
		 * 합계 평군 평가를 출력
		 * 평가는 평균이 90 이상이면 A
		 * 80이상이면 B
		 * 70이상이면 C
		 * 나머지는 D
		 * 
		 * 입력값이 0보다 작거나 100보다 크면 잘못된 값입니다. 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("국어점수를 입력하시오 ");
		int k = scan.nextInt();
		if(k>100 || k<0) {
			System.out.println("잘못된 값입니다.");
		}
		System.out.println("영어점수를 입력하시오 ");
		int e = scan.nextInt();
		if(e>100 || e<0) {
			System.out.println("잘못된 값입니다.");
		}
		System.out.println("수학점수를 입력하시오 ");
		int m = scan.nextInt();
		if(m>100 || m<0) {
			System.out.println("잘못된 값입니다.");
		}
		
		int sum = 0;
		sum= k+e+m;
		double avr = 0;
		avr = sum/3.0;
		
		System.out.println("점수 합계 : "+sum);
		System.out.println("평균 : "+avr);
		
		if(avr>100 || avr <0) {
			System.out.println("잘못된 성적입니다");
		}
		else if(avr>=90) {
			System.out.println(" A입니다 ");
		}
		else if(avr>=80) {
			System.out.println(" B입니다 ");
		}
		else if(avr>=70) {
			System.out.println(" C입니다 ");
		}
		else{
			System.out.println(" D입니다");
		}
		
		scan.close();
		
		
	}

}
