package day21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import day18.Word2;

public class 워드매니저 {
	private ArrayList<Word2> list = new ArrayList<>();
	
	//메뉴 출력
//	  1.단어등록1 | 2.단어검색1 | 3.단어수정1
//	  4.단어출력1 | 5.단어삭제 | 6.단어파일출력
//	  7.종료
	public 워드매니저() {}
	public void printMenu() {
		System.out.println("단어장 프로그램");
		System.out.println("1.단어등록 | 2.단어검색 | 3.단어수정");
		System.out.println("4.단어출력 | 5.단어삭제 | 6.단어파일출력");
		System.out.println("7.종료");
		System.out.println("-------------");
		System.out.println("메뉴 입력>>");
	}
	
	//기본단어
	public void add() {
		list.add(new Word2("hello","안녕"));
		list.add(new Word2("car","자동차"));
		list.add(new Word2("apple","사과"));
		list.add(new Word2("banana","바나나"));
		list.add(new Word2("cup","컵"));
	}

	public void insertWord(Scanner scan) {
		System.out.println("단어 :");
		String word=scan.next();
		System.out.println("의미 : ");
		String mean=scan.next();
		
		list.add(new Word2(word,mean));
		
	}

	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어>");
		String searchWord=scan.next();
		for(Word2 w : list) {
			if(w.getWord().equals(searchWord)) {
				System.out.println("검색결과>>");
				System.out.println(w);
				return;
			}
		}
		System.out.println("검색결과가 없습니다.");
	}
	
	public void modifyWord(Scanner scan) {
		//단어수정
		System.out.println("검색할 단어>");
		String searchWord=scan.next();
		boolean result=list.remove(new Word2(searchWord,null));
		if(!result) {
			System.out.println("검색단어 없음");
			return;
		}
		System.out.println("수정단어:");
		String newWord = scan.next();
		System.out.println("수정의미:");
		String newMean = scan.next();
		
		Word2 w = new Word2(newWord,newMean);
		list.add(w);			
	}
	
	public void printWord() {
		System.out.println("---단어장---");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------");
		
	}
	
	public void deleteWord(Scanner scan) {
		//단어삭제
		System.out.println("검색할 단어>");
		String searchWord=scan.next();
		boolean result=list.remove(new Word2(searchWord,null));
		if(!result) {
			System.out.println("검색단어 없음");
			return;
		}		
	}
	public void fileWord() throws IOException {
		//파일출력
		FileWriter fs= new FileWriter("word2.txt"); 
		BufferedWriter bw = new BufferedWriter(fs);
		
		StringBuffer sb = new StringBuffer();
		//.append : 데이터 추가
		String data = null;
		sb.append("---단어장---");
		sb.append("\r\n"); //줄바꿈
		Collections.sort(list);
		int cnt=0;
		while(cnt < list.size()) {
			sb.append(list.get(cnt));
			sb.append("\r\n"); // 줄바꿈
			cnt++;
		}
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		bw.close();
		fs.close();
	}
}
