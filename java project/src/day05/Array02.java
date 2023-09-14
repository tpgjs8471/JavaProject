package day05;

public class Array02 {

	public static void main(String[] args) {
		/*Array 예제
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50사이의 랜덤값을 지정한 후 출력 / Math.random
		 * 
		 */
		int A[]=new int[5];
		
		for(int i=0;i<A.length;i++) {
			
			int B=(int)((Math.random()*50)+1);
			A[i]=B;
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------");

		
		/*오름차순 정렬
		 *  4 37 23 9 43
		 *  4 37 23 9 43 pass1
		 *  4 9 37 23 43 pass2
		 *  4 9 23 37 43 pass3
		 *  4 9 23 37 43 pass4
		 *  
		 *  4 23 9 37 43 pass1
		 *  4 9 23 37 46 pass2
		 */
		
		// 이중for문 필요
		
		for(int i=0;i<A.length;i++) {
			
			for(int j=i+1;j<A.length;j++) {
				
				if(A[i]>A[j]) { //오름차순 , 부등호의 방향에따라 오름차순 내림차순 결정.
					//교환
					int tmp=A[i]; //
					A[i]=A[j]; // 
					A[j]=tmp;//
				}
			}
		}
		//출력
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		
		//형향상된 for문
		System.out.println();
		System.out.println("향상된 for문");
		
		for(int tmp : A) {
			System.out.print(tmp+" ");
		}
		
	}

}
