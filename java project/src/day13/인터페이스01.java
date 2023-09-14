package day13;

public class 인터페이스01 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수(final)로만 이루어진 것.
		 * 추상메서드 : 선언부만 있고 , 구현은 없는 메서드
		 * 키워드 : abstract 이지만 인터페이스는에서는 키워드를 안붙여도 상관없다.
		 * 
		 * interface 인터페이스명{
		 * 	-기능 요약서
		 * 	자체적으로 사용할수는 없고, 인터페이스를 구현한 클래스로 활용
		 * -구현 키워드 : implements
		 * -인터페이스는 멤버 변수가 없음.==>> 항상 이부분을 염두애ㅔ 두고 메서드 정리를 해야함
		 * }
		 * 
		 * -상속은 단일 상속이 원칙
		 * -구현은 여러개 가능
		 * 
		 */
		
		TV tv=new TV();
		tv.turnOn();
		tv.chUp();

	}

}
//....................인터페이스

interface Power{
	abstract void turnOn();
	abstract void turnOff();
}

interface Remocon{	//abstract 붙여도 되고~ 안붙여도 되고~
	void chUp();
	void chDown();
}
//-----------------------
class TV implements Power,Remocon{	//다중 구현 가능

	private boolean power;
	private int ch;
	
	@Override
	public void chUp() {
		ch++;
		if(ch>100) {
			ch=0;
		}
		System.out.println("현재 채널: "+ch);
		
	}

	@Override
	public void chDown() {
		ch--;
		if(ch<0) {
			ch=100;
		}
		System.out.println("현재 채널: "+ch);
	}

	@Override
	public void turnOn() {
		
		power = true;
		System.out.println("TV ON.");
	}

	@Override
	public void turnOff() {
		
		power = false;
		System.out.println("TV OFF.");
		
	}
	
	
	
}
