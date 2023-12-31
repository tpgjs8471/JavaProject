package day15;

public class ExceptionEX01 {

	public static void main(String[] args) {
		
		int arr[]=null;
		try {
			arr=ExceptionEX01.array(-1,1,10); // 배열을 리턴
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	//메서드 생성
	/*
	 * 기능:배열의 길이가 주어지면 길이만큼 배열을 생성하여 배열을 돌려주는 메서드
	 * (size,start,count)
	 * 		배열안에 random값을 채워서 리턴 /1~10사이 start=1, count=10
	 * 		- size<0 예외발동
	 * 		- start<0 예외발동
	 * 		-throw생략 가능
	 */
	
	public static int[] array(int size,int start,int count) {
		
		if(size<0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다");
		}
		if(start<0) {
			throw new RuntimeException("random 시작범위가 0보다 작습니다.");
		}
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=(int)(Math.random()*count)+start;
		}
		return arr;
	}

		

	
	/*
	 * 기능: 배열을 받아서 배열에 랜덤값을 채우는 메서드(arr,start,count)
	 * 		-arr 배열이 null일 경우 예외발생
	 * 		-arr 배열의 길이가 0보다 작을 경우 예외발생
	 */
	
	public void printArr(int[] arr,int start,int count) throws Exception {
		
		
		if(arr == null) {
			throw new Exception("예외발생");
		}
		if(arr.length<0) {
			throw new Exception("배열의 길이가 0보다 작습니다");
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*count)+start;
			}
		}
		
	
	
	
	
	
	
	

}
