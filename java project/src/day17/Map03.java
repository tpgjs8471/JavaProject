package day17;

import java.util.HashMap;
import java.util.Scanner;

public class Map03 {

	public static void main(String[] args) {
		/*
		 * 과목과 점수를 입력받아 합계ㅡ평균을 출력
		 * 과목> 국어: 점수
		 * 다시입력? 입력(0) >
		 * 종료 후
		 * 과목: 점수
		 * 합계: 
		 * 평균: 
		 * 종료키워드가 나올때까지 반복( 0 )
		 */
		
		Scanner scan=new Scanner(System.in);
		HashMap<String,Integer> map=new HashMap<>();
		int exit=1;
		
		while(exit!=0) {
			System.out.println("과목,점수");
			String subject=scan.next();
			int score=scan.nextInt();
			map.put(subject,score);
			System.out.println("계속1 , 종료0");
			exit=scan.nextInt();
		}
		
		
		int sum=0;
		for(String key: map.keySet()) {
			System.out.println(key+" "+map.get(key));
			sum=sum+map.get(key);
		}
		System.out.println("합계:"+sum);
		int avg=sum/map.size();
		System.out.println("평균:"+avg);
		
		scan.close();
	}

}
