package javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Java003P8 {


		public static void main(String[] args) throws ParseException {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String date1 = sc.next();
			long input = sc.nextLong();
			
			SimpleDateFormat format = new SimpleDateFormat("yyyymmdd");
			//date1을 parse()를 통해 Date 포맷으로 변환
			Date date1format = format.parse(date1);		
			
			long calDate = date1format.getTime()+ (input+1) * (24*60*60*1000);
			//변환된 날짜로 연산을 하고 밀리초 단위의 음수값이 나올 수 있기 때문에 long 변수를 만듦
			
			String days = format.format(calDate);
			
			System.out.println(days);	
	}
}
