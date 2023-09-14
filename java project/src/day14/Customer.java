package day14;

public class Customer {
	/* 고객클래스
	 * 일반고객(Silver) / Gold고객 / VIP고객
	 * 
	 * 멤버변수 
	 * 고객ID: int customerID
	 * 고객이름: String customerName
	 * 고객등급: String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스포인트적립비율 : double bonusRatio
	 * 
	 * - customer 객체 생성시
	 * 기본 customerGrade = Silver
	 * 기본 bonusRatio = 0.01
	 * 
	 * -메서드
	 * -보너스 적립 계산 메서드(메서드명: calcPrice(int price))
	 * 	=> 보너스를 적립하고, 할인여부 체크하여 구매 price리턴
	 * 구매금액을 주고, 적립보너스 계산, bonusPoint누적, 실 구매금액 리턴
	 * 
	 * 
	 * -출력 메서드(메서드명: customer Info())
	 * 	 홍길동님의 등급은 VIP이며, 보너스 포인트는 1000입니다
	 * 		전담 상담사 번호는 1111입니다 - VIP만 출력
	 * 
	 * - Silver등급
	 * 	 제품을 살때 할인 없음. /보너스 포인트 1% 적립
	 * 
	 * - Gold등급	
	 * 	 제품을 살때 10% 할인 / 보너스 포인트 2% 적립
	 * 
	 * - VIP등급
	 * 	 제품을 살때 20% 할인 / 보너스 포인트 5% 적립
	 * 	 전담상담사를 갖는다 ( Int agentID )
	 */
	
	/*
 	public 접근 제한자: 단어 뜻 그대로 외부 클래스가 자유롭게 사용할 수 있도록 합니다.
	protected 접근 제한자: 같은 패키지 또는 자식 클래스에서 사용할 수 있도록 합니다.
	private 접근 제한자: 단어 뜻 그대로 개인적인 것이라 외부에서 사용될 수 없도록 합니다.
	 */
	 protected int customerID;
	 protected String customerName;
	 protected String customerGrade;
	 protected double bonusPoint;
	 protected double bonusRatio;
	 
	  
	 //생성자
	 public Customer() {}
//	 public Customer(int customerID,String custmoerName) {
//		 this.customerID = customerID;
//		 this.customerName = customerName;
//		 customerGrade="Silver";
//		 bonusRatio=0.01;
//	 }
	 public Customer(int customerID, String customerName) {
		 this.customerID = customerID;
		 this.customerName = customerName;
		 customerGrade = "Silver";
		 bonusRatio = 0.01; 
	 }
	 
	 
	 //메서드
	 //가격을 매개변수로 받아 포인트 적립/가격을 리턴
	 
	  public int calcPrice(int price) {
		  bonusPoint=bonusPoint+(int)(price*bonusRatio);
		  return price;
	  }
	  
	  //고객정보 출력메서드
	  public void customerInfo() {
		  System.out.println(customerName+"님의 등급은 "+customerGrade+"입니다.");
		  System.out.println("보너스 포인트는"+bonusPoint+" 입니다.");
	  }
	  
	  
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
}
