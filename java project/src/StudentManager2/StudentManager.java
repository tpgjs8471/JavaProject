package StudentManager2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager implements Program{
	//멤버변수 Student List
	private List<Student> student = new ArrayList<Student>();
	
	public StudentManager() {
		add();
	}
	
	//기본 학생 추가
	public void add() {
		student.add(new Student("홍길동",16,"010-1111-1111"));
		student.add(new Student("김순이","010-2222-2222"));
		student.add(new Student("이순신","010-3333-3333"));
		student.add(new Student("삼순이",16,"010-4444-4444"));
		student.add(new Student("사순이"));
	}

	@Override
	public void addStd(Scanner scan) { //학생추가
		System.out.println("추가할 학생의 정보를 입력하세요");
		System.out.println("학생이름");
		String name=scan.next();
		System.out.println("학생나이");
		int age=scan.nextInt();
		System.out.println("전화번호");
		String phone=scan.next();
		student.add(new Student(name,age,phone));
		System.out.println("등록 완료~!");
	}

	@Override
	public void printStd() { //학생 기본정보
		for(int i=0;i<student.size();i++) {
			System.out.println(student.get(i));
		}
		System.out.println("---------------------");
	}

	@Override
	public void searchStd(Scanner scan) { //학생검색
		//학생명을 입력받아 학생정보 출력
		System.out.println("검색할 학생의 이름을 입력");
		String name=scan.next();
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).printOne();
				return;
			}
		}
		System.out.println("검색할 학생을 찾을 수 없습니다");
	}

	@Override
	public void modStd(Scanner scan) { //학생수정
		// 수정할 정보(이름, 나이, 전화번호)
		System.out.println("수정할 학생이름");
		String name=scan.next();
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.println("수정할 정보>");
				String op=scan.next();
				switch(op) {
				case "이름": 
					System.out.println("수정할 값>");
					String modName=scan.next();
					student.get(i).setName(modName);
					break;
				case "나이":
					System.out.println("수정할 값>");
					int modAge=scan.nextInt();
					student.get(i).setAge(modAge);
					break;
				case "전화번호":
					System.out.println("수정할 값>");
					String modPhone=scan.next();
					student.get(i).setPhone(modPhone);
					break;
					default:
						System.out.println("존재하지 않습니다.");
				}
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다");
	}

	@Override
	public void delStd(Scanner scan) { //학생삭제
		//remove는 index삭제, remove 삭제가 가능
		System.out.println("삭제할 학생이름");
		String name=scan.next();
//		for(int i=0;i<student.size();i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.remove(i);
//				System.out.println("삭제완료~!");
//				return;
//			}
//		}
//		System.out.println("학생이 존재하지않습니다.");
		
		//remove(object) 삭제 => object 자체로 이름이 일치하면 같은객체를 인지해야 함
		if(!student.remove(new Student(name))) {
			System.out.println("학생이 존재하지 않습니다.");
		}
		student.remove(new Student(name));
	}

	@Override
	public void addSub(Scanner scan) { //수강신청
		// 학생명/과목/점수 입력받아 과목등록 매서드 호출
		System.out.println("학생명>");
		String name=scan.next();
		System.out.println("과목>");
		String sub=scan.next();
		System.out.println("성적>");
		int score=scan.nextInt();
		
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).addSubject(sub, score);
				return;
			}
		}
		System.out.println("학생이 없습니다");
	}

	@Override
	public void modSub(Scanner scan) {
		// 학생명 과목 점수 입력받아 과목수정 메서드
		System.out.println("학생명>");
		String name=scan.next();
		System.out.println("과목>");
		String sub=scan.next();
		System.out.println("성정>");
		int score=scan.nextInt();
		
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).delSubject(sub); //과목삭제
				student.get(i).addSubject(sub, score);
				return;
			}
		}
		System.out.println("학생이 없습니다");
	}

	@Override
	public void delSub(Scanner scan) {
		// 학생명과 과목을 입력받아 삭제 메서드 호출
		System.out.println("학생명>");
		String name=scan.next();
		System.out.println("과목>");
		String sub=scan.next();
		int i= index(name);
		student.get(i);
		if(i==-1) {
			System.out.println("학생이 없습니다.");
		}else {
			student.get(i).delSubject(sub);
		}
//		for(int i=0;i<student.size();i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.get(i).delSubject(sub);
//				return;
//			}
//		}
//		System.out.println("학생이 없습니다.");
	}
	//학생명을 주고 그 학생며의 위치를 리턴하는 메서드
	public int index(String name) {
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1; // 0번지 포함이기 때문에 아니면 -1리턴
	}
	
	
}
