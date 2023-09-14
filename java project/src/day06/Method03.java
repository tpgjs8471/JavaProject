package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/*메서드를 활용한 계산기 작성
		 * 연산자는 + - * % / 만 허용
		 * 두 수와 연사자를 입력 Method를 활용
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("두 수를 입력하시오== ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("연산자를 입력하시오== ");
		char ch=scan.next().charAt(0);
//		double rem2[]=new double[2];
		
		
		
		
		switch(ch) {
		case '+' :
			System.out.println(num1+"+"+num2+"="+min(num1,num2));
			break;
		case '-' :
			System.out.println(num1+"-"+num2+"="+min(num1,num2));
			break;
		case '*' :
			System.out.println(num1+"X"+num2+"="+mul(num1,num2));
			break;
			
		case '%' :
			// rem2를 호출하여 몫과 나머지를 호출
			System.out.println(num1+"%"+num2+"="+per(num1,num2));
			double[] D=rem2(num1,num2);
			System.out.println(D[0]+".."+D[1]);
			break;
			
		case '/' :
			System.out.println(num1+"/"+num2+"="+avr(num1,num2));
			break;
			default:
				System.out.println("잘못된 연산자 입니다.");
		}
		System.out.println("끝");
		scan.close();

	}
	
	// 두 정수를 매개변수로 받아 결과를 리턴 받는 형태의 매서드
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	public static int min(int num1,int num2) {
		return num1-num2;
	}
	public static int mul(int num1,int num2) {
		return num1*num2;
	}
	public static int per(int num1,int num2) {
		return num1%num2;
	}
	public static double avr(int num1,int num2) {
		return (double)num1/num2;
	}
	
	//값을 연산자까지 매게변수로 받아 리턴업이 출력한 메서드
	public static void add(char ch, int num1, int num2) {
		System.out.println(num1+ch+num2+"="+(num1+num2));
	}
	
	
	/* 두 정수를 입력받아 두 정수의 몫과 나머지를 double[]로 리턴 
	 * 리턴타입 : double /
	 * 메개변수 : 두 정수 /
	 * 변수명 : rem2
	 */
	public static double[] rem2(int num1,int num2) {
		double[] D=new double[2];
		D[0]=num1/num2;
		D[1]=num1%num2;
		return D;
		
	}
	

}
