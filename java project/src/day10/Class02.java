package day10;

public class Class02 {

	public static void main(String[] args) {
		/*
		 * 자동차 클래스 생성
		 * 멤버변수 :  name year color power speed
		 * 메서드 : 전원on/off, 스피드up, 스피드down
		 * getter/setter
		 * 생성자
		 */
		
		Car car1=new Car("소나타","2009","은색");
		car1.Print();
		car1.powerOn();
		car1.speedUp();
		car1.speedDown();
		car1.powerOff();
	}

}

class Car{
	//멤버변수 선언
	private String name;
	private String year;
	private boolean power;
	private int speed;
	private String color ;
	
	
	
	//생성자
	public Car() {} //기본생성자
	public Car(String name,String year,String color) {
		this.name=name;
		this.year=year;
		this.color=color;
	}
	
	
	//메서드
	//전원on/off, 스피드up, 스피드down
	public void powerOn() {
		power=true;
		System.out.println("전원이 켜졌습니다.");
	}
	public void powerOff() {
		if(speed==0) {
		power=false;
		System.out.println("전원이 꺼졌습니다.");
	}else {
		System.out.println("속도를 줄여주세요");
	}
	}
	public void speedUp() {
		if(power) {
			
			speed=speed+20;
			System.out.println("현재속도: "+speed);
		}else
			System.out.println("시동을 걸어주세요");
	}
	public void speedDown() {
		if(speed==0) {
			System.out.println("속도를 올려주세요 현재속도:"+speed);
		}else
		speed=speed-20;
		System.out.println("현재속도: "+speed);
	}
	
	//getter,setter
	public boolean isPoewr() {
		return power;
	}
	public void setPoewr(boolean poewr) {
		this.power = poewr;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void Print() {
		System.out.println("차종:"+name+" 년식:"+year+" 색상:"+color);
	}
	
}
