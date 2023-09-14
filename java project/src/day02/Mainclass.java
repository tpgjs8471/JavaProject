package day02;

public class Mainclass {

	public static void main(String[] args) {
		/*Math.method
		 * 반올림 Math.round) :소수점의 자리수를 무조건 0 (남기지않는다)
		 * 올림 Math.ceil , 버림 Math.floor
		 */
		
		double num= 34.666666;
		
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		
		//Math.max 최대값, Math.min 최소값
		System.out.println(Math.max(5, 3));
		System.out.println(Math.min(5, 3));

		//Math.random : 0 과 1사이의 아무값을 리턴
		// 0<=1 random < 1
		// (int)(Math.random()*10)+1 : 1부터 10까지의 정수를 얻는 공식
		System.out.println(Math.random()*10); // 0은 포함하지만 1은 포함하지 않는다.
		System.out.println((int)(Math.random()*10)+1);
		// Int num = (int) (Math.random() * n) + start; > Start부터 시작하는 n개의 정수 중 임의의 정수 하나 랜덤 추출
		
		
	}

}
