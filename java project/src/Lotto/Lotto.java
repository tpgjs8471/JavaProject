package Lotto;

import java.util.Scanner;

public class Lotto {
	LottoManager m = new LottoManager();
	//로또 한셋
	int[] lottoNums = new int[6];
	//보너스번호
	int Bonus = 0;
	
	public int[] selectLotto(Scanner scan){
		int num=0;
		for(int i=0; i<lottoNums.length;i++) {
			System.out.println(i+1+"번째" + "숫자를 입력해주세요");	
			 do {
				 System.out.println("중복된번호는 입력할수없습니다.");
	                // 1부터 45 사이의 무작위 번호 생성
				 num = scan.nextInt();
	            } while (m.contains(lottoNums, num)); // 중복 확인
			lottoNums[i] = num;
		}
		return lottoNums;
	}

}
