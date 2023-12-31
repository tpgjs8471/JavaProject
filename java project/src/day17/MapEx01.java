package day17;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		/* map을 이용한 성적 관리 프로그램을 생성
		 * --menu--
		 * 1.성적추가
		 * 2.성적조회(전체출력) /합계, 평균 같이 출력
		 * 3.성적조회(과목조회) / 국어=>98점 서치 후 일치하는 과목 출력 / 
		 * 4.성적수정 : 서치 후 수정
		 * 5.성적삭제
		 * 6.종료
		 * CRUD
		 * C(create) 생성
		 * R(read) 읽기(조회)
		 * U(update) 수정
		 * D(delete) 삭제
		 */
		
		HashMap<String, Integer> map=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		int menu=0;
		int sum=0;
		do {
			System.out.println("1.성적추가");
			System.out.println("2.성적조회(전체출력)");
			System.out.println("3.성적조회(과목조회)");
			System.out.println("4.성적수정");
			System.out.println("5.성적삭제");
			System.out.println("6.종료");
			System.out.println("항목>>");
			menu=scan.nextInt();
			
			switch(menu) {
			case 1 : 
				System.out.println("과목, 점수를 입력하세요");
				String subject=scan.next();
				int score=scan.nextInt();
				map.put(subject,score);
				break;
			case 2 :
		//		int sum=0;
				for(String key : map.keySet()) {
					System.out.println(key+" "+map.get(key));
					sum+=map.get(key);
				}
				System.out.println("합계: "+sum);
				System.out.println("평균: "+(double)sum/map.size());
				break;
			case 3: 
				System.out.println("검색 할 과목을 입력하세요.");
				subject=scan.next();
				System.out.println(subject+"=> "+map.get(subject));
				break;
			case 4:
				System.out.println("수정할 과목과 점수를 입력하세요.");
				String react=scan.next();
				int react1=scan.nextInt();
				map.put(react, react1);
				break;
			case 5: 
				System.out.println("성적삭제할 과목");
				subject=scan.next();
				map.remove(subject);
			default:
				System.out.println("다시 입력해주세요");
				
			}
		}while(menu!=6);
		System.out.println("프로그램 종료");
		scan.close();
	}
}