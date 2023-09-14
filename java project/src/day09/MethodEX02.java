package day09;

import java.util.Scanner;

public class MethodEX02 {

	public static void main(String[] args) {
		//두 정수의 사칙연사( + - * % /)을 처리
		
		MethodEX02 me=new MethodEX02();
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("두 정수를 입력하세요");
//		int num1=scan.nextInt();
//		int num2=scan.nextInt();
		
		System.out.println(me.SUM(10,20));
		System.out.println(me.MIN(5, 3));
		System.out.println(me.MUL(10, 2));
		System.out.println(me.PER(100, 10));
		System.out.println(me.AVR(100, 3));
	}
	
	// +
	public int SUM(int num1,int num2) {
		return num1+num2;
	}
	// -
	public int MIN(int num1,int num2) {
		return num1-num2;
	}
	// *
	public int MUL(int num1,int num2) {
		return num1*num2;
	}
	// %
	public int PER(int num1,int num2) {
		return num1%num2;
	}
	// /
	public double AVR(int num1,int num2) {
		return (double)num1/num2;
	}

}
