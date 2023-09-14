package day02;

public class switch01 {

	public static void main(String[] args) {
		/* switch문 : 값에 따라 케이스를 달리주는 형식
		 * 
		 * switch(변수/식) {
		 * case 값 1 : 실행문1; break;
		 * case 값 2 : 실행문2; break;
		 * case 값 3 : 실행문3; break;
		 * default : 나머지 실행문;
		 * }
		 * 
		 * break;는 switch를 빠져나갈때 사용
		 */
		
	/*	int num =3;
		switch(num) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
			default:
				System.out.println("잘못된입력");
		} */
		
		//1~6 까지의 수를 랜덤으로 추출하여 주사위 : 0 출력
		
		int random= (int)(Math.random()*6)+1;
		
		switch(random) {
		case 1 :
			System.out.println("주사위 :"+random+"칸 전진"); break;
		case 2 :
			System.out.println("주사위 :"+random+"칸 전진"); break;
		case 3 :
			System.out.println("주사위 :"+random+"칸 전진"); break;
		case 4 :
			System.out.println("주사위 :"+random+"칸 전진"); break;
		case 5 :
			System.out.println("주사위 :"+random+"칸 전진"); break;
		case 6 :
			System.out.println("주사위 :"+random+"칸 전진"); break;
		}
		
		
				
	}

}
