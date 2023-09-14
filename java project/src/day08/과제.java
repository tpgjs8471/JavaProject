package day08;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*
		 * 야구게임
		 * 컴퓨터가 3자리의 숫자를 랜덤 생성 (1~9까지만) = 중복 X
		 * 유저가 3자리 숫자를 맞추는 게임
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball
		 * 그외 out
		 * 
		 * 컴퓨터 = > 3 5 7
		 * 유저 => 	3 6 7 => 2s
		 * 
		 * 	3 5 7
		 * 	3 7 6 => 1s 1b
		 * 
		 * 	3 5 7
		 * 	7 3 5 => 3b
		 *	
		 *	3 6 7
		 *	1 2 6 => out
		 *
		 *--야구게임 시작
		 *컴퓨터가 숫자를 정했습니다.
		 *숫자입력(1~9,3자리) :
		 *3 4 5
		 *결과
		 *3s 다 맞으면 종료 (게임 횟수 출력) 
		 */
		

		int gamecount=0;
		int[] com=Computer();
		System.out.println("컴푸터가 숫자르 정했습니다.");
		
		while(true) {

			int strike=0;
			int ball=0;
	//		Print(com);
	//		System.out.println();
			System.out.println("숫자를 입력해주세요");
			int[] user=User();
			for(int i=0;i<com.length;i++) {
				for(int j=0;j<user.length;j++) {
					if(com[i]==user[j] && i==j ) {
						strike++;
					}
					else if(com[i]==user[j] && i!=j)
					{
						ball++;
					}
				}
			}
			gamecount++;
			
			if(strike==3) {
				System.out.println("3스트리이크!! "+"횟수:"+gamecount);
				break;
			}
			else if(ball==0 && strike==0) {
				System.out.println("아웃!");
			}
			else {
				System.out.println("스트라이크:"+strike+" "+"볼:"+ball+" "+"횟수:"+gamecount);
			}
		}
		
		
//		//lotto 메서드의 randomArray 배열과 printArray배열을 호출.
//		//static메서드는 객체 생성없이 클래스명.매서드명()으로 호출이 가능.
//		lotto02.RandomArray(com); //ex예시
//		lotto02.PrintArray(com);
	}
	
	//컴퓨터 랜덤값 생성
	public static int[] Computer() {
		int[] com=new int[3];
		for(int i=0;i<com.length;i++) {
			int random=(int)(Math.random()*9)+1;
			if(!Contains(com,random)){
				com[i]=random;
			}
			else {
				i--;
			}
		}
		return com;
	}
	
	//중복확인
	public static boolean Contains(int[] arr, int num){
	
		for(int f : arr) {
			if(f==num) {
				return true;
			}
		}
		return false;
}
	
	//유저 숫자 입력
	public static int[] User() {
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++) {
			user[i]=scan.nextInt();
		}
		return user;
	}
	
	//출력
	public static void Print(int[] arr) {
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
}
