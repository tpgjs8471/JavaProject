package Lotto;


public class LottoE extends Lotto{
	Lotto[] l = new Lotto[100];
	LottoManager m = new LottoManager();
	int index = 0;
	
	//배열에 저장
	public int[] insertLottoAuto() {
		l[index] = new Lotto();
		l[index].lottoNums = m.createLottoAuto();
		l[index].Bonus = getBonus(l[index].lottoNums);
		index++;
		return lottoNums;
	}
	
	// 보너스 번호 생성	  
	  public int getBonus(int[] lottoNums) {
	          int bonusNum=0;
	            do {
	                // 1부터 45 사이의 무작위 번호 생성
	            	 bonusNum = (int)(Math.random()*45) + 1;
	            } while (m.contains(lottoNums, bonusNum)); // 중복 확인
	            
	            return bonusNum;
	        }
	  
	  
	  

	       
}
