package javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HW2P2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String time1 = sc.next();
		String time2 = sc.next();
		
		SimpleDateFormat format = new SimpleDateFormat("HHmmss");
		//date1, date2를 parse()를 통해 Date 포맷으로 변환
		Date time1format = format.parse(time1);		
		Date time2format = format.parse(time2);
		
		long calTimeM = time1format.getTime()-time2format.getTime();
		
		long calTime = Math.abs(calTimeM / 1000);
		
		System.out.println(calTime + "s");	
	}
}
