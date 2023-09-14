package day09;

public class classEX02 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		Point p=new Point();
		p.print();
		//멤버변수가 private로 변경되면 직접접근 X
//		p.x=1;
//		p.y=3;
		p.setx(1);
		p.sety(3);
		p.print();
		
		
		System.out.println(p.getx());
		System.out.println(p.gety());
		
		p.setx(10);
		p.print();
		
		Point p2=new Point();
		p2.setx(100);
		p2.sety(200);
		p2.print();
		
		System.out.println("====================");
		Point1 user=new Point1();
		user.print();
		user.setx(192);
		user.sety(181);
		user.setz(111);
		user.print();
		System.out.println("x y z 저장값");
		System.out.println(user.getx());
		System.out.println(user.gety());
		System.out.println(user.getz());
	}

}

//좌표 (0,0)
class Point{
	//멤버변수 자리
	//멤버변수는 일반적으로 private을 사용
	private int x;
	private int y;
	//print
	//같은 클래스의 멤버변수는 모든 메서드에서 공유 된다.
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	
	//getter(멤버변수의 값을 가져요는 역할의 메서드)
	//setter(멤버변수의 값을 변경하는 역할의 메서드)
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	
	public void setx(int x) { //메개변수x와 멤버변수 x는 다른값
		//this 내 클래스의 멤버변수를 지칭하는 키워드
		this.x=x;
	}
	public void sety(int y) {
		this.y=y;
	}
}

//Point1 클래스생성
//(0,0,0)
//x y z
//print 메서드 생성
//getter / setter 생성
//자동완성   source > generate getter/setter

class Point1 {
	private int x;
	private int y;
	private int z;
	
	
	public void print() {
		System.out.println("("+x+","+y+","+z+")");
	}
	
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public int getz() {
		return z;
	}
	
	public void setx(int x) {
		this.x=x;
	}
	public void sety(int y) {
		this.y=y;
	}
	public void setz(int z) {
		this.z=z;
	}
}



