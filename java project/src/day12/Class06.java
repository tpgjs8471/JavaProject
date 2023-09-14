package day12;

public class Class06 {
	public static void main(String[] args) {
		
		EzenStudent ez=new EzenStudent("1","!","!","1");
		//객체를 출력하면 자동으로 toString메서드를 호출
		System.out.println(ez);
	//	ez.Print();
		EzenStudent ez1=new EzenStudent();
		System.out.println(ez1);
		
	}

}
/* 객체를 초기화 하는 방법 : 기본값, 명시적 초기값, 초기화블럭
 * 1. 명시적 초기화 : 멤버변수의 선언과 동시에 초기값을 명시하는것 
 * 2. 초기화 블력 : {} 멤버변수를 초기화
 * 3. 생성자 : 객체를 초기화 하는 방법
 * 
 * 초기화 우선순위
 * 기본값 -> 명시적 초기값 -> 초기화블력 -> 생성자
 * 
 */
/*
 * 멤버변수 : 지점, 이름, 반, 전화번호
 * 메서드 호출(print메서드)
 * getter / setter
 * 
 */
class EzenStudent{
	
	private String branch="인천";
	private String name;
	private String course;
	private String call;
	{
	 // 초기화 블럭
		branch="incheon";
		course="123";
	}
	
	//생성자
	public EzenStudent() {}
	public EzenStudent(String branch,String name,String course,String call) {
		this.branch=branch;
		this.name=name;
		this.course=course;
		this.call=call;
	}
	
	public void Print() {
		System.out.println("지점:"+branch);
		System.out.println("이름:"+name+" 반:"+course+" 전화번호:"+call);
	}
	
	
	
	
	
	
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}
	
	
	
	@Override
	public String toString() {
		return "EzenStudent [branch=" + branch + ", name=" + name + ", course=" + course + ", call=" + call + "]";
	}
	

	
	
	
}