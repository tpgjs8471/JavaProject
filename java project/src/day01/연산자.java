package day01;

public class 연산자 {

	public static void main(String[] args) {
		// 연산자 정리
		/*대입 연산자 : =, =+, -=
		 * =을 기준으로 오른쪽에 있는 값을 왼쪽의 변수에 저장/덮어써라
		 * a=b : b를 a에 넣어라 저장해라
		 * a는 반드시 변수여야만 한다.
		 * 1=a는 안된다 
		 * a+=1 ; => a=q+1; // 기존의 a값에 1을 더해서 a에 저장해라\
		 * */
		
		int a = 1;
		System.out.println(a);
		a = a+1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		
		
		
		a-=1;
		System.out.println(a);
		int b = 10;
		a=b;
		System.out.println(a);
		
		// 증강연산자 : ++1증가 --1감소
		
		a++; // a = a+1; 과 같다
		System.out.println(a++); // 11 -> 12 12출력후 13 증가
		System.out.println(++a); // 13 -> 1증가 후 출력
		
		//산술연산자 : + - * % 사칙연산
		/* 나누기 (/)
		 * 정수/정수 = 정수 (10/3=3) 소수점 버림
		 * 정수/실수 = 실수 (10/3.0= 3.3333333)
		 * 실수/실수 = 실수 
		 * 값/0 = 예외 발생
		 */
		
		System.out.println("3+2="+(3+2));
		System.out.println("3-2="+(3-2));
		System.out.println("3*2="+(3*2));
		System.out.println("3/2="+(3/2.0));
		System.out.println("3&2="+(3&2));
		// % 나머지 연산 : 배수나 약수를 구할 때 , 짝수/홀수 구별할 때
		/* 비교연산자 : 비교 연산의 결과는 반드시 true / false
		 * >= (이상) , <=(이하) , >(크다), <(미만)
		 * ==같다 , != 같지않다
		 * && and 둘다 true 여야 true 리턴
		 * || or 둘중 하나가 true 면 true 리턴
		 */
		
		System.out.println("3>2 ? " +(3>2));
		System.out.println("3<2 ? " +(3<2));
		System.out.println("3==2 ? " +(3==2));
		System.out.println("3!=2 ? " +(3!=2));
		
		System.out.println("&& 연산자 : "+ (3>2 && 4<3));
		System.out.println("|| 연산자 " + (3>2 || 4<3));
		
		/* 조건석택 연산자 : 3항 연산자
		 * (조건식)? true : false;
		 */
		System.out.println((3<2)? " 참 " : " 거짓입니다");
		
		
		// num가 짝수인지 홀주인지 출력 조건선택 연산자를 사용
		
		int num = 11;
		
		System.out.println( (num%2==0)? "짝수" : "홀수");
		// string : 문자열을 저장하는 클래스
		String result = (num % 2 ==0)? "짝수" : "홀수" ;
		System.out.println(num+ "은"+result);
		
		
	}

}
