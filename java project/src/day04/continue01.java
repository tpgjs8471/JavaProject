package day04;

public class continue01 {

	public static void main(String[] args) {
		/* Continue : pass , skip 키워드
		 * 1~10까지 출력 단, 5만 빼고
		 */

		for(int i=1;i<=10;i++) {
			
			if(i==5) {
				continue; //조건에 맞다면 건너뛰기			}
		}
			System.out.print(i+" ");
		
	}
		System.out.println(" ");
		System.out.println("------------------");
		
		/* 1~10까지중 홀수만 출력
		 * 짝수일때 continue를 써서 출력
		 */
		
		for(int i=1;i<=10;i++) {
			
			if(i%2==0) {
				continue; //조건에 맞다면 건너뛰기			}
		}
			System.out.print(i+" ");
		
	}
		
		System.out.println(" ");
		System.out.println("------------------");
		
		
		
		
		
	}
}
