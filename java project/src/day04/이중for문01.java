package day04;

public class 이중for문01 {

	public static void main(String[] args) {
		/* 별찍기
		 * 
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 
		 * 5*5 로 별 찍기
		 */
		
		
		for(int i=1;i<=5;i++) {  // 해당하는 값이 1일때/ 2일때 
			for(int j=1;j<=5;j++) { // 1~5/ 1~5 /
				System.out.print("*");
		}
			System.out.println(); // 별 5개찍고 줄바꿈

	}
		
		System.out.println("-----------------");
		
		/* *	i=1 , j=1
		 * **	i=2, j=2
		 * ***
		 * ****
		 * *****
		 */
		
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
				if(i==j) {
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		
		/*     *	i=1, o=4, *=1
		 *    **	i=2, o=3, *=2
		 *   ***	i=3, o=2, *=3
		 *  ****	i=4, o=1
		 * *****	i=5, o=0
		 */
		
//		for(int a=1;a<=5;a++) {
//			for(int b=4;b>=0;b--) {
//				if(a>b) {
//				System.out.print("*");
//				} else {
//				System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		//if문일 경우
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=5-i) {
					System.out.print(" ");	
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		for(int i=1;i<=5;i++) {
			//공백
		
			for(int j=1;j<=5-i;j++) {
			System.out.print(" ");	
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
