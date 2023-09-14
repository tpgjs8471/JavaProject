package day21;

import java.io.IOException;
import java.util.Scanner;

public class 워드메인 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		워드매니저 wm = new 워드매니저();
		int menu=-1;
		
		do {
			wm.printMenu();
			menu=scan.nextInt();
			
			switch(menu) {
			case 1 : wm.insertWord(scan);  break;
			case 2 : wm.searchWord(scan);  break;
			case 3 : wm.modifyWord(scan);  break;
			case 4 : wm.printWord();  	   break;
			case 5 : wm.deleteWord(scan);  break;
			case 6 : wm.fileWord(); 	   break;
			case 7 :   					   break;
			default : System.out.println("잘못된 메뉴");
			}
		}while(menu!=7);

	}

}
