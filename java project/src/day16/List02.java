package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02		{

	public static void main(String[] args) {
		/* -----메뉴판-----
		 * 1.햄버거	7000원	
		 * 2.피자		15000원
		 * 3.음료수	2000원
		 * 4.과자		1000원
		 * 5.사탕		500원
		 * 6.프로그램 종료
		 * 
		 * 메뉴를 선택하세요 > 1
		 * 수량 > 2
		 * => 1번 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 메뉴선택 > 3
		 * 수량 > 2개
		 * => 3번 음료 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 
		 * --선택한 메뉴---
		 * 1. 햄버거 2개 
		 * 2. 음료 2개
		 * 총 지불금액 0000원
		 */
		FoodManager fm= new FoodManager(); // add()완료
		Scanner scan=new Scanner(System.in);
//		System.out.println(fm.getList1());
//		System.out.println(fm.getList2());
		
		ArrayList<Integer> order=new ArrayList<>();
		ArrayList<Integer> count=new ArrayList<>();
		
		int menu=-1;
		do {
			fm.printMenu();	//메뉴출력
			menu=scan.nextInt();	//메뉴 입력받기
			//1~5는 일반메뉴, 6은 프로그램 종료 , 0은 메뉴선택의 끝
			if(menu==6) {
				System.out.println("프로그램 종료");
				break;
			}
			if(menu!=0) {
				if(menu<6) {
					System.out.println("수량> ");
					int cnt=scan.nextInt();
					order.add(menu);
					count.add(cnt);
					fm.sale(menu, cnt);
					System.out.println("주문종료=> 0"+" "+"프로그램 종료=> 6");
				}else {
					System.out.println("잘못된 메뉴입니다.");
				}
			}
			
		}while(menu != 0); // 메뉴종료의 종료시점을 결정
		//메뉴의 전체 금액을 출력. totsum
		System.out.println("----메누확인----");
		for(int i=0;i<order.size();i++) {
			System.out.print(fm.getList1().get(order.get(i)-1)+" ");
			System.out.print(count.get(i)+"개 ");
			int price=fm.getList2().get(order.get(i)-1);
			System.out.println("	"+(price*count.get(i)));
		}
		System.out.println("----------------");
		System.out.println("총 금액: "+fm.getTotsum());
}
}
class FoodManager{
	//멤버변수 ArrayList 메뉴, ArrayList 가격
	//그외 필요한 멤버변수 알아서
	private List<String> list1= new ArrayList<String>();
	private List<Integer> list2= new ArrayList<Integer>();
	private int sum;
	private int totsum;
	
	public FoodManager() {
		add();
	}
	
	
	//메서드
	//출력 : 결과출력, 메뉴출력, add(), sale()
	
	public void printMenu() {
		System.out.println("---Menu---");
		 System.out.println("1.햄버거	7000원");
		 System.out.println("2.피자	15000원");
		 System.out.println("3.음료수	2000원");
		 System.out.println("4.과자	1000원");
		 System.out.println("5.사탕	500원");
		 System.out.println("6.프로그램 종료");
		 System.out.println("메뉴 선택>>");
 
	}

	public void add() {
		//list1 값 추가
		list1.add("햄버거");	//index 0
		list1.add("피자");	//1
		list1.add("음료수");	//2
		list1.add("과자");	//3
		list1.add("사탕");	//4
		
		list2.add(7000);	//index 0
		list2.add(15000);
		list2.add(2000);
		list2.add(1000);
		list2.add(500);
	}
	
	public void sale(int menu,int count) {
		//new list2의 index번호로 사용
		sum = list2.get(menu-1)*count; //하나의 주문에 대한 금액
		totsum +=sum;
		System.out.println("------------");
		System.out.println("주문하신 메뉴는 >"+list1.get(menu-1)+" "+count+"개 입니다");
		System.out.println("금액:"+sum);
		
	}

	public List<String> getList1() {
		return list1;
	}

	public void setList1(List<String> list1) {
		this.list1 = list1;
	}

	public List<Integer> getList2() {
		return list2;
	}

	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTotsum() {
		return totsum;
	}

	public void setTotsum(int totsum) {
		this.totsum = totsum;
	}
}