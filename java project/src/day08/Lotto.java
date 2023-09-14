package day08;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		/*
		 * 로또번호 생성 (1~45 랜덤생성)
		 * 로또번호 => 1~45까지 6개 = 사용자번호
		 * 당첨번호 => 1~4까지 7개 => 보너스번호
		 * 
		 * 로또번호 6자리  1 2 3 4 5 6
		 * 당첨번호 6자리+1자리 = 7자리 1 2 3 4 5 6 [7]
		 * 로또번호는 중복되면 안됨.
		 * 로또 등수 확인
		 * 1등 => 6자리 일치
		 * 2등=> 5자리 일치 +보너스번호 일치
		 * 3등 => 5자리 일치
		 * 4등 => 4자리 일치
		 * 5등 => 3자리 일치
		 * 꽝!
		 */
		
//		System.out.println("사용자 로또번호 입력");
//		user();
		System.out.println("로또번호");
		Random();
		System.out.println();
		
		
	}
	
	public static int[] Random() {
		int arr[]=new int[7];
		
		for(int i=0;i<arr.length-1;i++) {
			int random=(int)(Math.random()*10)+1;
			arr[i]=random;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
				j--;
				
				break;
				}
			}
			System.out.print(arr[i]+" "); // 컴퓨터 45랜덤 생성 및 7자리
		}
		int a=(int)(Math.random()*10)+1;
		for(int s=0;s<arr.length;s++) {
			arr[s]=a;
		}
		return arr;
	}
	
	public static void user() {
		Scanner scan=new Scanner(System.in);
		int[] arr2=new int[6];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scan.nextInt();
		}
		
	} // ====== 생성 중복 입력 끝
	
}
