package day20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReader03 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, FileReader를 이용하여 out.txt 파일을
		 * map에 저장하고 , 합계와 총 인원수를 출력
		 * 입력한 값을 읽어들이면 값은 전부 String
		 * 계산을 위해서는 int 자료형으로 변환이 필요
		 * Integer.parseInt(값) : String -> int
		 */
//		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
//		HashMap<String,Integer> map = new HashMap<String,Integer>();
//		while(true) {
//			String line = br.readLine(); //한 라인 읽어오기
//			if(line==null) { //더이상 읽을 라인이 없음.
//				break;
//			}
//			System.out.println(line);
//			map.put(line.substring(0,3), Integer.parseInt(line.substring(4)));
//			
//		}
//		br.close();
//		int sum=0;
//		for(Integer s : map.values()) {
//			sum += s;
//		}
//		System.out.println("합게: "+sum);
//		System.out.println("총 인원 수: "+map.size());
		
		
		//풀이
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		while(true) {
			String line = br.readLine(); //홍길동 89
			if(line == null) {
				break;	// 이 3줄 합친게 (line=br.readLine())!=null
			}
			//substring(포함,미포함)
			String name = line.substring(0,line.indexOf(" "));
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			
			map.put(name, score);
		}
		System.out.println(map);
		int sum=0;
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
			sum+=map.get(key);
		}
		System.out.println("인원 수:"+map.size()+" 합계:"+sum);
	}
}
