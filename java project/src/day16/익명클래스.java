package day16;

public class 익명클래스 {

	public static void main(String[] args) {
		/*
		 * 익명클래스: 이름이 없는 클래스
		 * 인터페이스를 이용하여 객체를 만들 때 클래스 없이 바로 구현
		 * 익명 클래스를 사용하는 이유
		 * 인터페이스의 기능이 적고, 해당 객체가 한번만 사용할 경우
		 * 메서드에서 매개변수로 인터페이스를 구현한 클래스가 필요.
		 */
		
//		TV tv=new TV();
//		product(tv);
		//익명 클래스로 작업한 경우
		product(new Power() {

			@Override
			public void turnOn() {
				System.out.println("전원on");
				
			}

			@Override
			public void turnOff() {
				System.out.println("전원off");
				
			}
			
		});
		

	}

	public static void product(Power p) {
		p.turnOn();
		System.out.println("제품작동");
		p.turnOff();
		
	}
}

interface Power{
	void turnOn();
	void turnOff();
}

//class TV implements Power{
//	@Override
//	public void turnOn() {
//		System.out.println("ON");	
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("OFF");	
//	}	
//}