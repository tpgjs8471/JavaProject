package studentmanager;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		/* 메뉴를 출력하여 사용자로부터 어떤 기능을 수행할 것인지 처리
		 * 1.학생등록 | 2.학생 검색 | 3.학생리스트 | 4.수강 신청 | 5.수강철회 | 6.종료
		 */
		
		StudentManager stuM = new StudentManager();
		boolean out = true;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(out) {
			System.out.println("1.학생등록 | 2.학생 검색 | 3.학생리스트 | 4.수강 신청 | 5.수강철회 | 6.종료");
			
			int insertNum = sc.nextInt();
			
			switch(insertNum) {
			case 1:
				stuM.insertStudent(sc);
				break;
			case 2:
				stuM.searchStudent(sc);
				break;
			case 3:
				stuM.printStudent();
				break;
			case 4:
				stuM.registerSubject(sc);
				break;
			case 5:
				stuM.deleteSubject(sc);
				break;
			case 6:
				System.out.println("종료합니다.");
				out = false;
				break;
			default:
				System.out.println("잘못된 입력");
				break;
			}
			
		}
		
	}

}