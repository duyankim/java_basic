package P6003;

import java.util.Calendar;
import java.util.Scanner;

public class Prompt {

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("해 입력");
		int year = sc.nextInt();
		System.out.println("달 입력");
		int month = sc.nextInt();
			
		printCal(year, month);
		sc.close();
	}
	
	public static void printCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstday = cal.get(Calendar.DAY_OF_WEEK);
		int count = 7 - firstday;
		
		System.out.println("Sun \tMon \tTue \tWed \tThu \tFri \tSat");
		
		//first line blank
		for (int k=0; k < firstday-1; k++) {
			System.out.print("\t");
		}
		//first line date
		for (int i=1; i<=count; i++) {
			System.out.printf("%d\t", i);
		}
		
		//next lines date
		count++;
		for (int j=count; j<=lastday; j++) {
			System.out.printf("%d\t", j);
			if (j % 7 == count)
				System.out.println();
		}
	}
}
