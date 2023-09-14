package day05;

public class Array03 {

	public static void main(String[] args) {
		/*
		 * 1~10까지 담고 있는 배열 arr을 생성 후 출력
		 */
		
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("-----------------");
		//내림차순 정렬
		for(int j=0;j<arr.length;j++) {
			for(int k=j;k<arr.length;k++) {
				if(arr[j]<arr[k]) {
					int tmp=arr[j];
					arr[j]=arr[k];
					arr[k]=tmp;
				}
			}
		}
		
		for(int tmp : arr) {
			System.out.print((tmp+" "));
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
		}

	}

}
