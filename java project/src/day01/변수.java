package day01;

public class 변수 {

	public static void main(String[] args) {
		/* 변수 선언
		 * 자료형(타입) 변수명;
		 * 
		 * 변수선언 + 초기화
		 * 자료형(타입) 변수형 - 값;
		 * */

		int num = 123; // 선언과 초기화
		System.out.println(num);
		// sysout + crtl + space 
		
		//int num=456; 중복선언 불가능
		
		num = 456; // =대입연산자 (앞의 변수에 뒤에있는 값을 저장 (덮어쓰기))
		System.out.println(num);
		
		int num1=78 , num2=45, num3=89; // 같은 자료형에서는 가능
		num1=789;
		System.out.println(num1);
		
		// 8개의 기본 자료형은 지역변수 범위(scope) { }
		
		//명령어{}
		int a =0;
		if(true) { 
			a = 10;
			System.out.println(a);
		}
		System.out.println(a);
		
		//char 한글자만 저장 가능 char= '';
		char ch= 'a'; // "=> 문자열string / '' => 한글자 char
		byte b=1;
		boolean boo = true; //true, false 만 사용가능
		
		// float / long 자료형은 접미사를 반드시 붙여야 인식함
		//float(F f) / long(L l)
		float f= 1.2F;
		long l= 1L;
		
		num2=010; // 8진수로 인식 ( 0~7까지) 8=>10 으로인식
		num3=0x10; // 16진수 인식 ( 0~15, ABCDEF 까지) 16=>10으로 인식
		
		// + - * / % 
		
		//국어점수(kor) 영어점수(eng) 수학점수(math) 변수 선언
		//값을입력하고 세 점수의 값을 콘솔에 합 입력
		
		
		int k = 50;
		int e = 50;
		int m= 50;
		int sum = k+e+m;
		
		System.out.println("국어, 영어, 수학점수 합계:"+sum);
		System.out.println("합계 : "+(k+e+m));
	}
}
