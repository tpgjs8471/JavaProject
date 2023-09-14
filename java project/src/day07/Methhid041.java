package day07;

public class Methhid041 {
	public static void main(String[] args) {
		
		avr();
		
		
		
		
		
	}

	
	
	//정수 5개 랜덤 생성
	//리턴 타입 : 정수배열 int[]
	//매개 변수 : X
	//메서드명 : random
	public static int[] random() {
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	//평균값 계산
	//리턴타입 : 평균을 리턴 > double
	//매개변수 : int arr[]
	//메서드명 : avr
//	public static double avr(int arr[]) { // 랜덤수를 생성한 배열이 이미 있다
//		//계산만~
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		return (double) sum/arr.length;
//	}
	
	//출력
	//리턴타입 : X
	//매게변수 : 정수배열, 평균 => int arr[], doble acr
	//매서드명 : print
	public static void print(int arr[],double avr) {
		System.out.println("5개의 랜덤 정수 값 :");
		
		for(int tmp : arr) {
			System.out.print(tmp+ " ");
		}
		System.out.println();// 줄바꿈
		System.out.println("평균: "+avr);
	}
	
	/* 
	 * 메개변수 : x
	 * 리턴타입 : x
	 * 메서드명 : avg
	 */
	//메서드 오버로딩 : 같은 메서드명을 쓰더라도 매개변수의 종류나 개수가 다르면 저장가능항
	public static void avr() {
		int arr[]=random(); //랜덤배열 생성
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		double avr=(double)sum/arr.length;
		// print 호출하여 출력
		print(arr,avr);
		
	}
	
	
}
