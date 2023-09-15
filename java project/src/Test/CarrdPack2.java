package Test;

public class CarrdPack2 {
	//멤버변수 선언
	private Card[] pack=new Card[52];
	private int cnt=0; //pack배열의 index체크용 (1장빼내는기능)
	
	//생성자 52장의 카드를 모두 생성
	public CarrdPack2() {
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

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}
class Card{
private char shape;  //모양
private int num; //숫자

public Card() {
	shape = '♥';
	num = 1;
}

//print 메서드
public void print() {
	System.out.print(shape);
	switch(num) {
	case 11: System.out.print("J ");
		break;
	case 12: System.out.print("Q ");
		break;
	case 13: System.out.print("K ");
		break;
		default:
			System.out.print(num+" ");
	}
}

public char getShape() {
	return shape;
}

public void setShape(char shape) {
	this.shape = shape;
}

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}


}
