package Lotto;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	int[] user = new int[6];
	
		
		int menu = 0;
		Lotto lot = new Lotto();
		LottoE e = new LottoE();
		LottoManager m = new LottoManager();
		do {
			System.out.println("----menu----");
			System.out.println("1.로또번호 입력(수동)");
			System.out.println("2.로또번호 입력(자동)");
			System.out.println("3.당첨번호 생성(7자리)");
			System.out.println("4.당첨번호 확인(등수체크)");
			System.out.println("5.당첨번호 리스트 확인");
			System.out.println("6.종료");
			System.out.println(">메뉴입력");
			//메뉴값 입력받기
			menu = scan.nextInt();
			//메뉴에 따른 입력 분기구현
			switch(menu) {
			case 1:
				System.out.println("1.로또번호 입력(수동)");
				user = lot.selectLotto(scan);
				break;
			case 2:
				System.out.println("2.로또번호 입력(자동)");
				user = m.createLottoAuto();
				m.print(user);
				break;
			case 3:
				System.out.println("3.당첨번호 생성(7자리)");
				e.insertLottoAuto();
				m.print(e.l[e.index-1].lottoNums);
				break;
			case 4:
				System.out.println("4.당첨번호 확인(등수체크)");
				int match = m.check(e.l[e.index-1].lottoNums, user);
				System.out.println(match);
				boolean bonuscheck = m.contains(user, e.l[e.index-1].Bonus);
				System.out.println("등수: " + m.prize(match, bonuscheck));
				break;
			case 5:
				System.out.println("5.당첨번호 리스트 확인");
				m.printAll(e);
				break;
			case 6:System.out.println("종료");
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
		
		}while(menu != 6);
		
		System.out.println("프로그램 종료");
		scan.close();
	}

	}


