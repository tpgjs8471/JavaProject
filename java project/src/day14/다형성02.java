package day14;

public class 다형성02 {
	public static void main(String[] args) {
		
		//부모 클래스를 이용하여 자식클래스 생성
		Animal hAnimal=new Human();
		Animal tAnimal=new Tiger();
		Animal eAnimal=new Eagle();
	//	Tiger t=new Animal(); // 자식 클래스로부터 부모클래스를 생성하는 케이스는 안됨.
		
		
		다형성02 test= new 다형성02();
		test.moveAnimal(hAnimal);
		test.moveAnimal(eAnimal);
		test.moveAnimal(tAnimal);
		
		
//		Tiger h= (Tiger)hAnimal;
		Tiger t= (Tiger)tAnimal;
		
//		h.hunting();
		t.hunting();
		
		
		//instanceof 연산자  :  true / false
		// 객체명 instanceof 클래스명
		System.out.println(hAnimal instanceof Tiger);
		System.out.println(tAnimal instanceof Tiger);
		
		if(hAnimal instanceof Tiger) {
			Tiger t1= (Tiger)hAnimal;
		}
		
		//배열생성
		Animal[] aniList = new Animal[5];
		int cnt=0;
		aniList[cnt]=hAnimal;
		cnt++;
		aniList[cnt]=tAnimal;
		cnt++;
		aniList[cnt]=eAnimal;
		cnt++;
		
		System.out.println("----DownCasting----");
		test.testDownCasting(aniList, cnt);
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	//부모 형으로 객체를 생성하게 되면 자식이 개별적으로 가지고 있는 메서드를 사용할 수 없다.
	//자식이 개별로 가지고 있는 메서드를 사용하려면, 다운캐스팅 해줘야 함.
	//부모의 형이 아닌 자식의 형태로 변환을 해줘야 함.
	public void testDownCasting(Animal[] list,int cnt) {
		for(int i=0;i<cnt;i++) {
			Animal ani=list[i];
			if(ani instanceof Human) {
				Human human=(Human) ani;
				human.readBook();
			} else if(ani instanceof Tiger) {
				Tiger tiger=(Tiger) ani;
				tiger.hunting();
			}else if(ani instanceof Eagle) {
				Eagle eagle=(Eagle) ani;
				eagle.flying();
			}else {
				System.out.println("Castig Error");
			}
		}
		
		
	}

}


class Animal{
	
	public void move() {
		System.out.println("동물들이 움직입니다");
	}
	public void eating() {
		
	}
}


class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}


class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 움직입니다");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽는다");
	}
}


class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다");
	}
	public void flying() {
		System.out.println("독수리가 멀리멀리 날아갑니다");
	}
}