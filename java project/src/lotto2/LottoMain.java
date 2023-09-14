package lotto2;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		
		LottoManager lm = new LottoManager();
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		do {
			lm.printMenu();//메뉴출력 메서드화 (호출)
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: lm.createLotto(scan);
				break;
			case 2: lm.createLottoAuto();
				break;
			case 3: lm.insertLotto(scan);
				break;
			case 4: lm.checkLotto();
				break;
			case 5: lm.printLotto();
				break;
			case 6: break;
				default:
					System.out.println("잘못된 메뉴~!!");
				
			}
			
		}while(menu !=6);
		System.out.println("프로그램 종료");
		
//		Lotto l = new Lotto();
//		l.randomLotto();
//		System.out.println(l);
//		LottoE le = new LottoE();
//		le.randomLotto();
//		System.out.println(le);
//		
//		int arr[] = {1,2,3,4,5,6};
//		l.insertNumbers(arr);
//		System.out.println(l);
//		int arr2[] = {7,13,9,10,11,12,13};
//		le.insertNumbers(arr2);
//		System.out.println(le);
		
		scan.close();

	}

}