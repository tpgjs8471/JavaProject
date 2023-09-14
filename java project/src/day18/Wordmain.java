package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Wordmain {

	public static void main(String[] args) {
		// 자료구조는 객체를 담는 변수
		// 객체는 반드시 생성(new)해서 list에 add 해야함
		
		ArrayList<과제2>list=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		int menu=-1;
		do {
			//메뉴의 값이 0이면 그만입력, 그전까지 계속 입력
		System.out.println("1.단어추가 | 0.종료");
		menu=scan.nextInt();
		if(menu==0) {
			System.out.println("프로그램 종료");
			break;
		}else {
			System.out.println("단어입력>");
			String word=scan.next();
			System.out.println("의미입력>");
			String mean=scan.next();
			
			과제2 w=new 과제2(word,mean);
			list.add(w);
		}
		
		}while(menu!=0);
		
		//정렬
		Collections.sort(list);
		
		for(과제2 tmp: list) {
			System.out.println(tmp);
		}
		
		scan.close();
	}

}
