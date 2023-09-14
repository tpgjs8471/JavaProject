package day01;

public class 자료형변환 {

	public static void main(String[] args) {
		/* 자료형 변환 : casting
		 * 자료형(변수형 타입)
		 * a = b : a의 자료형과 b의 자료형이 맞지 않는다면 오류
		 * 자료형 변환을 통해서 양쪽의 자료형을 맞춰주는 역할
		 * 자동 자료형 변화 : 자료형 변환시 생략해도 문제가 되지않는 상황
		 * 크기가 큰 자료형 = 크기가 작은 자료형 
		 * 
		 * 영시적 자료형 변확 : 리터널 값 앞에
		 */
		
		byte num = 10;
		int num1 = num; // int = byte 자동 형병환 가능
		
		double num2 = 10.2;
		
		 num1 = (int)num2; //int=double 영시적 형변환 
		 System.out.println(num1);
		 
		 int num3 = (int)1.2; // 소수점 날라감
		 System.out.println(num3);
		 
		 //문제 국어 영어 수학 세값의 합계와 평균을 출력 ( 소수점 살려서 )
		 
		 int k = 71;
		 int e = 75;
		 int m= 72;
		 int sum = k+e+m;
		 double kem = (double)(k+e+m)/3;
		 double avr = (double)sum/3;
		 //자료형이 double이고 나0누는 값이 +이면 무한대
		 // 자료형이 int이고 나누는값이 0이면 예외발생
		 System.out.println("합계:"+sum+"평균:"+avr);
		 System.out.println(kem);
		 
		 
	}

}
