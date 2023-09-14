package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListG {
	 
	
	public static void main(String[] args) {

		List<String> buyList = new ArrayList<String>();
		List<Integer> numList = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		FoodManager1 fm = new FoodManager1();
		
		fm.setMenu();
		while(true) {
		fm.menu();
		int menu = scan.nextInt();
		if(menu == 6) {
			System.out.println("프로그램종료");
			break;
		}
		buyList.add(fm.Menu.get(menu-1));
		numList.add(fm.add(scan));
		fm.sale(scan, buyList, numList);
		
		}
		
		
	}

}
class FoodManager1{
	//멤버변수 ArrayList<String> 메뉴, ArrayList 가격
	
	List<String> Menu = new ArrayList<String>();
	
	List<Integer> Price = new ArrayList<Integer>();
	
	public void menu() {
		
		System.out.println("----메뉴판----");
		System.out.println("메뉴를 골라주세요");
		System.out.println("1.햄버거: 7000");
		System.out.println("2.피자 :15000");
		System.out.println("3.음료수 :2000");
		System.out.println("4.과자: 1000");
		System.out.println("5.사탕: 500");
		System.out.println("6.프로그램 종료");
		System.out.println("매뉴입력>>>");
	}
	
	public void setMenu() {
		Menu.add("햄버거");
		Price.add(7000);
		Menu.add("피자");
		Price.add(15000);
		Menu.add("음료수");
		Price.add(2000);
		Menu.add("과자");
		Price.add(1000);
		Menu.add("사탕");
		Price.add(500);

	}
	
	//메서드
	//출력 : 결과출력, 메뉴출력, add(), sale()
	

	public int add(Scanner scan) {
		System.out.println("수량을 입력해주세요.");
		int num = scan.nextInt();
		return num;
	}
	public void sale(Scanner scan,  List<String> buy,  List<Integer> num) {
		System.out.println("추가주문은 1번, 결제는 0번입니다.");
		int a = scan.nextInt();
		int total = 0;
		int price;
		if(a==0) {
			for(int i=0; i<buy.size();i++) {
			    price = Menu.indexOf(buy.get(i));
			    total += Price.get(price)*num.get(i);
				System.out.println(i+1+"."+buy.get(i)+" "+num.get(i)+"개");
			}
			System.out.println("결제금액:" + total+"원");
		}
	}
}