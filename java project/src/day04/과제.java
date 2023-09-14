package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고
		 * 정수의 합계와 평균을 출력
		 * 최고점수
		 * 입력 => Scanner
		 * 배열 생성
		 * for문을 활용하여 입력받은 점수를 저장
		 * 최대값 if / Math.max
		 */
		
		int T=0;
		double R=0;
		int A[]=new int[5];
		int P=0;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("5명의 점수를 입력 하세요");
		
		
		for(int i=0;i<A.length;i++) {
			
			int num=scan.nextInt();
			A[i]=num;
			T=T+A[i];
			R=T/5.0;
			P=Math.max(num, P);
		}
		System.out.println("합계 : "+T);
		System.out.println("평균 : "+R);
		System.out.println("최고점수"+P);

	}

}
