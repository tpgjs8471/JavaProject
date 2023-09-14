package day11;

public class EzenComputer {
	
	//멤버변수 선언
	//final => 변경 불가능한 변수선언
	private String name;
	private String birth;
	private int age;
	private String phone;
	public final static String company = "EZEN";
	private String branch;
	
	private String[] course=new String[5]; // 수강과목
	private String[] period=new String[5]; // 수강기간
	private int cnt; //배열의 index 처리를 위한 변수
	
	
	
	
	//생성자
	public EzenComputer(String name,String birth,int age,String phone,String branch) {
		//super(); //상속 받을경우 부모의 생성자
		this.name=name;
		this.birth=birth;
		this.age=age;
		this.phone=phone;
		this.branch=branch;
	}
	
	//메서드
	public void printInfo() {
		System.out.println(name+", "+birth+", "+age+", "+phone);
	}
	
	public void printCompany() {
		System.out.println(company+"("+branch+")");
	}
	
	public void printCourse() {
		if(course.length==0||cnt==0) {
			System.out.println("수강이력이 없습니다");
			return;  //출력을 멈추고 메소드 탈출
		}

	//추가과목
	for(int i=0;i<cnt;i++) {
		System.out.println(this.course[i]+"("+this.period[i]+")");
	}
	System.out.println(); //줄바꿈
	}
	
	public void insertcourse(String course,String period) {
		this.course[cnt]=course;
		this.period[cnt]=period;
		cnt++; //index증가
	}
	//getter / setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}


	
}