package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/*
		 * 하루 일과를 저장하는 list를 생성 <String>
		 */
		List<String> list=new ArrayList<String>();
		
		list.add("아침");
		list.add("점심");
		list.add("저녁");
		
		//일반 for문
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("향샹된 for문>>>");
		//향상된 for문으로 출력
		for(String tmp:list) {
			System.out.print(tmp+" ");
		}
		
		
		//Iterator로 출력
		System.out.println();
		System.out.println(">Iterator 출력");
		Iterator<String> str=list.iterator();
		while(str.hasNext()) { // 다음의 요소값이 있는지 확인
			String tmp=str.next(); //다음요소 가져오기
			System.out.print(tmp+" ");
		}
		System.out.println();
		//Collection.sort(list); 오름차순만 가능
		Collections.sort(list);
		System.out.println(list);
		
		//sort(Comparator C) //오름차순 내림차순 둘다 가능
		list.sort(new Test());
		System.out.println(list);
		

	}

}
class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// comparteTo메서드 사용
		return o2.compareTo(o1); // 내림차순
	}
	
}