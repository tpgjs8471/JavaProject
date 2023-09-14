package day04;

import java.util.Scanner;

public class 과제02 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고
		 * 정수의 합계와 평균을 출력
		 * 최고점수
		 * 입력 => Scanner
		 * 배열 생성
		 * for문을 활용하여 입력받은 점수를 저장
		 * 최대값 if / Math.max
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		int size = 5;
		int arr[]= new int[size];
		int sum=0;
		double avg=0;
		int max=0;
		int max1=0;
		//최소값
		int min=100;
		int min1=100;
		
		System.out.println("점수를 입력해주세여(5명)");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			sum+=arr[i]; // 0 + 78 // 0 + 78 + 98 // 0 + 78 +98 + 73...(누적)
			//최대값
			if(max<arr[i]) {
				max=arr[i]; // 0 <=78 <=98 큰값으로 덮어씌움
			}
			//최소값
			if(min>arr[i]) {
				min=arr[i];
			}
			max1=Math.max(max,arr[i]);
			min1=Math.min(min,arr[i]);
		}
		avg=(double)sum/arr.length;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최대점수 : "+max);
		System.out.println("최대점수 : "+max1);
		System.out.println("최소점수 : "+min);
		System.out.println("최소점수 : "+min1);
		
	}

}
