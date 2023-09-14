package day19;

import java.util.ArrayList;

class Customer implements Comparable<Customer>{
	private String name;
	private int age;
	private int cost;
	
	public Customer() {}
	public Customer(String name, int age) {
		this.name=name;
		this.age=age;
		this.cost = (age>=15)? 100 : 50;
	}
	
	
	
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "이름:"+name+", 나이:" + age + ", 비용:" + cost;
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
public class StreamEx01 {

	public static void main(String[] args) {
		/* 여행상품이 있습니다.
		 * 여행 비용은 15세 이상은 100만원, 15세 미만은 50만원
		 * 고객 3명이 패키지 여행을 떠나려고 할 때
		 * 1. 여행비용계산
		 * 2. 고객명단출력
		 * 
		 * 고객은 class 생성 , ArrayList로 고객 3명추가
		 * 고객 정보
		 * 이름 : 이순신, 나이 : 40, 비용 : 100
		 * 이름 : 김순이, 나이 : 35, 비용 : 100
		 * 이름 : 이아들, 나이 : 10, 비용 : 50
		 * 총 여행경비 : 250만원
		 */
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("이순신",40));
		list.add(new Customer("김순이",35));
		list.add(new Customer("이아들",10));
		
		
		System.out.println("고객명단");
//		list.stream().forEach(System.out::println);
		list.stream()
		.forEach(n->{
			String name=n.getName();
			int age=n.getAge();
			int cost=n.getCost();
			System.out.println(name+":"+age+"세 비용:"+cost);
		});
		
		int price=list.stream()
				.mapToInt(n->n.getCost())
				.sum();
		System.out.println("총 여행경비:"+(price)+"만원");
		
		
//		System.out.println("고갱정보");
//		list.stream().forEach(System.out::println);
		
//		int sum=list.stream().filter(a -> a.getAge()>=15)
//				.mapToInt(t -> t.getCost())
//				.sum();
//		int sum1=list.stream().filter(a -> a.getAge()<=15)
//				.mapToInt(t -> t.getCost())
//				.sum();
//		System.out.println("총 여행경비:"+(sum+sum1)+"만원");
				
		//20세 이상 성인만 이름을 정렬하여 정렬
		System.out.println("===20세이상===");
		list.stream()
		.filter(a -> a.getAge()>=20)
		.sorted()
		.forEach(System.out::println);

		
	}

}
