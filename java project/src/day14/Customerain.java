package day14;

public class Customerain {

	public static void main(String[] args) {
		Customer[] customerList=new Customer[10];
		
		Customer cLee=new Customer(1001,"리정혁");
		Customer cHong=new Gold(1002,"홍길동");
		Customer cKim=new VIP(1003,"김철수",1111);
		int cnt=0;
		customerList[0]=cLee;
		cnt++;
		customerList[1]=cHong;
		cnt++;
		customerList[2]=cKim;
		cnt++;
		customerList[3]=new Customer(1005,"리");
		cnt++;
		customerList[4]=new VIP(1007,"철",1111);
		cnt++;
		customerList[5]=new Gold(1009,"길");
		cnt++;
		
		/*다운 캐스팅: 부모의 공유되는 멤버변수나 메서드가 아닌
		 * 자식의 고유 멤버변수나 메서드를 호출하고자 할때 필요
		 * 다운캐스팅: 반드시 명식적으로 형변환 해야함
		 * instanceof 원래 그 형대가 맞는지 체크하는 명령어 true / false
		 */
		System.out.println("=========고객정보출력=========");
		for(int i=0;i<cnt;i++) {
			Customer c=customerList[i]; //주소만 복사
			if(c instanceof VIP) {
				VIP VIP=(VIP)c;
				if(VIP.getAgentID()==1111) {
					VIP.setAgentID(3333);
				}
			}
		}
		
		
		
//		int price=cLee.calcPrice(10000);
//		System.out.println("지불금액:"+price);
		//for문을 활용한 고객정보 출력
//		for(int i=0;i<cnt;i++) {
//			customerList[i].customerInfo();
//		}
		
		
		
		System.out.println("--할인울과 포인트 계산--");
		int price=10000;
		for(int i=0;i<cnt;i++) {
			System.out.println(customerList[i].getCustomerName()+"님이 지불하실 금액은"+
					customerList[i].calcPrice(price)+"/ 보너스는"+
					customerList[i].getBonusPoint());
		}
		//홍길동님이 지불하실 금액은 000원 / 보너스포인트는 00원입니다
		
		
		
		
	}

}
