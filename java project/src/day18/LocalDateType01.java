package day18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateType01 {

	public static void main(String[] args) {
		/* LocalDateIme : 현재 날짜 시간 처리
		 * LocalTime : 시간만
		 * LocalDate : 날짜만
		 * 
		 */
		
		LocalDateTime today=LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.toString());
		
		String curr = today.toString();
		// T 기준으로 앞에있는 연월일 추출
		String date= curr.substring(0,curr.indexOf("T"));
	//	System.out.println(curr.substring(0, 10));
		System.out.println(date);
		// T 기준으로 뒤에있는 시분초 추출
		String time= curr.substring(curr.indexOf("T")+1,curr.indexOf("."));
		System.out.println(time);
	//	System.out.println(curr.substring(11, 19));
		
		DateTimeFormatter dft=DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dft.format(today));
		
		LocalDateTime sDate= LocalDateTime.of(1997, 10, 22, 8, 30); // 날짜 생성
		System.out.println(sDate.format(dft));
	}

}
