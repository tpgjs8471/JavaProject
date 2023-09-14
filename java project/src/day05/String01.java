package day05;

public class String01 {

	public static void main(String[] args) {
		/*
		 * String 클래스 = 문자열을 다루는 클래스
		 * String str = new String();
		 * String str="가나다"; // 일반 자료형처럼 이용이 가능
		 * index 0번지 부터 시작
		 * 
		 */
		
		String str="Hello world~!!";
		System.out.println(str);
		
		//charAt(index) : index번지에 이쓴 한글자를 변환
		System.out.println("--charAt--");
		System.out.println(str.charAt(4));
		
		//length : 문자열의 전체 길이
		System.out.println("---length----");
		System.out.println(str.length());
		
		//comareTo(str) : str문자열과 비교하여 같은면 0
		// 사전순으로 앞이면 -1, 뒤면 1 //문자열 정렬시 사용
		System.out.println("--compareTo----");
		System.out.println("b".compareTo("a"));
		System.out.println("b".compareTo("b"));
		System.out.println("b".compareTo("c"));
		
		//concat(str) : 이어붙이기 (+연산자와 같은 의미)
		System.out.println("---concat----");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
		//equals(str) : 두 문자열이 같은지 확인(대소문자 구분)
		// == 주소가 같은지 확인 / equals 내용이 같은지 확인
		System.out.println("---equals---");
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("def"));
		
		//indexOf(str) : 문자의 위치를 찾아주는 기능.
		//찾는 문자가 없으면 -1을 리턴
		System.out.println("---indexOf---");
		System.out.println("abc".indexOf("c"));
		String email= "tpgjs8471@naver.com";
		System.out.println(email.indexOf("@"));
		System.out.println(email.indexOf("."));
		System.out.println(email.lastIndexOf("."));
		
		//substring : 문자열 추출
		System.out.println("---substring---");
		System.out.println(email.substring(0,5));
		//시작번지는 포함, 끝번지는 포함하지 않는다.
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1));

		//trim : 불필요한 공백 제거
		System.out.println("---trim---");
		System.out.println("          hello           world      ".trim());
		
		//replace : 글자 치환
		System.out.println("--replace--");
		System.out.println("Hello wolrd".replace("wolrd", "java"));
		
		//split : 특정값을 기준으로 나누기
		System.out.println("---split---");
		String str1="dog,cat,tiger";
		String[] str2= str1.split(",");
		
		for(String s : str2) {
			System.out.println((s));
		}
		
		System.out.println("-----");
		String num1= "1";
		String num2= "2";
		System.out.println(num1+num2);
		
		//parseInt : 문자를 숫자로 변환
		int num3= Integer.parseInt(num1);
		int num4= Integer.parseInt(num2);
		System.out.println(num3+num4);

	}

}
