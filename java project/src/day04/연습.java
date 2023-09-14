package day04;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 나 자신의 수만 가지는 수를 소수
		 * 소수 : 2 3 5 7 11 13 17 ...
		 */
		
		
		/* num를 입력받아서 num가 소수인지 아닌지 판별하여 출력
		 * 예를 들어 num = 13 =>? 소수입니다.
		 * num = 12 > 소수가 아닙니다.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		int num=0;
		int count=0;
//		for(int i=2;;) {
//			System.out.println("정수를 입력하시오");
//		num=scan.nextInt();
//
//		if(num%i==1) {
//			System.out.println("소수 입니다");
//		}
//		else if(num%i==0) {
//			System.out.println("소수가 아닙니다");
//
//	}
//		}
//	}
		
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				count=count+1;
//			}
//		}
//		System.out.println(count);
//		if(count==2) {
//			System.out.println("소수");
//		}else {
//			System.out.println("소수X");
//		}
		
		/* 2~100까지 중 소수만 출력 */
		//num=scan.nextInt();
		for(int i=2;i<=100;i++) { // num 2~100까지
			count =0; //count 초기화 / 0부터 시작
			for(int b=1;b<=i;b++) { //약수를 구하기 위해 돌리는 값
				if(i%b==0)
					count++;			//count=count+1; //약수의 개수 (1,3) (1,13) ....
			}
		//	System.out.println(count);

			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}
}
