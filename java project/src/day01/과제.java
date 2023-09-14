package day01;

public class 과제 {

	public static void main(String[] args) {
		/* 매일 마지막 시간 과제
		 * 카페에 제출
		 * 국어 영어 수학의 점수 합계와 평균을 출력
		 * 조건선택 연산자 이용
		 * 평균 80이상이면 결과:합격 아니면 결과: 불합격 출력
		 */
		
		 int k = 78;
		 int e = 75;
		 int m= 72;
		 // 지역변수는 반드시 초기화 해야함.
		 int sum=0;
		 double avg =0;
		 sum=k+e+m;
		 avg=sum/3.0; 
		 System.out.println("합계: "+sum+" 평균: "+avg);
		 System.out.println( (avg>=80)? "결과: 합격" : "결과: 불합격"); // 무조건 true : fales 
		 
		/* int sum = k+e+m;
		 double avr = (double)sum/3;
		 System.out.println("합계: "+sum+" 평균: "+avr);
		 System.out.println( (avr>80)? "결과: 합격" : "결과: 불합격"); */
		 
		 // 조건석탠 연사자 => if문은로 변경
		 
		 
		 if(avg>=80) {
			 System.out.println("결과 : 합격");
		 }
		 else {
			 System.out.println("결과 : 불합격");
		 }
		
	}

}
