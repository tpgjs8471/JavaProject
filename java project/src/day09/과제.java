package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 클래스 개체 생성 (2명)
		//값을 입력 후 정보 출력  (2명)
		
		Student student01=new Student();
		student01.input("홍길동",150,"010","인천시");
		student01.Print();
//		student01.setName("abc");
//		student01.setAge(18);
//		student01.setTel("010-1234-5678");
//		student01.setAddres("연수구 구월동");
//		student01.Print();
		
		Student student02=new Student();
		student02.setName("qwe");
		student02.setAge(21);
		student02.setTel("010-5678-1234");
		student02.setAddres("연수구 옥련동");
		student02.Print();
		
//		Student student03=new Student();
//		Scanner scan=new Scanner(System.in);
//		System.out.println("이름: ");
//		student03.setName(scan.next());
//		System.out.println("나이: ");
//		System.out.println("TEL");
//		student03.setAge(scan.nextInt());
//		System.out.println("주소");
//		student03.setAddres(scan.next());
//		student03.Print();
		
		Student student04 = new Student("오", 27, "010", "연수구");
		student04.Print();
		Student student05=new Student("응애", 5);
		student05.Print();

	}

}

//클래스 생성
//학생 클래스 생성
//이름, 나이, 전화번호, 주소
//출력
//이름(나이) - 전화번호

class Student{
	private String name;
	private int age;
	private String tel;
	private String address;
	
	//생성자 위치 . 두개를 같이 만들어야 한다~
	//생성자 오버로딩 가능.
	//생성자 오버로딩 조건
	//-매게변수 개수가 다르거나, 매게변수 유형이 다르거나...
	public Student() {} // 컴파일러가 처음으로 제공하는 생성자.
	public Student(String name,int age,String tel,String address) {
		//생성자 호출은 반드시 첫줄에 존재해야 한다.
		this(name,age);
		this.tel=tel;
		this.address=address;
		
	}
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void input(String name, int age, String tel, String address) {
		this.name=name;
		this.age=age;
		this.tel=tel;
		this.address=address;
	}
	
	public String getAddres() {
		return address;
	}
	public void setAddres(String addres) {
		this.address = addres;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
	public void Print() {
		System.out.println("이룸:"+name+" "+"("+age+")"+" "+"Tel: "+tel);
		System.out.println("주소:"+address);
	}
}