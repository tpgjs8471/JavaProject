package day05;

public class String02 {

	public static void main(String[] args) {
		/*
		 * 이것이자바다.txt => 파일명과 확장자를 분리하여 출력
		 */
		//split
		String filename="이것이자바다.txt";
		String file=filename.substring(0,filename.indexOf("."));
		System.out.println("file:"+file);
		
		String sux = filename.substring(filename.indexOf("."));
		System.out.println("확장자:"+sux);
		
		
		//contains(str) : 
	}

}
