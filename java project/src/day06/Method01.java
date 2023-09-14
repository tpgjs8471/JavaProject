package day06;

public class Method01 {

	public static void main(String[] args) {
		/* 메서드 : 기능 / 함수
		 * 접근제어자(제한자) : 접근할 수 있는 주체에 제한범위
		 * 리턴타입 : 메서드의 실행 결과로 받을 수 있는 정보의 값(자료형)
		 * 메서드 명 : 메서드의 이름 ==>소문자로 시작
		 * 메개변수 : 메서드를 실행하기 위해서 필요로 하는 값(자료형 변수형)
		 * 메서드 선언구현
		 * 접근제어자 리턴타입 메서드명(메개변수, 메개변수0{
		 * 구현;
		 * }
		 * 
		 * 메서드 선언 위치
		 * 클래스 안, 다다른 메서드 밖
		 */
		int sum= sum(3,5);
		System.out.println(sum);
		
		int sum1 = sum(sum,10);
		System.out.println(sum1);
		
		
		int arr=M(5,7);
		System.out.println(arr);
		
		sum2(10,20); // 결과를 다른값에 넣을 수 없다.

		
	}
//메서드 선언위치
	/*기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 알려줘야 하는 값 =>합(int)
	 * 메개변수 : 두 정수 => int num1, int num2
	 * 메서드명 : sum
	 * */
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴타임 : 곱
	 * 메개변수 : int X ,int Y
	 * 메서드명 : M
	 * 
	 */
	
	public static int M(int X,int Y) {
	int Z = X*Y;
	return Z;
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 리턴타입 : 없음 => (void)
	 * 메개변수 : 두 정수 (int num1, int num2)
	 * 메서드명 : sum2
	 */
	public static void sum2(int num1,int num2) {
		System.out.println(num1+num2);
		return; // 메서드 종료하는 역할
	}
	
	
}