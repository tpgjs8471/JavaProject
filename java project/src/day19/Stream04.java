package day19;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream04 {

	public static void main(String[] args) {
		// Student 클래스를 가지는 List생성
		// 5명 정도의 값을 추가
		
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("김씨",60));
		list.add(new Student("박씨",50));
		list.add(new Student("정씨",88));
		list.add(new Student("오씨",79));
		list.add(new Student("이씨",98));
		list.add(new Student("양씨",71));
		
		//steam 구성 후 출력
		//toString 존재 할 경우
		list.stream()
		.forEach(System.out::println);
		
		System.out.println("==============");
		
		//toString이 없을 경우
		// 주문 처리가 많을 경우 {} 쓴다.
		list.stream()
		.forEach(n ->{
			String name=n.getName();
			int score=n.getScore();
			System.out.println(name+":"+score);
		});
		
		
		//성적 합계 출력
		int sum=list.stream()
		.mapToInt(n -> n.getScore())
		.sum();
		System.out.println("=======성적합계=======");
		System.out.println(sum);
		
		//점수가 70점 이상인 인원수 출력
		Long count=list.stream().filter(n ->n.getScore()>=70)
		.count();
		System.out.println("=======70점이상=======");
		System.out.println(count);
	}
}

