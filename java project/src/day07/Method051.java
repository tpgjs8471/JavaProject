//package day07;
//
//import java.util.Scanner;
//
//public class Method051 {
//
//	public static void main(String[] args) {
//		/* 2~100까지의 소수를 출력
//		 * 2~100까지 for문을 돌려서 메서드 호출하여 true 출력
//		 */
//		for(int i=2;i<=100;i++) {
//			if(isprime(i)) {
//				System.out.println(i+" "); // 소수만 출력
//			}
//		}
//		//2~100까지의 소수의 합계
//		int sum=0;
//		for(int i=2; i<=100;i++) {
//			if(isprime(i)) {
//				sum+=i;
//			}
//		}
//		System.out.println("1~100 소수의 합= "+sum);
//		//값을 입력받아서 소수인지 아닌지 출력
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 입력");
//		int num=scan.nextInt();
//		if(isprime(num)) {
//			System.out.println("소수");
//		}
//		else {
//			System.out.println("소수 X");
//		}
//		
//	}
//	
//	
//	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단 (true /false)
//	 * 소수 : 1과 자기자신만을 약수로 가지는 수 2 3 5 7 ...
//	 * 리턴타입 : boolean
//	 * 메개변수 : 정수 => int num
//	 * 메서드명 : isprime
//	 */
//	
//	public static boolean isprime(int num) {
//		int cnt =0;
//		for(int i=1;i<=num;i++) { // i~num까지 반복하여 약수의 개수를 확인			
//			if(num%i==0) {
//			cnt++;
//			}
//			if(cnt==2) {
//				return true;
//			}
//			}		
//			return isprime;
//	}
//
//}
