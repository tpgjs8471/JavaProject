package day18;

import java.util.Calendar;
import java.util.Date;

public class Calendar01 {

	public static void main(String[] args) {
		/* 날짜 시간 클래스
		 * Date 클래스 : 잘 안쓰는 클래스
		 * Calendar 클래스 사영 -> 추상 클래스
		 * 직접 객체를 생성 할 수 없음.
		 * new 연산자를 통해 객체 구현X
		 * getInstance()를 통해 구현한 인스턴스를 가져올 수 있음.
		 * 
		 * month : (0월~11월) , +1을 통해 값을 구현
		 * day: 1일~31일
		 * week: 1=일, 2=월
		 * ampm : am=0, pm=1
		 */
		
		Date d =new Date();	//직접 객체 생성 가능.
		
		Calendar now =Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		System.out.println(year);
		int month=now.get(Calendar.MONDAY)+1; // 0월 부터 시작이기 때문에 +1
		System.out.println(month);
		int day=now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week=now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		System.out.println("======================");
		
		//hour , minute, second
		int hour=now.get(Calendar.HOUR);
		int minute=now.get(Calendar.MINUTE);
		int second=now.get(Calendar.SECOND);
		int ampm=now.get(Calendar.AM_PM);
		String weekString=null;
		String AP[]= {"오전","오후"};
		switch(week){
			case 1: weekString="일"; break; 
			case 2: weekString="월"; break;
			case 3: weekString="화"; break;
			case 4: weekString="수"; break;
			case 5: weekString="목"; break;
			case 6: weekString="금"; break;
			case 7: weekString="토"; break;
			default: break;
		}
		
		
		
		System.out.println(year+"년 "+month+"월 "+day+"일"+" ("+weekString+")");
		System.out.println(AP[ampm]+" "+hour+":"+minute);
		
		
		
		
	}
}