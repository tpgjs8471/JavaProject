package day17;

import java.util.TreeSet;

public class Set02 {

	public static void main(String[] args) {
		// Set 생성 후
		// 1~45까지 랜덤 수 6개 생성 후 출력
		
		TreeSet<Integer>set=new TreeSet<>();
//		for(int i=1;set.size()<6;i++) {
//			set.add((int)(Math.random()*10)+1);
////			if(set.size()==6){
////			break;
////			}	
//		}
//		System.out.println(set);
		
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
	}
}
