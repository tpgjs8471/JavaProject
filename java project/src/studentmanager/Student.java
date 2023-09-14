package studentmanager;

import java.util.Scanner;

public class Student {
	/* 학생 클래스: 한 학생의 정보를 나타내는 클래스
	 * -학번, 이름, 주민번호, 학부, 학과, 과목s(과목클래스를 배열로 생성[5])
	 * -멤버변수 선언, 생성자, getter/setter, 기타 메서드(학생이 수강을 신청하는 메서드, 철회하는 메서드, 기타 출력)
	 */
	private int studentNumber;
	private String studentName;
	private String birthNumber;
	private String faculties;
	private String major;
	
	public Student() {
		
	}
	public Student(String studentName){
		this.studentName = studentName;
		this.studentNumber = (Integer) null;
		this.birthNumber = null;
		this.faculties = null;
		this.major = null;
	}
	
	
	public Student(int studentNumber, String studentName, String birthNumber, String faculties, String major) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.birthNumber = birthNumber;
		this.faculties = faculties;
		this.major = major;
	}

	Subject sub[] = new Subject[5];
	private int cnt=0;

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBirthNumber() {
		return birthNumber;
	}

	public void setBirthNumber(String birthNumber) {
		this.birthNumber = birthNumber;
	}

	public String getFaculties() {
		return faculties;
	}

	public void setFaculties(String faculties) {
		this.faculties = faculties;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public void register(Scanner sc) {
		
		
			System.out.printf("과목명 입력: ");
			String suName = sc.next();
			
			System.out.printf("과목코드 입력: ");
			int suCode = sc.nextInt();
			
			System.out.printf("교수명 입력: ");
			String suProName = sc.next();
			
			System.out.printf("학기 입력: ");
			int suSemester = sc.nextInt();
			
			System.out.printf("학점 입력: ");
			int suScore = sc.nextInt();
			
			System.out.printf("시수 입력: ");
			int suHour = sc.nextInt();
			
			System.out.printf("시간표 입력: ");
			String suSchedule = sc.next();
			
			Subject su = new Subject(suCode, suName, suScore, suHour, suProName, suSemester, suSchedule);
			sub[cnt] = su;
			
		}
	
	public void delete(Scanner sc) {
		System.out.printf("삭제하려는 과목의 과목코드:");
		int deleteNum = sc.nextInt();
		int num = 0;
		
		for(int i = 0; i < cnt; i++) {
			if(sub[i].getSubjectCode() == deleteNum) {
				num = i;
				break;
			}
		}
		for(int i = num; i < cnt; i++) {
			sub[i] = sub[i + 1];
		}
	
	
	}
	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", studentName=" + studentName + ", birthNumber="
				+ birthNumber + ", faculties=" + faculties + ", major=" + major + "]";
	}
	
		
	}
	
	