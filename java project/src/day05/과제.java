package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*
		 * 파일명 5개가 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가
		 * 있는 파일들을 출력하도록 작성하시오
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		String[] filename= {"java의정석.txt","java이론","이것이java다.jpg","String에서도.txt","String함수.jpg","java의함수.png"};
		System.out.println("단어를 입력하세요");
		String name=scan.next();
		
		//contains(str) : str의 단어가 포함되어 있는지 체크 return / false
		for(int i=0;i<filename.length;i++) {
			
			if(filename[i].contains(name)) {	// if의 조건식은 true / false
				System.out.println(filename[i]);

			}
		
		}
		
		
	}

}
