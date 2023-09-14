package day05;

public class arraycopy {

	public static void main(String[] args) {
		/*
		 * arraycopy : 배열 복사
		 * 객체를 다시 생성해서 값을 복사
		 * 배열은 길이를 가지고 있음.
		 * 한번 정해진 길이는 늘이거나 줄일 수 없다.
		 * 이후 추가/삭제 불가능
		 * 배열의 길이를 늘이거나 줄이고 싶을 경우 배열복사를 통해
		 * 길이를 조절
		 */
		
		int arr[]= new int[3];
		arr[0]=10;
		arr[1]=15;
		arr[2]=20;
		
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("==========================");

		
		int arr1[]=new int[5];
		System.arraycopy(arr, 1, arr1, 1,arr.length-1);
		// 이전배열, 번지, 새배열, 번지, 복사개수
		
//		for(int i=0;i<arr1.length;i++) {
//			arr1[i]=arr[i];
//		}
		for(int tmp:arr1) {
			System.out.print(tmp+" ");
		}
		
		/*
		 * 3개의 값을 담을 수 있는 string 배열 생성 후
		 * 국어 영어 수학 글자를 담은 후 출력 ( 향상된 for문 출력)
		 * 
		 * 5개의 값을 담을 수 있는 string 배열 생성 후
		 * 서화 과학을 추가하여 향상된 for문으로 출력
		 * 
		 */
		
		System.out.println();
		System.out.println("==========================");
		
		String A[]=new String[] {"국어","영어","수학"};
//		A[0]="국어";
//		A[1]="영어";
//		A[2]="수학";
		
		for(String tmp : A) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("==========================");
		
		String[] B=new String[5];
		B[3]="사회";
		B[4]="과학";
		System.arraycopy(A, 0, B, 0,A.length);
		// 이전배열, 번지, 새배열, 번지, 복사개수
		for(String tmp : B) {
			System.out.print(tmp+" ");
		}
		
		
		
		
		
		
	}

}
