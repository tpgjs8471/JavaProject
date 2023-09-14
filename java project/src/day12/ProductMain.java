package day12;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {

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
		Scanner scan=new Scanner(System.in);
		Product[] Menu=new Product[10];
		
		

		for(int i=0;i<Menu.length;i++) {
			
			System.out.println("메뉴입력");
			String menu=scan.next();
			System.out.println("가격");
			int price=scan.nextInt();
			Menu[i]=new Product();
			Menu[i].PrintMenu(menu, price);
			
			System.out.println("입력을 계속하시겠습니까? ( Y / N )");
			if(scan.next().equals("N")) {
				System.out.println("종료");
				break;
			}
		}
		
		
		System.out.println("----메뉴판----");
		
		for(Product p:Menu) {
			if(p!=null) {
				p.PrintInfo();
			}
		}
		scan.close();
	}
}