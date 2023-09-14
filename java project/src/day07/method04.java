package day07;

public class method04 {

	public static void main(String[] args) {
		/*
		 * 메서드 : 기능을 하기위한 코드 조각
		 * 
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 코드;
		 * return;
		 * ==== 실행이 안됨.
		 * }
		 * 
		 * return : 메서드에서 전달해야하는 값을 전달하는 역할
		 * 메서드에서 return을 만나면 리턴타입의 값을 전달하고, 메서드를 종료
		 */
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 return)
		 * 2. 배열을 전달 받아서 평균을 연산하는 메서드(평균을 리턴)
		 * 3. 배열의 정수 5개의 평균을 출력하는 메서드 (출력)
		 * 
		 * 메인에서는 어떠한 연산식이 있으면 안됨.
		 * 메서드간의 데이터 전달 및 호출만 있어야함
		 * 카페제출
		 */
		
		
		int arr[]=arr();
		double avr = avg(arr);
		print(arr,avr);
		
		
		

	}

	/*	리턴타입:
	 * 	메개변수:
	 *	메서드명: 
	 */
	//1~100 랜덤 정수5개 생성 배열 저장
	public static int[] arr() {
		int arr[]=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			
			int B=(int)((Math.random()*100)+1);
			arr[i]=B;
			System.out.print(" "+arr[i]);
		}
				return arr;
	}
	
	//평균값을 리턴
	public static double avg(int arr[]) {
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return (double)sum/arr.length;
		
	}
	
	
	//5개의 평균을 출력
		public static void print(int arr[],double avr) {
			System.out.println("5개의 랜덤 정수 값 :");
			
			for(int tmp : arr) {
				System.out.print(tmp+ " ");
			}
			System.out.println();// 줄바꿈
			System.out.println("평균: "+avr);
		}
		
		
	}
