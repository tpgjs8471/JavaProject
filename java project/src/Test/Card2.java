package Test;


public class Card2 {
	public static void main(String[] args) {
		CarrdPack2 cp=new CarrdPack2();
		int index=0;
		for(int i=0;i<cp.getPack().length;i++) {
			cp.getPack()[i].print();
			index++;
			if(index%13==0) {// 4줄씩 13개씩 출력
				System.out.println();
				
			}
		}
	}
}
