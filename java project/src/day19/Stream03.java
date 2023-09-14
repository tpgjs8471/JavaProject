package day19;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream03 {

	public static void main(String[] args) {
		/* 
		 * 배열에서 짝수만 출력(정렬)
		 * 중복제거 .distinct()
		 */
		
		int[] arr= {4,1,6,3,8,5,2,7,10,9,2,4,6,8,10,3,6,9};
//		IntStream arrStream=Arrays.stream(arr);
//		
//		arrStream
//		.filter(n -> (n%2==0))
//		.sorted()
//		.forEach(System.out::println);
		
		Arrays.stream(arr)
		.filter(n -> n%2==0)
		.sorted()
		.distinct()	//중복제거
		.forEach(a->System.out.print(a+" "));
		System.out.println();
		System.out.println("----------------");
		Arrays.stream(arr)
		.filter(n -> n%2==1)
		.sorted()
		.distinct()	//중복제거
		.forEach(a-> System.out.print(a+" "));
		
		
		System.out.println();
		System.out.println("------배열로 리턴-------");
		//배열로 리턴
		int result[] = Arrays.stream(arr)
				.filter(n->n%2==0)
				.sorted()
				.distinct()
				.toArray(); //배열로 리턴
		for(int tmp: result) {
			System.out.print(tmp+" ");
			
			System.out.println();
			System.out.println("---------reduce-------");
			//reduce() : 계산
		//	int a=1; //초기값
			int sum= Arrays.stream(arr)
					.filter(n->n%2==0)
					.distinct()
					.reduce(1, (a,b)->a*b);
			System.out.println(sum);
			
		}
	}

}
