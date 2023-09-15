
package day10;

public class Cardpack {

	/*
	 * CardPack 클래스
	 * -카드팩 : 52장의 카드들
	 * 
	 * 멤버변수 : 카드를 52장 담을 수 있는 배열
	 * 셍성자 : 52장의 카드를 모두 생성
	 * 메서드
	 *  카드를 섞는 기능
	 * 	카드를 1장 빼내는 기능
	 * 	카드출력=> Card 클래스의 print 메서드 사용
	 * 	카드 초기화 메서드(원상복구)
	 */
	
	
	
	//멤버변수 선언
	private Card[] pack=new Card[52];
	private int cnt=0; //pack배열의 index체크용 (1장빼내는기능)
	
	//생성자 52장의 카드를 모두 생성
	public Cardpack() {
		// ♥(1~13) ♠(1~13) ♣(1~13) ◆(1~13)
		char shape='♥';
		for(int i=1;i<=4;i++) { //문양
			switch(i) {
			case 1: shape='♥'; break;
			case 2: shape='♠'; break;
			case 3: shape='♣'; break;
			case 4: shape='◆'; break;
			}
			
			for(int j=1;j<=13;j++) { //숫자
				Card c=new Card(); // 카드 1장을 생성
				c.setShape(shape); //문양 입력
				c.setNum(j); //숫자 입력
				pack[cnt]=c; // 문양과숫자를 pack[cnt]에 저장
				cnt++;
			}
		}
	}

	
	
	//메서드
	/*  카드를 섞는 기능
	 * 	카드를 1장 빼내는 기능
	 * 	카드출력=> Card 클래스의 print 메서드 사용
	 *	카드 초기화 메서드(원상복구)
	*/
	
	//섞기
	public void shuffle() {
		for(int i=0;i<pack.length;i++) {
			int a=(int)(Math.random()*52)+0;
			Card tmp=pack[i];
			pack[i]=pack[a];
			pack[a]=tmp;
		}
	}
	
	//1장 빼내기
	//리턴타입 : Card (카드 1장)
	public Card pick() {
		if(cnt==0) {
			return null;
		}
		cnt--;
		return pack[cnt];
	}
	
	//초기화 = cnt만 마지막으로 다시 보내기
	public void init() {
		cnt=52;
	}
	
	//getter/setter
	public Card[] getPack() {
		return pack;
	}
	
	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	
}
