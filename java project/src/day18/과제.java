package day18;

import java.util.ArrayList;
import java.util.Scanner;

class Word{
	
	private String word;
	private String mean;
	
	public Word() {};
	public Word(String word,String mean) {
		this.word=word;
		this.mean=mean;
	}
	
	@Override
	public String toString() {
		return "단어:" + word + ", 의미:" + mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
}

class WordManager{
	private ArrayList<Word> listword = new ArrayList<>();
	
	public WordManager() {
		listword.add(new Word("사과","apple"));
		listword.add(new Word("바나나","banana"));
		listword.add(new Word("시간","time"));
	}
	
	//단어 의미 추가
	public void add(Scanner scan) {
		System.out.println("단어");
		String word=scan.next();
		System.out.println("의미");
		String mean=scan.next();
		Word w=new Word(word,mean);
		
		listword.add(w);
		System.out.println("단어:"+word+", 의미:"+mean);
	}
	
	public void printWord() {	//단어장 출력
		System.out.println("---단어장---");
		for(int i=0; i<listword.size(); i++) {
			System.out.println(listword.get(i));
		}
		System.out.println("-----------");
	}
	
}

public class 과제 {

	public static void main(String[] args) {
		/* 단어장
		 * Word 클래스 생성
		 * 
		 * 단어를 추가,출력
		 * 단어:의미
		 * hello : 안녕
		 * apple : 사과
		 * banana : 바나나
		 * 
		 * 단어를 추가,출력(정렬해서 출력)
		 */
		Scanner scan=new Scanner(System.in);
		WordManager word=new WordManager();
		int menu=-1;
		
		do {
			System.out.println("단어장 프로그램");
			System.out.println("1.단어추가 | 2.단어장출력 | 0.종료");
			menu=scan.nextInt();
			
			switch(menu) {
			case 1: word.add(scan);
				break;
			case 2: word.printWord();
				break;
			case 3: System.out.println("프로그램 종료");
				break;
			}
			
		}while(menu!=0);
		
	}

}