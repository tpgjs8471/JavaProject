package day05;

import java.util.Scanner;

public class array04 {

	public static void main(String[] args) {
		/* 5자리의 숫자를 입력받아서 입력받은 숫자로 거꾸로 출력
		 * 각 자리의 합계 출력
		 * ex) 11456 > 65411 > 6+5+4+1+1
		 * ex) 19547 > 74591 > 7+4+5+9+1
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("5자리 숫자를 입력해주세요");
		int num=scan.nextInt();
		int arr[]=new int[5];
		int sum=0;
		
		// 나누기( / ), 나머지( % )
		// 12345 => %10 = 5 => 배열에 저장
		// 12345/10 => 정수만 저장
		// 1234 > %10 = 4 = 배열에 저장
		
		int i=0;
		
		while(num>0) { // 입력받은 num가 0보다 작아지면 false
			int b=num%10; // 마지막 자리를 나머지로 받기
			arr[i]=b;
			sum+=b;
			num=num/10; // 값저장 > 정수/정수 는 정수
			System.out.print(arr[i]);
			i++;	
		}
		System.out.println();
		System.out.println("합 : "+sum);
		
		
//		arr[0]=(num/10000);
//		arr[1]=(num%10000)/1000;
//		arr[2]=(num%1000)/100;
//		arr[3]=(num%100)/10;
//		arr[4]=(num%10)/1;
//		
//		//거꾸로 출력하기
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			System.out.print(arr[4-i]+" ");
//			sum +=arr[i];
//			
//		}
//		System.out.println();
//		System.out.println("합계는 : "+sum);
		
		
	}

}
