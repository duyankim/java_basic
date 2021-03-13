package javabasic;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Java003P7 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date1 = sc.next();
		String date2 = sc.next();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyymmdd");
		//date1, date2를 parse()를 통해 Date 포맷으로 변환
		Date date1format = format.parse(date1);		
		Date date2format = format.parse(date2);
				
		long calDate = date1format.getTime()-date2format.getTime();
		//변환된 날짜로 연산을 하고 밀리초 단위의 음수값이 나올 수 있기 때문에 long 변수를 만듦
		
		long calDateDays = calDate / (24*60*60*1000);
		//calDate는 밀리초 단위로 계산되어, 초*분*시간*일 단위를 구해 calDate를 나누어 일단위의 calDateDays변수를 만듦
		
		calDateDays= Math.abs(calDateDays)-1;
		//두 날짜의 차이는 음수값이 나올 수 있기 때문에 절댓값으로 바꾸어줌
		
		System.out.println(calDateDays);	
	}
}
