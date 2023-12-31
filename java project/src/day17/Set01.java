package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/*
		 * Set : 순서 보장X => index가 없음
		 * HashSet
		 */
		
		HashSet<String> set = new HashSet<String>();
		set.add("appple");
		set.add("banana");
		set.add("appple");
		set.add("peach");
		set.add("홍길동");
		set.add("이순신");
		System.out.println(set);
		for(String tmp: set) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("======");
		
		Iterator<String>it=set.iterator();
		
		while(it.hasNext()) {
			String tmp=it.next();
			System.out.print(tmp+" ");		
		}
		System.out.println();
		System.out.println("======");
		// Set을 list로 변환 정렬
		List<String> list=new ArrayList<String>(set);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

}
}