package day10;

public class CardMain {

	public static void main(String[] args) {
		Cardpack cp=new Cardpack();
		int index=0;
		for(int i=0;i<cp.getPack().length;i++) {
			cp.getPack()[i].print();
			index++;
			if(index%13==0) {// 4줄씩 13개씩 출력
				System.out.println();
			}
		}
		cp.init();
		cp.shuffle();
		System.out.println();
		System.out.println("-----------------------");
		for(int i=0; i<cp.getPack().length; i++) {
			cp.getPack()[i].print();
			index++;
			if(index % 13==0) {
				System.out.println();
				
			}
		}
		
		System.out.println("=====================");
		Card tmp = cp.pick();
		tmp.print();
		System.out.println();
		System.out.println("=-=-==-=-==--=-==--=-=-=-=-");
		cp.pick().print();
		
	}
}



