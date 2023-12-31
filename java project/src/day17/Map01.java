package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/*
		 * Map
		 * 	-값을 2개저장 , key/value 값으로 저장
		 * 	-key는 중복불가, value는 중복가능
		 * 
		 * HashMap<String,Integer> map= new HashMap<String,Integer>();
		 * Map은 값이 2개여서 Iterator를 map 자체로는 사용불가.
		 * 향상된 for문/Iterator 둘다 set으로 key값 추출 후 사용가능
		 * 
		 * lsit, set => .add();
		 * map => .put() / getKey(), getValue(); 		 
		 */
		
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		map.put("햄버거", 7000);
		map.put("피자", 15000);
		map.put("음료", 2000);
		System.out.println(map);
		System.out.println(map.keySet()); //set
		System.out.println(map.values()); //collection
		
		//key가 햄버거인 가격을 출력
		System.out.println(map.get("햄버거"));
		
		//향상된 for문 =>많이 사용됨
		System.out.println("------향상된 for문출력-------");
		for(String tmp: map.keySet()) {
			System.out.println(tmp+": "+map.get(tmp));
		}
		//Iterator 출력
		System.out.println("------Iterator출력-------");
		Iterator<String>it=map.keySet().iterator();
		while(it.hasNext()) {
			String tmp=it.next();
			System.out.println(tmp+": "+map.get(tmp));
		}
		//entry 출력
		System.out.println("-----entrySet 이용한 출력-------");
		System.out.println(map.entrySet());
		for(Map.Entry<String, Integer> tmp:map.entrySet()) {
			System.out.println(tmp.getKey()+": "+tmp.getValue());
		}
		
		
		

	}

}
