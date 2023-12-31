package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Subject sb=new Subject();
		int menu=-1;
		
		do {
			sb.printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1: sb.insert(scan); break;
			case 2: sb.print(); break;
			case 3: sb.printSub(scan); break;
			case 4: sb.modify(scan); break;
			case 5: sb.delete(scan); break;
			case 6: break;
			default:
				System.out.println("잘못된 메뉴입니다");
			
			}
		}while(menu!=6);
		System.out.println("프로그램 종료");
		
	}
}
class Subject{
	private HashMap<String,Integer>map=new HashMap<>();
	
	public void printMenu() {
		System.out.println("---성적관리프로그램---");
		System.out.println("1.성적추가");
		System.out.println("2.성적조회(전체출력)");
		System.out.println("3.성적조회(과목조회)");
		System.out.println("4.성적수정");
		System.out.println("5.성적삭제");
		System.out.println("6.종료");
	}
	
	public void insert(Scanner scan) {
		System.out.println("과목과 성적을 입력해주세요(ex: 국어 80");
		String subject=scan.next();
		int score=scan.nextInt();
		
		if(score<0||score>100) {
			System.out.println("잘못된 성적입니다");
			return;
			}
		if(map.get(subject)==null) {
			map.put(subject, score);
		}else {
			System.out.println(subject+"는 이미 존재합니다");
		}
	}
	
	public void print() {
		int sum=0;
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			String subject=it.next();
			sum+=map.get(subject);
			System.out.println(subject+": "+map.get(subject));
		}
		System.out.println("합계: "+sum);
		System.out.println("평균: "+(double)sum/map.size());
	}
	
	public void printSub(Scanner scan) {
		System.out.println("조회할 과목 입력");
		String subject=scan.next();
		Integer score=map.get(subject);
		if(score==null) {
			System.out.println(subject+"없는과목입니다");
		}else {
			System.out.println(subject+": "+score);
		}
	}
	
	// 과목수정
	public void modify(Scanner scan) {
		System.out.println("수정할 과목과 성적을 입력: ");
		String subject=scan.next();
		int score=scan.nextInt();
		if(score<0||score>100) {
			System.out.println("잘못된 성적입니다");
			return;
			}
		map.put(subject, score); // key는 중복이 불가하기때문에 기존이있던 key를 덮어씀.
		System.out.println(subject+"과목이 "+score+"로 변경되었습니다.");
	//	map.replace(subject, score);	//이렇게도 가능하다
	}
	
	//성적삭제
	public void delete(Scanner scan) {
		System.out.println("삭제할 과목을 입력해 주세요: ");
		String subject=scan.next();
		if(map.get(subject)==null) {
			System.out.println(subject+"는 없는과목입니다");
		}else {
			map.remove(subject);
			System.out.println(subject+"과목이 삭제되었습니다.");
		}
	}

	
	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	
	
	

}