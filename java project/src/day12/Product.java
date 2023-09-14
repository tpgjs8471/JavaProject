package day12;

/*
 * Product class 생성
 * 메뉴이름, 가격
 *		//메뉴 추가 메서드
 *		//메뉴 : 가격 출력 메서드
 *ProductMain class 생성
 *product 배열 생성[10]
 *상품 등록 후 상품리스트 출력
 */

/* 상품을 등록하시겠습니까?( y / n )
 * y=등록 n=취소
 * 상품이름과 가격을 배열에 등록
 * 
 * n=> 등록된 제품 리스트 출력
 */
public class Product { 
	
	private String name;
	private int price;
	
	//생성자
	public Product() {}
	public Product(String name,int price) {
		this.name=name;
		this.price=price;
	}
	
	
	public void PrintInfo() { //출력용

		System.out.println("메뉴:"+name+" 가격:"+price);
	}
	
	
	public void PrintMenu(String name,int price) { //메뉴 저장
		this.name=name;
		this.price=price;
		System.out.println("메누:"+name+"/ 가격:"+price+"원");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

