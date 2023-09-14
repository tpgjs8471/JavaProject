package day06;

public class Method02 {

	public static void main(String[] args) {
		/*메서드를 활용하여 계산기 만들기
		 * 
		 * 메서드는 + - * % /
		 * 두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
		 * +일때 호출  = 메인 출력
		 * -일때 호출  = 메인 출력
		 * *일때 호출  = 메서드 출력
		 *  / 일때 호출  =메서드 출력 => 리턴 double
		 *  %일때 호출  =메서드 출력
		 */
//		int sum=sum(3,5);
//		System.out.println(sum);
		int min=min(3,5);
		System.out.println(min);
		mul(3,5);
		double num3=avr(10,5);
		System.out.println(num3);
		per(3,5);
		int method01 =Method01.sum(10,30); // Method01 클래스에서
		System.out.println(method01);
		
		//다른 클래스에 있는 메서드를 사용
		//클래스명.메서드명
		//클래스  => 정의서 => 객체를 생성해서 메서드를 사용
		//현재 시점에서 객체 생성없이 메서드를 사용할수 있는 이유는 = static
		//static이 없는경유 = 선언만 해놓고 생성이 안되어 있다는 것을 의미
		//객체를 생성 => 클래스가 필요
		Method02 me=new Method02();
		int s=me.sum(20, 30);
		System.out.println("me 객체 생성 "+s);

	}
	
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	public static int min(int num1,int num2) {
		return num1-num2;
	}
	public static void mul(int num1,int num2) {
		System.out.println(num1*num2);
	}
	public static double avr(int num1,int num2) {
		return (double)num1/num2;
	}
	public static void per(int num1,int num2) {
		System.out.println(num1%num2);
	}
	

}
