package day04;

public class while01 {

	public static void main(String[] args) {
		/* while : 반복문 중 하나.
		 * while(조건식) { //true일때 반복
		 * 실행문;
		 * 증강식;
		 * }
		 */
		
		
		/* 1~10까지 출력
		 * 
		 */
		
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		System.out.println("------------------");
		int i=0;
		while(i<=10) {
			System.out.print(i+ " ");
			i++;
			
		}
		
		System.out.println(" ");
		System.out.println("------------------");
		
		/* 1~10까지 짝수만 출력
		 * while문 사용
		 */
		
		int a=0;
		
		while(a<=10) {
			a++;
			if( a % 2==0) {
				System.out.println(a+ "");
			}
		}
		
		

	}

}
