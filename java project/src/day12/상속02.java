package day12;

public class 상속02 {

	public static void main(String[] args) {
		/*
		 * 오버드라이딩 : 부모 클래스에게 물려받은 메서드를 재정의 하는 것.
		 * -부모클래스의 메서드와 선언부가 일치해야 한다.
		 * -접근제한자는 길거나 더 넓은 범위 접근제한자를 써야한다.
		 * => 범위 축소 안됨
		 */
		Animal a=new Animal();
		Dog d=new Dog();
		d.setName("댕댕");
		d.info();
		d.howl();
		Tiger t=new Tiger("호랭이","고양이과");
		t.info();
		t.howl();
		
		Lion l=new Lion("사자","개과");
		l.info();
		l.howl();
	}

}
class Lion extends Animal{
	public Lion(String name,String category) {
		//부모의 생성자를 호출
		super(name,category);
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("크엉");
	}
	
}

class Dog extends Animal{
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍");
	}
}

class Tiger extends Animal{
	
	public Tiger(String name,String category) {
		super.setName(name);
		super.setCategory(category);
	}
//	public Tiger() {
//		setName("호랭이");
//		setCategory("고양이");
//	}
	
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("어흥");
	}
}

class Animal{

	private String name; // 이름
	private String category; //종류
	
	public void info() {
		System.out.println("이름: "+name);
		System.out.println("종류: "+category);
	}
	
	public Animal() {}
	public Animal(String name,String category) {
		this.name=name;
		this.category=category;
	}
	
	public void howl() {
		System.out.println("=="+name+"==의 울음소리는?");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}

