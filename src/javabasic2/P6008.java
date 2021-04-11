package javabasic2;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class P6008 {
	static Time time = new Time();
	static TimerThread timer = new TimerThread();

	public static void main(String[] args) throws ParseException {
		String currTime = time.getCurrentTime();
		System.out.println(currTime);

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		String endTime = time.getTimer(currTime, input);
		timer.getThread(endTime, input);
	}
}

class Time {
	SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");

	public String getCurrentTime() {

		Date time = new Date();
		String dateAndTime = ft.format(time);
		return dateAndTime;
	}

	public String getTimer(String time, int input) throws ParseException {
		Date time1 = ft.parse(time);

		int pausedTime = input * 1000;
		long calSecond = time1.getTime() + pausedTime;
		String scd = ft.format(calSecond);
		return scd;
	}
}

class TimerThread extends Thread {
	public TimerThread() {

	}

	public static void getThread(String time, int input) throws ParseException {
		try {
			Thread.sleep(input * 1000);
			System.out.println("time is over(" + time + ")");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
