package day09;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		/*
		 *day08 과제 > 메서드로 변경 
		 *1 랜덤번호 생성
		 *2 배열에 추가(중복제거 메서드)
		 *3 출력메서드
		 *4 스트라이크 메서드 => 개수리턴
		 *5 볼 메서드 => 개수리턴
		 */
		
		int com[]=new int[3];
		int user[]=new int[3];
		
		//랜덤수 생성
		int count=9;
		int start=1;
		int s=0, b=0;
		int cnt=0; // 게임횟수
		
		Scanner scan=new Scanner(System.in);
		randomArray(com,count,start);
		System.out.println("야구게임 시작");
		System.out.println("컴퓨터가 수를 정하였습니다");
		
		while(s!=3) {
			//사용자 번호받기
			System.out.println("1~9까지 숫자 3개 입력");
			for(int i=0;i<user.length;i++) {
				user[i]=scan.nextInt();
			}
			cnt++;
			
			//결과 출력
			s=Strike(com,user);
			b=Ball(com,user);
			
			if(s!=0) {
				System.out.println(s+" s");
			}
			if(b!=0) {
				System.out.println(b+" b");
			}
			System.out.println();//줄바꿈
			System.out.println("게임횟수"+cnt);
			if(s==0 && b==0) {
				System.out.println("아웃");
			}
			if(s==3) {
				System.out.println("정답 3스트라이크");
				break;
			}
		}
		scan.close();
	}

	/*
	 * 랜덤번호 생성 : 메개변수로 범위를 설정 
	 * int random=(int)(Math.random()*9(개수))+1(시작값);
	 * 메개변수 => 개수,시작값
	 * if처리 => 개수와 시작값의 값이 바뀌어서 들어올 때 처리 
	 */
	public static int Computer(int count,int start) {
		if(count<start) {//값이 바뀌어서 들어오는 경우
			int tmp = count;
			count = start;
			start=tmp;
		}
		return (int)(Math.random()*count)+start;
	}
	
	//중복 확인 메서드
	public static boolean isContain(int arr[],int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	
	//배열 생성 메서드
	//리턴 boolean : 배열이 잘 생성되묜 true , 아니면 false 리턴
	//메개변수 : 배열, count, start
	public static boolean randomArray(int arr[],int count,int start) {
		if(arr==null) {
			return false;
		}
		if(count<arr.length) {
			return false;
		}
		int i=0;
		while(i<arr.length) {
			int r=Computer(count,start);
			if(isContain(arr,r)) {
				arr[i]=r;
				i++;
			}
	}
		return false;

}

	//배열 출력 메시드
	public static void printArray(int arr[]) {
		for(int tmp:arr) {
			System.out.println(tmp+" ");
		}
		System.out.println();//줄바꿈
	}
	
	//스트라이크 메서드
	//기눙 : com[],user[]위치와 값이 일치하면 count 리턴
	public static int Strike(int com[],int user[]) {
		int cnt=0;
		for(int i=0;i<com.length;i++) {
			if(com[i]==user[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	//볼 메서드
	//기능 : com[], user[] 위치 상관없이 일치하면 카운트 증가 리턴
	public static int Ball(int com[],int user[]) {
		int cnt=0;
		for(int i=0;i<com.length;i++) {
			if(isContain(user,com[i])) { //위치 상관없이 일치
				cnt++;
			}
		}
		//스트라이크 포함하고 있는 개수
		return cnt-Strike(com,user);
	}
	
	
	
}
