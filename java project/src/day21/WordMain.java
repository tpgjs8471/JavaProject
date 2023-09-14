package day21;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import day18.Word2;

class WordManager{
	
//	  1.단어등록1 | 2.단어검색1 | 3.단어수정1
//	  4.단어출력1 | 5.단어삭제 | 6.단어파일출력
//	  7.종료
	
	private ArrayList<Word2> listword = new ArrayList<>();
	
	public WordManager() {
		listword.add(new Word2("사과","apple"));
		listword.add(new Word2("바나나","banana"));
		listword.add(new Word2("시간","time"));
		listword.add(new Word2("문","door"));
		listword.add(new Word2("얼음","ice"));
		listword.add(new Word2("자동차","carrrrr(수정확인용)"));
	}	
	
	public void add(Scanner scan) { //단어 의미 추가
		System.out.println("단어");
		String word=scan.next();
		System.out.println("의미");
		String mean=scan.next();
		Word2 w=new Word2(word,mean);
		
		listword.add(w);
		System.out.println("단어:"+word+", 의미:"+mean);
	}
	
	public void serach(Scanner scan) { //검색단어
		System.out.println("검색할 단어>");
		String searchWord=scan.next();
		for(int i=0;i<listword.size();i++) {
			if(listword.get(i).getWord().equals(searchWord)) {
				System.out.println("단어:"+listword.get(i).getWord()+" 의미:"+listword.get(i).getMean());
			}
		}
	}
	
	public void printWord() {	//단어장 출력
		System.out.println("---단어장---");
		for(int i=0; i<listword.size(); i++) {
			System.out.println(listword.get(i));
		}
		System.out.println("-----------");
	}
	
	public void modWord(Scanner scan) {	//단어수정
		System.out.println("수정할 단어>");
		String searchWord=scan.next();
		for(int i=0;i<listword.size();i++) {
			if(listword.get(i).getWord().equals(searchWord)) {
				System.out.println("수정하실 값을 입력하세요(단어/의미)");
				String op=scan.next();
				switch(op) {
				case "단어":
					System.out.println("수정할 단어>");
					String word=scan.next();
					listword.get(i).setWord(word);
					break;
				case "의미":
					System.out.println("수정할 의미>");
					String mean=scan.next();
					listword.get(i).setMean(mean);;
					break;
					default : System.out.println("존재하지 않습니다");
				}
				return;
			}
		}
		System.out.println("단어가 존재하지 않습니다");
	}
	
	public void delWord(Scanner scan) {	// 단어삭제
		System.out.println("삭제할 단어");
		String searchWord=scan.next();
		for(int i=0;i<listword.size();i++) {
			if(listword.get(i).getWord().equals(searchWord)) {
				listword.remove(i);
				System.out.println("단어삭제완료");
			}
		}
	}
	
	public void fileWord() throws IOException {
		FileWriter fw = new FileWriter("단어장.txt");
		for(int i=0;i<listword.size();i++) {
			String data=listword.get(i).toString();
			fw.write(data);
		}
		System.out.println("파일출력완료 확인바람");
		fw.close();
	}
	
}


public class WordMain {

	public static void main(String[] args) throws IOException {
		/* Word package에서 생성한 word 클래스를 사용하여 단어장 프로그램 작성
		 * 
		  1.단어등록 | 2.단어검색 | 3.단어수정
		  4.단어출력 | 5.단어삭제 | 6.단어파일출력
		  7.종료
		 * 
		 * Word class ArrayList로 구성
		 */
		
		WordManager wm = new WordManager();
		Scanner scan = new Scanner(System.in);
		int menu=0;
		
		do {
			System.out.println("단어장 프로그램");
			System.out.println("1.단어등록 | 2.단어검색 | 3.단어수정");
			System.out.println("4.단어출력 | 5.단어삭제 | 6.단어파일출력");
			System.out.println("7. 종료 ");
			System.out.println("메뉴>>");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : wm.add(scan); break;
			case 2 : wm.serach(scan); break;
			case 3 : wm.modWord(scan); break;
			case 4 : wm.printWord(); break;
			case 5 : wm.delWord(scan); break;
			case 6 : wm.fileWord();
			case 7 :  break;
			default : System.out.println("잘못된 메뉴입니다");
			}	
		}while(menu != 7);
		System.out.println("프로그램 종료");
		
	}

}
