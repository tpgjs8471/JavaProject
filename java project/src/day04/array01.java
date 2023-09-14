package day04;

public class array01 {

	public static void main(String[] args) {
		/* 배열 : 같은타입 , 같은 의미를 가지는 변수의 집합( 창조변수 )
		 * -창조변수는 초기화가 미리 되어 있음. null or 0
		 * -기본형변수눈 초기화를 해주지 않음 직접 초기화를 해줘야 함.
		 * -배열 선언 방법 
		 * 타입[] 배열이름;
		 * 타입 배열이름[];
		 * 
		 * -배열 선언 & 초기화
		 * 타입[] 배열이름 = new 타입[길이]; // 가장 일반적인 방법
		 * 타입[] 배열이름 = new 타입[]{값, 값, 값, 값, 값....};
		 * 타입[] 배열이름 = {값, 값, 값, 값, 값....}; // 선언과 동시에 초기화를 할 때만 가능
		 * -배열의 길이는 0 이상이어야 한다.
		 * -배열의 길이는 length로 확인 할 수 있음.
		 * -배열의 시작 번지는 0번지부터 시작
		 * 배열[3]=> 0 1 2
		 * 
		 * 배열의 마지막 번지는 항상 length-1
		 * 
		 */
		
		
		int[] err;
		err= new int[5];
		int err1[];
		int err2[]= new int[] {1,2,3,4,5};
		
		System.out.println(err2[0]);
		System.out.println(err2[1]);
		System.out.println(err2[2]);
		System.out.println(err2[3]);
		System.out.println(err2[4]);
		
		for(int i=0;i<err2.length;i++) {
			System.out.print(err2[i]+" ");
		}
		System.out.println();
		System.out.println("--------------");
//		System.out.println(err2);
//		System.out.println(err1);
		
	
		int err3[]= {1,3,5};
		
		/*
		 *  배열을 사용하는 이유
		 *  반복문을 이용할 수 있기 때문에 편리함
		 *  관리가 쉽다.
		 *  
		 */
		
		err[0]=10;
		err[1]=20;
		err[2]=30;
		System.out.println(err[0]);
		System.out.println("--------------");
		for(int i=0; i<err.length; i++) {
			
			err[i]=(i*10)+10;
			
		}
		
		for(int i=0;i<err.length;i++) {
			System.out.println(err[i]);
		}
		
		/* 배열을 생성하고, 1 2 3 4 5로 입력하고
		 * 저장하고 출력
		 */
		System.out.println("--------------");
		int A[]=new int[5]; // 가장 일반적인 방식
		
		for(int i=0;i<A.length;i++) {
			A[i]=i+1;
			System.out.print(A[i]+" ");
		}
		
		System.out.println();
		System.out.println("--------------");
		
		
		
		
		int B[]=new int[18];
		
		for(int j=0;j<B.length;j++) {
			
			B[j]=j+1;
			
			if(B[j]%2==0) {
				System.out.print(B[j]+" ");
			}
		}
		
	}

}
