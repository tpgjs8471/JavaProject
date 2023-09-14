package studentmanager;

import java.util.Scanner;

public class StudentManager implements Program {
	Scanner sc = new Scanner(System.in);
	/* 멤버변수: 학생 클래스를 배열로 생성[5] -> index 변수 필요
	 * -Program 인터페이스를 구현
	 * -메서드는 interface를 구현하는 형태로...
	 * -학생 추가시 배열이 꽉 찼다면... 배열을 늘려주는 기능 추가
	 */
	private int cnt1;
	private int cnt2;
	
	
	Student std[] = new Student[5];
	
	@Override
	public void printStudent() {
		for(int i = 0 ; i < cnt1; i++) {
			System.out.println(std[i].toString());
			for(int j = 0 ; j < cnt2; j++) {
			System.out.println(std[i].sub[j].toString());
			}
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		
		System.out.printf("insert student name: ");
		String stName = scan.next();
		System.out.printf("insert student number: ");
		int stNum = scan.nextInt();
		System.out.printf("insert student Birth: ");
		String stBirth = scan.next();
		System.out.printf("insert student faculties: ");
		String stFaculies = scan.next();
		System.out.printf("insert student major: ");
		String stMajor = scan.next();
		Student st = new Student(stNum, stName, stBirth, stFaculies, stMajor);
		std[cnt1] = st;
		cnt1++;
	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.printf("insert student number: ");
		int stNum = scan.nextInt();
		for(int i = 0; i < getCnt1(); i++) {
			if(std[i].getStudentNumber() == stNum) {
				System.out.println(std[i].toString());
			}
		}
	}

	@Override
	public void registerSubject(Scanner scan) {
		System.out.printf("학번을 입력해주세요: ");
		int stNum = scan.nextInt();
		for(int i = 0; i < getCnt1(); i++) {
			if(std[i].getStudentNumber() == stNum) {
				System.out.println("등록하시겠습니까?(y/n)");
				char c = scan.next().charAt(0);
				if(c == 'y') {
					std[i].register(scan);
					cnt2++;
					continue;
				}else if(c == 'n') {
					break;
				}
			}
		}
	}

	@Override
	public void deleteSubject(Scanner scan) {
		System.out.printf("학번을 입력해주세요: ");
		int stNum1 = scan.nextInt();
		for(int i = 0; i < getCnt2(); i++) {
			if(std[i].getStudentNumber() == stNum1) {
				std[i].delete(scan);
				cnt2--;
			}
		}
	}

	
	
	public int getCnt1() {
		return cnt1;
	}

	public void setCnt1(int cnt1) {
		this.cnt1 = cnt1;
	}

	
	public int getCnt2() {
		return cnt2;
	}

	public void setCnt2(int cnt2) {
		this.cnt2 = cnt2;
	}
	
	
	
	
}