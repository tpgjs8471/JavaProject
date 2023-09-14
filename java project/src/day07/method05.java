package day07;

import java.util.Scanner;

public class method05 {

	public static void main(String[] args) {
		/* 2~100까지의 소수를 출력
		 * 2~100까지 for문을 돌려서 메서드 호출하여 true 출력
		 */
		int num=abc();
		int count=0;
		for(int i=2;i<=100;i++) { // num 2~100까지
			count =0; //count 초기화 / 0부터 시작
			for(int b=1;b<=i;b++) { //약수를 구하기 위해 돌리는 값
				if(i%b==0)
					count++;			//count=count+1; //약수의 개수 (1,3) (1,13) ....
			}

			if(count==2) {
				System.out.print(i+" ");
			}
			
		}
	}
	
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단 (true /false)
	 * 소수 : 1과 자기자신만을 약수로 가지는 수 2 3 5 7 ...
	 * 리턴타입 : 
	 * 메개변수 :
	 * 메서드명 : abc
	 */
	public static int abc() {
		Scanner scan=new Scanner(System.in);
		
		for(int i=2;;) {
			System.out.println("정수를 입력하시오>");
			int num=scan.nextInt();
			System.out.println((num%i==1)?"소수":"거짓");
			
		return num;
	}
	}
	
}
